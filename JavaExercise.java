//Zadanie 77___________________________________________________

import com.sun.deploy.util.ArrayUtil;
import java.io.FileWriter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.FileNotFoundException;
import java.lang.String;
import java.nio.*;
import java.io.File;
import java.lang.Object;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//WPROWADZENIE SCIEZEK DOSTEPU DO FOLDEROW

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ścieżkę dostępu do folderu z folderami operatów (np. D:\\\\Swiatniki_Gorne): ");
        String scF = input.nextLine();

        System.out.println("Podaj ścieżkę dostępu do pliku TXT z operatami z Excela(np. D:\\\\nazwy.txt): ");
        String scO = input.nextLine();
        System.out.println(scF);

//WCZYTANIE, ZAPIS I WYSWIETLENIE NAZW FOLDEROW Z TABLICY
        File folder = new File(scF);

        String[] oFold = folder.list();
        System.out.println("Lista nazw folderów: ");
            for (String file : oFold)
        {
            System.out.println(file);
        }

//WCZYTANIE, ZAPIS I WYSWIETLENIE NAZW OPERATOW Z PLIKU TXT Z LISTY

        ArrayList<String> oTxt = new ArrayList<>();

            File plik = new File(scO);

            try (Scanner s = new Scanner(new FileReader(plik))) {
            while (s.hasNext()) {
                oTxt.add(s.nextLine());
            }
                System.out.println("\nLista operatów z excela: ");
            for (int i = 0; i < oTxt.size(); i++) {
                System.out.println(oTxt.get(i));
                }

        }

        System.out.println("\n");
//PETLA WPROWADZAJACA KOLEJNO ODCZYTYWANE NAZWY FOLDEROW

            ArrayList<String> braki = new ArrayList<>();//PRZECHOWUJE SPIS NAZW FOLDEROW BEZ ODPOWIEDNIKOW
            int j = 0;
            for(j=0; j<oFold.length; j++) {


                int unikat =0;
                String nazwF = oFold[j];
                nazwF = nazwF.toUpperCase();
                int l = 0;
                System.out.println("Folder: " + nazwF);

//PETLA WPROWADZAJACA KOLEJNO NAZWY OPERATOW Z PLIKU TXT
                for (l = 0; l < oTxt.size(); l++) {
                    String nazwT = oTxt.get(l);
                    System.out.println("TXT: " + nazwT);

//POROWNANIE NAZW OPERATOW Z FOLDEROW I Z PLIKU TXT
                    if(nazwF.equals(nazwT)){
                        unikat =unikat+1;//ZMIENNA ZMIENIA WARTOSC NA >0, GDY WYSTĄPI INNA ODPOWIADAJĄCA JEJ WARTOSC
                    }else{
                        unikat=unikat+0;
                    }
                    //System.out.println("Unikat="+unikat);
                }
                System.out.println("Unikat="+unikat);

//SPRAWDZENIE CZY WARTOSC JEST UNIKATOWA ORAZ ZAPIS DO LISTY
                if(unikat==0){
                    System.out.println("operat bez odpowiednika: "+nazwF);
                    braki.add(nazwF);
                }

            }

//WYSWIETLENIE LISTY FOLDEROW BEZ ODPOWIEDNIKOW W PLIKU TXT

        System.out.println("\nLista prawdopodobnie nieopisanych folderow: ");
        for (int i = 0; i < braki.size(); i++) {
            System.out.println(braki.get(i));
        }

//ZAPIS LISTY BRAKOW DO PLIKU TXT

        System.out.println("\nPodaj ścieżkę dostępu do miejsca zapisu pliku z listą nieopisanych folderów (np. D:\\\\Braki.txt): ");
        String scB = input.nextLine();

        FileWriter writer = new FileWriter(scB);
        for(String str: braki) {
            writer.write(str + System.lineSeparator());
        }
        writer.close();
        System.out.println("\nKoniec. \nProgram wykonała: Karolina Aksamit");

            }

        }


////Zadanie 77___________________________________________________
//
//import com.sun.deploy.util.ArrayUtil;
//
//import java.io.*;
//import java.util.*;
//import java.io.FileNotFoundException;
//import java.lang.String;
//import java.nio.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your sentence: ");
//        String x = input.nextLine();
//        String y = input.nextLine();




////Zadanie 74-76___________________________________________________
//
//import com.sun.deploy.util.ArrayUtil;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.*;
//import java.io.FileNotFoundException;
//import java.lang.String;
//import java.nio.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
////        System.out.println("Enter your numbers (use ',' as a delimiter: ");
////        String x = input.nextLine();
//
//        int[] numbers = new int[10];
//
//        Boolean stat = true;
//        String answ = "";
//        int num = 0;
//        int i = 0;
//
//        while (stat == true){
//            System.out.println("Please, type your number: ");
//            numbers[i] = input.nextInt();
//            i++;
//
//            System.out.println("Do you want to add the next number? Enter: Y/N");
//            answ = input.next();
//            answ = answ.toUpperCase();
//
//
//            if(answ.equals("Y")){
//                stat = true;
//                System.out.println("Next...");
//            } else{
//                stat = false;
//                System.out.println("Close..");
//            }
//
//        }
//
//        int j = numbers.length;
//
//        j--;
//        while(j>=0){
//            System.out.println(numbers[j]);
//            j--;
//        }
//
//
//
//
//    }
//}

////Zadanie 73___________________________________________________
//
//import com.sun.deploy.util.ArrayUtil;
//
//import java.io.*;
//import java.util.*;
//import java.io.FileNotFoundException;
//import java.lang.String;
//import java.nio.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your sentence: ");
//        String x = input.nextLine();
//        String y = input.nextLine();
//
//        int len = x.length();
//        int len1 = y.length();
//        char a = ' ', b = ' ' ;
//
//        if(len>0){
//            a = x.charAt(0);
//        }
//
//        if(len1>0){
//            b = y.charAt(len1-1);
//        }
//
//        System.out.println(Character.toString(a)+Character.toString(b));
//    }
//}




////Zadanie 72___________________________________________________
//
//import com.sun.deploy.util.ArrayUtil;
//
//import java.io.*;
//import java.util.*;
//import java.io.FileNotFoundException;
//import java.lang.String;
//import java.nio.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your sentence: ");
//        String x = input.nextLine(); //next line is ok in case of blank character
//
//        int len = x.length();
//
//        System.out.println(len);
//        if (len>=3) {
//            x = x.substring(3);
//        } else if (len == 1){
//            x = x+"##";
//            }
//        else if (len == 2){
//            x = x+"#";
//        }else{
//            x = "###";
//        }
//
//        System.out.println(x);
//
//
//    }
//}
//
//




////Zadanie 69-71___________________________________________________
//
//import com.sun.deploy.util.ArrayUtil;
//
//import java.io.*;
//import java.util.*;
//import java.io.FileNotFoundException;
//import java.lang.String;
//import java.nio.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your sentence: ");
//        String x = input.next();
//        String y = input.next();
//
//        int len = x.length();
//        x = x.substring(1); //ucięcie do 1 elementu bez niego
//        y = y.substring(3);
//
//        System.out.println(x + y);
//    }
//}
//




////Zadanie 68___________________________________________________
//
//import com.sun.deploy.util.ArrayUtil;
//
//import java.io.*;
//import java.util.*;
//import java.io.FileNotFoundException;
//import java.lang.String;
//import java.nio.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your sentence: ");
//        String x = input.next();
//
//        String a = x.substring(x.length()-3); //substring it is important to take a fragment of the text
//        System.out.println(a+a+a);
//
//    }
//}
//



////Zadanie 67___________________________________________________
//
//import com.sun.deploy.util.ArrayUtil;
//
//import java.io.*;
//import java.util.*;
//import java.io.FileNotFoundException;
//import java.lang.String;
//
//public class Main {
//    public static void main(String[] args) {
//
////        Scanner input = new Scanner(System.in);
////        System.out.println("Enter your sentence: ");
////        String x = input.nextLine();
////
////        String[] words = x.split(" ");
////        System.out.println();
////
////
////        int i = 0;
////        while (i <= words.length-1) {
////            System.out.println(words[i]);
////            i++;
////        }
//
//        String main_string = "Python 3.0";
//        String word = "Tutorial";
//        System.out.println(main_string.substring(0, 7) + word + main_string.substring(6));
//
//    }
//}
//



////Zadanie 66___________________________________________________
//
//
//import java.util.*;
//public class Main {
//    public static void main(String[] args)
//    {
//        int sum = 1;
//        int ctr = 0;
//        int n = 0;
//
//        while (ctr < 100) {
//            n++;
//            if (n % 2 != 0) {
//                // check if the number is even
//                if (is_Prime(n)) {
//                    sum += n;
//                }
//            }
//            ctr++;
//        }
//        System.out.println("\nSum of the prime numbers till 100: "+sum);
//    }
//
//    public static boolean is_Prime(int n) {
//        for (int i = 3; i * i <= n; i+= 2) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}




////Zadanie 65___________________________________________________
//
//
//import java.io.*;
//import java.util.*;
//import java.io.FileNotFoundException;
//import java.lang.String;
//
//public class Main {
//    public static void main(String[] args) {
//
//        int x =7;
//        int y =3;
//        int res =0;
//
//        while(y<=x){
//            res = x - y;
//            y =y*2;
//        }
//
//        System.out.println(res);
//    }
//}




////Zadanie 64___________________________________________________
//
//
//import java.io.*;
//import java.util.*;
//import java.io.FileNotFoundException;
//import java.lang.String;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        boolean m = true;
//        int x =0, y =0;
//        while (m) {
//            System.out.println("Enter first number between 25 to 75: ");
//            x = input.nextInt();
//            System.out.println("Enter second number between 25 to 75: ");
//            y = input.nextInt();
//            if ((x >= 25 && x <= 75) && (y >= 25 && y <= 75)) {
//                m = false;
//            } else {
//                m = true;
//                System.out.println("Wrong number or numbers");
//            }
//        }
//
//        boolean res;
//        if (x % 10 == y % 10 || (x / 10) % 10 == (y / 10) % 10) {
//            res = true;
//        } else {
//            res = false;
//        }
//        System.out.println(x+"   "+y+"   "+res);
//    }
//
//}






////Zadanie 61___________________________________________________
//
//import java.io.*;
//import java.util.*;
//import java.io.FileNotFoundException;
//import java.lang.String;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your sentence: ");
//        String x = input.next();
//
//        int i = 0;
//        String res = "";
//        for(i=x.length()-1; i>=0; i--){
//            System.out.println(x.charAt(i));
//            res +=x.charAt(i);
//        }
//
//        System.out.println(res);
//
//    }
//}





////Zadanie 60___________________________________________________
//
//import java.io.*;
//import java.util.*;
//import java.io.FileNotFoundException;
//import java.lang.String;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your sentence: ");
//        String x = input.nextLine();
//
//        String[] words = x.split("[ ]+");
//
//        System.out.println("Penulimate word: "+words[words.length -2]);
//
//    }
//}



////Zadanie 60___________________________________________________
//
//import java.io.*;
//import java.util.*;
//import java.io.FileNotFoundException;
//import java.lang.String;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your sentence: ");
//        String x = input.nextLine();
//
//        Scanner scan = new Scanner(x);
//
//        int i = 0;
//        int j = 0;
//        String upp = "";
//
//        while (scan.hasNext()) {
//            i++;
//            String word = scan.next(); //przechodzenie do kolejnego wyrazu
//        }
//
//        scan = new Scanner(x);
//        while (scan.hasNext()) {
//            String word1 = scan.next(); //przechodzenie do kolejnego wyrazu
//            j++;
//            //System.out.println(i + " " + j);
//            if (j == i - 1) {
//                System.out.println(word1);
//                //System.out.println(upp = x.charAt(0) + x.substring(1)+" ");}
//            }
//
//
//        }
//    }
//}


//Zadanie 59___________________________________________________

//import java.io.*;
//import java.util.*;
//import java.io.FileNotFoundException;
//import java.lang.String;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input =  new Scanner(System.in);
//        System.out.println("Enter your sentence: ");
//        String x = input.nextLine();
//
//        String upp = "";
//
//        System.out.println(x.toLowerCase());
//
//    }
//}


////Zadanie 58___________________________________________________
//
//import java.io.*;
//import java.util.*;
//import java.io.FileNotFoundException;
//import java.lang.String;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input =  new Scanner(System.in);
//        System.out.println("Enter your sentence: ");
//        String x = input.nextLine();
//
//        Scanner scan = new Scanner(x);
//        String upp = "";
//
//        while(scan.hasNext()){
//            String word  = scan.next(); //przechodzenie do kolejnego wyrazu
//            upp += Character.toUpperCase(word.charAt(0)) + word.substring(1)+" ";
//            //charAt zwraca znak z danego indeksu wyrazu, substring zwraca dany fragment
//
//            System.out.println("upp:"+upp);
//        }
//        System.out.println(upp.trim()); //pozbycie się białych znaków
//    }
//}


////Zadanie 57___________________________________________________
//
//import java.io.*;
//import java.util.*;
//import java.io.FileNotFoundException;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input =  new Scanner(System.in);
//        System.out.println("Enter your number: ");
//        int x = input.nextInt();
//
//       int i =0;
//       int sum = 0;
//        for(i = 1; i<=x; i++){
//            if(x%i == 0){
//                sum+=1;
//            }
//        }
//        System.out.println(sum);
//    }
//}



//Zadanie 56___________________________________________________

//import java.io.*;
//import java.util.*;
//import java.io.FileNotFoundException;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input =  new Scanner(System.in);
//        System.out.println("Enter first number: ");
//        int x = input.nextInt();
//        System.out.println("Enter first number: ");
//        int y = input.nextInt();
//        System.out.println("Enter first number: ");
//        int p = input.nextInt();
//
//        int i =0;
//        int sum =0;
//        for(i= x; i <= y; i++){
//            if(i%p == 0)
//            sum+=1;
//        }
//        System.out.println(sum);
//    }
//}





//Zadanie 54___________________________________________________

//import java.io.*;
//import java.util.*;
//import java.io.FileNotFoundException;
//
//public class Main {
//    public static void main(String[] args) throws FileNotFoundException {
//
//        Scanner input =  new Scanner(System.in);
//        System.out.println("Enter first number: ");
//        int num1 = input.nextInt();
//        System.out.println("Enter first number: ");
//        int num2 = input.nextInt();
//        System.out.println("Enter first number: ");
//        int num3 = input.nextInt();
//
//
//            num1 = num1%10;
//
//            num2 = num2%10;
//
//            num3 = num2%10;
//
//        int i =0;
//        if (num1==num2){
//            i+=1;
//        }
//        if(num2 == num3 ){
//            i+=1;
//        }
//        if(num1 ==num3){
//            i+=1;
//        }
//
//        boolean result;
//
//        System.out.println(i);
//        if (i>=1){
//            result = true;
//        }else{
//            result = false;
//        }
//        System.out.println(result);
//
//    }
//}
//



//Wczytywanie plików_____________________________________________

//import java.io.*;
//import java.util.*;
//import java.io.FileNotFoundException;
//
//public class Main{
//    public static void main(String[] args) throws FileNotFoundException {
//
//        File plik = new  File("C:\\Users\\Karolina\\Desktop\\Programowanie\\a.txt");
//
//        Scanner input = new Scanner(plik);
//
//        System.out.println(input.nextLine());
//
//        String ff = "ojjjj";
//
//        PrintWriter outt = new PrintWriter("C:\\Users\\Karolina\\Desktop\\Programowanie\\b.txt");
//
//        outt.write("kkk");
//        outt.println('\n'+"\r\nojojj");
//        outt.close();
//    }
//
//}


//// ZADANIE_________________________________________________________________
//
//import java.io.*;
//import java.util.*;
//
//public class Main{
//
//    private Scanner x;
//
//    public void openFile(){
//        try{
//            x = new Scanner(new File("C:\\Users\\Karolina\\Desktop\\Programowanie\\a.txt"));
//        }
//        catch(Exception e){
//            System.out.println("could not find file");
//        }
//    }
//
//    public void readFile(){
//
//        while(x.hasNext()){
//            String a = x.nextLine();
//            System.out.printf("%s\n", a);
//        }
//        System.out.println("read");
//    }
//
//    public void closeFile(){
//        x.close();
//    }
//    public static void main(String[] args)  {
//
//        Main r = new Main();
//        r.openFile();
//        r.readFile();
//        System.out.println();
//        r.closeFile();
//
//    }
//}



//// ZADANIE_________________________________________________________________
//// Boolean
//
//import java.math.BigDecimal;
//import java.util.*;
//public class Main {
//
//    public enum Rozmiar {MALY, DUZY};
//
//    public static void main(String[] args) {
//
//        System.out.println(2.0-1.1);
//
//        BigDecimal n = new BigDecimal(2.0);
//        BigDecimal m = new BigDecimal(1.1);
//        //System.out.println(n-m);
//        String cross = "\uD835\uDD6B"; //zbiór liczb całkowitych, podwójna notacja
//        System.out.println("\uD835\uDD6B");
//        System.out.println(Character.isJavaIdentifierPart('c'));
//        System.out.println(Math.floorMod(-3,2));
//       int a =3;
//       int b =8;
//        System.out.println(a+=3.1);
//        System.out.println(a < b ? "a większe" : 200);
//
//        Rozmiar M = Rozmiar.MALY; //ctr+spacja - wyświetlanie zmiennych itp.
//        System.out.println(M);
//
//        String l = "Czesc!";
//        String bb = l.substring(1, 3);
//        System.out.println(bb);
//
//        String all = String.join(";", l, bb);
//        System.out.println(all);
//        int licz = cross.codePointCount(0, cross.length());
//        System.out.println(licz);
//        char u = l.charAt(1);
//        System.out.println(u);//wyświetlanie litery z pozycji
//
//        String mm = l + cross;
//        int i = 0;
//        while(i<mm.length()) {
//            int cp = mm.codePointAt(i);
//            if (Character.isSupplementaryCodePoint(cp)){
//                i+=2;
//            }else{
//                i++;}
//        }
//
//        int[] codePoints = mm.codePoints().toArray();
//        System.out.println(l.codePointAt(0));
//        int ss = l.indexOf('z', 4); //szukanie inndeksu z danym znakiem
//        System.out.println(ss);
//
//        String ln = "Kitku";
//        ln = ln.replace("u", "uuuu");
//        System.out.println(ln);
//
//        String l1 = l.substring(2,5);
//        System.out.println(l1);
//
//        StringBuilder bu = new StringBuilder();
//        bu.append(ln);
//        bu.append(ln);
//        System.out.println(bu);
//
//
//
//
//    }
//}





// ZADANIE 53_________________________________________________________________
// Boolean

//import java.util.*;
//public class Main {
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the first number : ");
//        int x = in.nextInt();
//        System.out.print("Input the second number: ");
//        int y = in.nextInt();
//        System.out.print("Input the third number : ");
//        int z = in.nextInt();
//        System.out.print("The result is: "+test(x, y, z,true));
//        System.out.print("\n");
//    }
//
//    static boolean test(int p, int q, int r, boolean xyz)
//    {
//        if(xyz)
//            return (r > q); //metoda zmienia warunek
//        return (q > p && r > q);
//    }
//}



//// ZADANIE 52_________________________________________________________________
//// Boolean
//
//import java.util.Scanner;
//public class Main {
//
//    public static boolean sum(int num1, int num2, int num3)
//    {
//        return ((num1 + num2) == num3);
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Input first number: ");
//        int num1 = input.nextInt();
//        System.out.println("Input second number: ");
//        int num2 = input.nextInt();
//        System.out.println("Result to check: ");
//        int num3 = input.nextInt();
//
//        boolean x;
//
//        if (num1+num2==num3){
//            x = true;
//        }else{
//            x = false;
//        }
//
//
//        System.out.println(sum(num1, num2, num3));
//
//
//
//    }
//}
//




// ZADANIE 51_________________________________________________________________
// Converting String to Integer

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String x = input.next();
//
//        int res = Integer.parseInt(x);
//        int y = Integer.valueOf(x);
//        System.out.println(y);
//    }
//}




// ZADANIE 49_________________________________________________________________
// Checking if number is even or not

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter your number: ");
//        int x = input.nextInt();
//
//        if (x%2 == 0){
//            System.out.println("Even");
//        }
//        else{
//            System.out.println("Odd");
//        }
//    }
//}


// ZADANIE 48_________________________________________________________________
// Printing odd numbers

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//
//        for(int i = 1; i<=99; i = i+2){
//            System.out.println(i);
//        }
//    }
//}




// ZADANIE 46 i 47_________________________________________________________________
// Displaying the system time
//import java.util.Date;
//import java.text.SimpleDateFormat;
//import java.time.format.DateTimeFormatter;
//import java.time.LocalDateTime;
//import java.util.Calendar;
//import java.util.Date;
//
//import java.util.Scanner;
//import java.io.File;
//public class Main {
//    public static void main(String[] args) {
//        Date data = new Date();
//        System.out.println(data);
//        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis()); //%tc- d\nazwa dnia tygodnia
//
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(dtf.format(now));
//
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
//        Date date = new Date();
//        System.out.println(formatter.format(date));
//
//    }
//}



//ZADANIE 45_________________________________________________________________
// Checking size of the specific file

//import java.util.Scanner;
//import java.io.File;
//public class Main {
//    public static void main(String[] args) {
//    String pathFile = "D:\\Zrzut_1_LG_G6\\K_A_filmiki\\20180920_154824.mp4";
//
//    File plik = new File(pathFile); //file object
//
//    if(plik.exists()){
//        System.out.println(plik.getAbsolutePath()+ " : " + plik.length()); //checking if file exists
//    }
//
//}
//}




//ZADANIE 44_________________________________________________________________
//5+55+555
// %d - Integer; %f - float; %s - String; CONVERTERS

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//
//        int n;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input number: ");
//        n = in .nextInt();
//        System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
//        float a =10;
//        System.out.printf("%.3f",a); //TYLKO printf... zmienia ilość miejsc po przecinku czy konwertuje typy danych
//    }
//}


//Do analizy
//ZADANIE 42_________________________________________________________________
//Displaying your PASSWORD


//import java.io.Console;
//public class Main {
//    public static void main(String[] args) {
//        Console cons;
//        if ((cons = System.console()) != null) {
//            char[] pass_ward = null;
//            try {
//                pass_ward = cons.readPassword("Input your Password:");
//                System.out.println("Your password was: " + new String(pass_ward));
//            } finally {
//                if (pass_ward != null) {
//                    java.util.Arrays.fill(pass_ward, ' ');
//                }
//            }
//        } else {
//            throw new RuntimeException("Can't get password...No console");
//        }
//    }
//}



//ZADANIE 41_________________________________________________________________
//Making list of the available charakters

//import java.util.Scanner;
//
////import java.nio.charset.Charset;
//public class Main {
//    public static void main(String[] args) {
//        int a = 'z'; //pozyskanie wartości numeru char
//        System.out.println(a);
//    }

//}

////ZADANIE 40_________________________________________________________________
////Making list of the available charakters
//
//import java.util.Scanner;
//
//import java.nio.charset.Charset;
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("List of available character sets: ");
//        for (String str : Charset.availableCharsets().keySet()) {
//            System.out.println(str);
//        }
//    }
//}
//



//ZADANIE 39_________________________________________________________________
//Counting everything in a String

//import java.util.Scanner;

//public class Main {
//
//    public static void main(String[] args) {
//        int amount = 0;
//        for(int i = 1; i <= 4; i++){
//            for(int j = 1; j <= 4; j++){
//                for(int k = 1; k <= 4; k++){
//                    if(k != i && k != j && i != j){
//                        amount++;
//                        System.out.println(i + "" + j + "" + k);
//                    }
//                }
//            }
//        }
//        System.out.println("Total number of the three-digit-number is " + amount);
//    }
//}

//Do analizy
//class Main{
//    public static void main(String args[]){
//        char[] a={'1','2','3','4'};
//        String s="";int count=0;
//
//        for(int i=120;i<500;i++){
//            s=String.valueOf(i);
//            //System.out.println("S = "+s);
//
//
//            for(int j:a){
//                //System.out.println("scharAt: "+s.charAt(0));
//                //System.out.println("scharAt: "+s.charAt(1));
//                //System.out.println("scharAt: "+s.charAt(2));
//                //System.out.println("to j: "+j);
//                System.out.println("count: "+count);
//                if(s.charAt(0)==j)count++;
//                else if(s.charAt(1)==j)count++;
//                else if(s.charAt(2)==j)count++;
//            }
//            if(count==3)System.out.println(i);
//            count=0;
//        }
//    }
//}








//Moje źle!
//import java.util.Scanner;
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        int num1 = input.nextInt();
//        System.out.println("Enter the second number: ");
//        int num2 = input.nextInt();
//        System.out.println("Enter the third number: ");
//        int num3 = input.nextInt();
//        System.out.println("Enter the third number: ");
//        int num4 = input.nextInt();
//
//        String[] tab = {Integer.toString(num1), Integer.toString(num2), Integer.toString(num3), Integer.toString(num4)};
//
//        String out = "";
//        int val = 0;
//
//        for (int i = 0; i <= tab.length - 1; i++) {
//            out += tab[i];
//            //System.out.println(out);
//
//            int j = 0;
//            for (j = 0; j <= tab.length - 1; j++) {
//
//                if (tab[i] == tab[j]) {
//                } else {
//                    out += tab[j];
//
//                    int k = 0;
//                    for (k = 0; k <= tab.length - 1; k++) {
//
//                        if ((tab[j] == tab[k]) || (tab[i] == tab[k])) {
//                        } else {
//                            out += tab[k];
//                            out += ";";
//                            val += 1;
//                            break;
//                        }
//                    }
//                }
//
//
//            }
//        }
//
//        System.out.println("Ilość: "+val);
//        System.out.println("Wartości: "+out);
//    }
//}
//



////ZADANIE 38_________________________________________________________________
//Counting everything in a String

//import java.util.Scanner;
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your word to diverse: ");
//        String str = input.nextLine();
//
//        char[] count = str.toCharArray();
//
//        int let = 0, spac = 0, num = 0, oth = 0;
//        for(int i = 0; i<=count.length-1; i++){
//
//            if (count[i] == ' '){
//                spac+=1;
//            }
//            else if(count[i] >= 48 && count[i]<=57){
//                num+=1;
//            }
//            else if((count[i] >= 65 && count[i]<=90) || (count[i] >= 97 && count[i]<=122)){
//                let+=1;
//            }
//            else{
//                oth+=1;
//            }
//
//        }
//        System.out.println("letters: "+let+"\nspaces: "+spac+"\nnumber: "+num+"\nother: "+oth);
//
//    }
//}
//
//
//import java.util.Scanner;
//public class Main {
//
//    public static void main(String[] args) {
//        String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
//        count(test);
//
//    }
//    public static void count(String x){
//        char[] ch = x.toCharArray();
//        int letter = 0;
//        int space = 0;
//        int num = 0;
//        int other = 0;
//        for(int i = 0; i < x.length(); i++){
//            if(Character.isLetter(ch[i])){
//                letter ++ ;
//            }
//            else if(Character.isDigit(ch[i])){
//                num ++ ;
//            }
//            else if(Character.isSpaceChar(ch[i])){
//                space ++ ;
//            }
//            else{
//                other ++;
//            }
//        }
//        System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
//        System.out.println("letter: " + letter);
//        System.out.println("space: " + space);
//        System.out.println("number: " + num);
//        System.out.println("other: " + other);
//    }
//}








////ZADANIE 37_________________________________________________________________
//Reversing a string

//import java.util.Scanner;
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your word to diverse: ");
//        String str = input.nextLine();
//
//        char[] val = str.toCharArray();
//
//        //char [] val2 = new char[val.length];
//        String a = "";
//        for(int i = val.length-1; i>=0;i--){
//            a = a + String.valueOf(val[i]);
//        }
//        System.out.println(a);
//
//    }
//}



////ZADANIE 36_________________________________________________________________
//Computing the distance between two points on the surface of earth
//import java.lang.Math;
//import java.util.Scanner;
//    public class Main {
//
//        static double distance(double x1, double y1, double x2, double y2){
//            double r = 6371.01;
//            return r*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
//        }
//
//
//        public static void main(String[] args) {
//
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter x1: ");
//            double x1 = Math.toRadians(input.nextDouble());
//            System.out.println("Enter y1: ");
//            double y1 = Math.toRadians(input.nextDouble());
//            System.out.println("Enter x2: ");
//            double x2 = Math.toRadians(input.nextDouble());
//            System.out.println("Enter y2: ");
//            double y2 = Math.toRadians(input.nextDouble());
//
//            System.out.println("Wynik: "+distance(x1,y1,x2,y2));
//
//        }
//    }





////ZADANIE 34_________________________________________________________________
//Computing the area of a hexagon

//import java.sql.SQLOutput;
//import java.util.Scanner;
//    public class Main {
//
//
//        double s;
//
//        Main(double s) {
//            this.s = s;
//        }
//
//        double hexagon() {
//
//            return (6* ( Math.pow(s,2)))/(4*Math.tan(Math.PI/6));
//
//        }
//
//        public static void main(String[] args) {
//             Scanner input = new Scanner(System.in);
//             System.out.println("Enter length of a side: ");
//             double len = input.nextDouble();
//
//             Main hex = new Main(len);
//
//             System.out.println(hex.hexagon());
//
//        }
//    }

//import java.sql.SQLOutput;
//import java.util.Scanner;
//    public class Main {
//        public static void main(String[] args) {
//            int a =0b1001;
//            int b =1_000;
//            System.out.println(0x1A.0p2); // 26* 2^2 , a/b - wyświetla 9, 0b lub 0B

        //}


////ZADANIE 33_________________________________________________________________
//Computing sum of the digits

//import java.sql.SQLOutput;
//import java.util.Scanner;
//    public class Main {
//        public static void main(String[] args) {
//
//            Scanner input = new Scanner(System.in);
//            System.out.println ("Enter your number: ");
//            int sum =0, a = input.nextInt();
//            while(a != 0){
//                sum += a%10;
//                a = a/10;
//            }
//            System.out.println(sum);
//        }
//}


////ZADANIE 32_________________________________________________________________
//Comparing two numbers

//import java.sql.SQLOutput;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter first number: ");
//        int a = input.nextInt();
//        System.out.println("Enter second number: ");
//        int b = input.nextInt();
//
//        if (a>b){
//            System.out.println(a+">"+b);
//        }
//        if (b>a){
//            System.out.println(a+"<"+b);
//        }
//        if (a!=b){
//            System.out.println(a+"!="+b);
//        }
//        if (a<=b){
//            System.out.println(a+"<="+b);
//        }
//        if (a>=b){
//            System.out.println(a+">="+b);
//        }
//        if (a==b){
//            System.out.println(a+"="+b);
//        }
//    }
//}






////ZADANIE 31_________________________________________________________________
//If Java installed? Which version?

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//
//        System.out.println("\nJava Version: "+System.getProperty("java.version")); //wersja
//        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
//        System.out.println("Java Home: "+System.getProperty("java.home")); //miejsce instalacji pliku JRE
//        System.out.println("Java Vendor: "+System.getProperty("java.vendor")); //sprzedawca
//        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
//        System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n"); //ścieżka jre, klas
//        System.out.println("Moje: "+System.getProperty("path.separator"));
//        System.out.println("hh");
//
//    }
//    }
//System.getPropoerty

//        Java Version: 1.8.0_71
//        Java Runtime Version: 1.8.0_71-b15
//        Java Home: /opt/jdk/jdk1.8.0_71/jre
//        Java Vendor: Oracle Corporation
//        Java Vendor URL: http://java.oracle.com/
//        Java Class Path: .


////ZADANIE 25_________________________________________________________________
//octal to decimal
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        long octal_num, decimal_num = 0;
//        int i = 0;
//        System.out.print("Input any octal number: ");
//        octal_num = in.nextLong();
//
//        while (octal_num != 0)
//        {
//            decimal_num = (long)(decimal_num + (octal_num % 10) * Math.pow(8, i++)); //reszta z dzielenia przez 10 (0-7)*8^(0-i)
//            octal_num = octal_num / 10; //przejście do kolejnej cyfry
//        }
//        System.out.print("Equivalent decimal number: " + decimal_num+"\n");
//    }
//}


////ZADANIE 24_________________________________________________________________
//binary to octal

//import java.util.*;
//public class Main {
//    public static void main(String[] args)
//    {
//        int binnum, binnum1,rem, decnum=0, quot, i=1, j;
//        int octnum[] = new int[100];
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Input a Binary Number : ");
//        binnum = scan.nextInt();
//        binnum1=binnum;
//
//        while(binnum > 0) //od końca (dzielenie /10)
//        {
//            rem = binnum % 10; //sprawdzenie czy jest 0, czy 1
//            decnum = decnum + rem*i; //obliczanie reszty, która się sumuje
//            //System.out.println(rem);
//            i = i*2; //zmiana potęgi liczby 2
//            binnum = binnum/10; //usunięcie ostatniej cyfry
//        }
//
//        i=1;
//        quot = decnum;
//
//        while(quot > 0)
//        {
//            octnum[i++] = quot % 8; //wyliczanie reszty z dzielenia przez 8, co wstawiamy do tablicy
//            quot = quot / 8; //dzielenie na 8, aby móc zapisać kolejną resztę
//        }
//
//        System.out.print("Equivalent Octal Value of " +binnum1+ " is :");
//        for(j=i-1; j>0; j--)
//        {
//            System.out.print(octnum[j]);
//        }
//        System.out.print("\n");
//
//    }
//}

////ZADANIE 30_________________________________________________________________
//binary to octal

//import java.util.Scanner;
//
//public class Main{
//    public static int hex_to_decimal(String s)
//    {
//        String digits = "0123456789ABCDEF"; //wpisanie liczby hex
//        s = s.toUpperCase(); //zamiana liter na duże
//        int val = 0;
//        for (int i = 0; i < s.length(); i++) //przejście po wszystkich znakach wyrazu
//        {
//            char c = s.charAt(i); // zwracanie pojedyńczych znaków łańcucha char
//            int d = digits.indexOf(c);
//            val = 16*val + d;
//            System.out.println("D i index: "+digits.indexOf(c));
//            System.out.println("Value: "+val);
//        }
//        return val;
//    }
//    public static void main(String args[])
//    {
//        String hexdec_num;
//        int dec_num, i=1, j;
//        int octal_num[] = new int[100];
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input a hexadecimal number: ");
//        hexdec_num = in.nextLine();
//
//        // Convert hexadecimal to decimal
//
//        dec_num = hex_to_decimal(hexdec_num);
//
//        //Convert decimal to octal
//
//        while(dec_num != 0)
//        {
//            octal_num[i++] = dec_num%8;
//            dec_num = dec_num/8;
//        }
//
//        System.out.print("Equivalent of octal number is: ");
//        for(j=i-1; j>0; j--)
//        {
//            System.out.print(octal_num[j]);
//        }
//        System.out.print("\n");
//    }
//}




////ZADANIE 23_________________________________________________________________
//binary to hex

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args)
//    {
//        int[] hex = new int[1000];
//        int i = 1, j = 0, rem, dec = 0, bin;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input a Binary Number: ");
//        bin = in.nextInt();
//
//        while (bin > 0) {
//            rem = bin % 2;
//            dec = dec + rem * i;
//            i = i * 2;
//            bin = bin / 10;
//        }
//        i = 0;
//        while (dec != 0) {
//            hex[i] = dec % 16;
//            dec = dec / 16;
//            i++;
//        }
//        System.out.print("HexaDecimal value: ");
//        for (j = i - 1; j >= 0; j--)
//        {
//            if (hex[j] > 9)
//            {
//                System.out.print((char)(hex[j] + 55)+"\n"); //char ma 127 elementów, 10+55 =65 -> numer 65 = A;
//            } else
//            {
//                System.out.print(hex[j]+"\n");
//            }
//        }
//    }
//}








//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your number: ");
//        String bin = input.next();
//
//        char[] tabBin = bin.toCharArray();
////        int[] tabValue = {1,2,4,8};
//        char[] tabHex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
//
//        int i, num, j=0;
//        int w,x,y,z;
//
//
//        if (tabBin.length%4 !=0) {
//            num = tabBin.length/4+1;
//        }
//        else{
//            num = tabBin.length/4;
//        }
//
//        char[] res = new char[num];
//
//
//        for(i=tabBin.length-1; i>=0; i--){
//
//            if (i>=0){
//                w = Character.getNumericValue(tabBin[i--])* 1;
//            }
//            else{
//                w =0;
//            }
//
//            if (i>=0){
//                x = Character.getNumericValue(tabBin[i--])* 2;
//            }
//            else{
//                x =0;
//            }
//
//            if (i>=0){
//                y = Character.getNumericValue(tabBin[i--])* 4;
//            }
//            else{
//                y =0;
//            }
//
//            if (i>=0){
//                z = Character.getNumericValue(tabBin[i])* 8;
//            }
//            else{
//                z =0;
//            }
//
//            int m = w+x+y+z;
//            //System.out.println("m = "+m);
//            res[j++] = tabHex[m];
//            //System.out.println("tab od m: "+tabHex[m]);
//
//        }
//        int k =res.length;
//        --k;
//        while(k>=0){
//            System.out.println(res[k--]);
//        }
//
//
//        System.out.println();
//
//
//    }
//}


////ZADANIE 22_________________________________________________________________
//binary to decimal

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your number: ");
//        String bin = input.next();
//
//        char[] binary = bin.toCharArray();
//
//        int wyn = 0;
//        int i;
//
//        for(i=binary.length-1; i>=0; i--){
//
//            int pow = (int) Math.pow(2, binary.length - i -1);
//            wyn = wyn + Character.getNumericValue(binary[i])*pow;
//        }
//
////        int j=binary.length;
////        --j;
////        int wynik =0;
////        while(j>=0){
////            wynik = binary[j];
////            System.out.println(binary[j--]);
////        }
//
//        System.out.println("Wyniki: "+wyn);
//    }
//}






////ZADANIE 21_________________________________________________________________
//decimal number to octal

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your number: ");
//        int dec = input.nextInt();
//
//        String[] result = new String[5];
//
//        int rem, i=0;
//
//        while(dec !=0){
//
//            rem = dec % 8;
//            dec = dec/8;
//            System.out.println("reszta: "+rem+'\n'+"całość: "+dec);
//            result[i++] = Integer.toString(rem);
//
//        }
//
//        int j = result.length;
//        --j;
//        while(j>=0) {
//            System.out.println(result[j--]);
//        }
//    }
//}



////ZADANIE 20_________________________________________________________________
//decimal to hexadecimal number

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args)
//    {
//        int dec_num, rem;
//        String hexdec_num="";
//
//        /* hexadecimal number digits */
//
//        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
//
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input a decimal number: ");
//        dec_num = in.nextInt();
//
//        while(dec_num>0)
//        {
//            rem = dec_num%16;
//            hexdec_num = hex[rem] + hexdec_num;
//            dec_num = dec_num/16;
//        }
//        System.out.print("Hexadecimal number is : "+hexdec_num+"\n");
//    }
//}
//





//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args)
//    {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your number: ");
//        int decimal = input.nextInt();
//        int n = decimal;
//        int r;
//        String x = "Aaaaa";
//        String y = "Bbbbb";
//        String[] tab = new String[5];
//        int i =0;
//
//        while(n != 0){
//
//            r = n%16;
//            n = n/16; //int zaokrąglany w dół
//
//            if(n==16){
//                y = "0";
//                tab[i++] = y;
//            }
//
//            if(n>16){
//                if (r == 10){
//                    y = "A";
//                }
//                if (r == 11){
//                    y = "B";
//                }
//                if (r == 12){
//                    y = "C";
//                }
//                if (r == 13){
//                    y = "D";
//                }
//                if (r == 14){
//                    y = "E";
//                }
//                if (r == 15){
//                    y = "F";
//                }
//                if (r >= 0 && r<=9){
//                    y = Integer.toString(r); //konwersja z int na string
//                }
//
//                tab[i++] = y;
//
//            }
//
//            if(n<16) {
//                if (n == 10){
//                    x = "A";
//                }
//                if (n == 11){
//                    x = "B";
//                }
//                if (n == 12){
//                    x = "C";
//                }
//                if (n == 13){
//                    x = "D";
//                }
//                if (n == 14){
//                    x = "E";
//                }
//                if (n == 15){
//                    x = "F";
//                }
//                if (n >= 0 && n<=9){
//                    x = Integer.toString(n); //konwersja z int na string
//                }
//
//
//                if (r == 10){
//                    y = "A";
//                }
//                if (r == 11){
//                    y = "B";
//                }
//                if (r == 12){
//                    y = "C";
//                }
//                if (r == 13){
//                    y = "D";
//                }
//                if (r == 14){
//                    y = "E";
//                }
//                if (r == 15){
//                    y = "F";
//                }
//                if (r >= 0 && r<=9){
//                    y = Integer.toString(r); //konwersja z int na string
//                }
//                System.out.println("wyn: y"+y);
//                System.out.println("wyn x: "+x);
//                tab[i++] = y;
//
//                if(n!=0) {
//                    tab[i++] = x;
//                }
//                n=0;
//            }
//        }
//
//        int j =tab.length;
//        --j;
//        while(j>=0) {
//            System.out.println(tab[j--]);
//        }
//    }
//
//}




////ZADANIE 19_________________________________________________________________
//decimal to binary number
//import com.sun.deploy.util.ArrayUtil;

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args)
//    {
//        int dec_num, rem, quot, i=0, j;
//        int bin_num[] = new int[100];
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Input a Decimal Number : ");
//        dec_num = scan.nextInt();
//
//        quot = dec_num;
//
//        while(quot != 0)
//        {
//            System.out.println("pocz: "+i);
//            bin_num[i++] = quot%2;
//            System.out.println("dalsz:"+i);
//            quot = quot/2;
//        }
//
//        System.out.print("Binary number is: ");
//        System.out.println("ostateczne"+i);
//        System.out.println(bin_num.length);
//
//        for(j=i-1; j>=0; j--)
//        {
//            System.out.print(bin_num[j]);
//        }
//        System.out.print("\n");
//    }
//}



////MOJE
//import java.util.Arrays;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args){
//
//        int decimal1;
//         Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter your decimal number: ");
//        decimal1 = input.nextInt();
//
//        int i;
//
//        for(i=0; Math.pow(2,i) <= decimal1; i++){
//        }
//
//        System.out.println(i);
//
//        int j = (int) i;
//        int n =0;
//        int[] table1 = new int[j];
//
//
//        for(j=i-1; j>=0; j--){
//
//            n = n + (int) Math.pow(2,j);
//            System.out.println("Wynik = "+n+", dla: "+j);
//            int mm = j;
//
//            if(n == decimal1){
//                table1[mm++] = 1;
//                //System.out.println(table1[j]);
//                 j = -1;
//            }
//            else if(n < decimal1){
//                table1[mm++] = 1;
//
//            }
//            else{
//                table1[mm++] = 0;
//                n = n - (int) Math.pow(2,j);
//                //System.out.println(table1);
//            }
//        }
//
//
//            int num =table1.length;
//            --num;
//            while (num >= 0) {
//            System.out.print(table1[num--]);
//            }
//        System.out.println("\n"+Arrays.toString(table1));
//
//    }
//}





////ZADANIE 18_________________________________________________________________

//import java.util.Scanner;

//public class Main {
//    public static void main(String[] args)
//    {
//        String binary1, binary2;
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input first binary number: ");
//        binary1 = in.next();
//        System.out.print("Input second binary number: ");
//        binary2 = in.next();
//
//        int n1 = Integer.parseInt(binary1,2); //zamiana na całkowite z binarnych
//        int n2 = Integer.parseInt(binary2,2);
//        int wyn = n1*n2; //wynik mnożenia 2 liczb całkowitych
//
//        System.out.print("Sum of two binary numbers: "+Integer.toBinaryString(wyn)); //zamiana na binarne wyniku
//
//    }
//}


////ZADANIE 17_________________________________________________________________

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args)
//    {
//        long binary1, binary2;
//        int i = 0, remainder = 0;
//        int[] sum = new int[20];
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input first binary number: ");
//        binary1 = in.nextLong();
//        System.out.print("Input second binary number: ");
//        binary2 = in.nextLong();
//
//        while (binary1 != 0 || binary2 != 0)
//        {
//            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
//            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
//            binary1 = binary1 / 10;
//            binary2 = binary2 / 10;
//        }
//        if (remainder != 0) {
//            sum[i++] = remainder;
//        }
//        --i;
//        System.out.print("Sum of two binary numbers: ");
//        while (i >= 0) {
//            System.out.print(sum[i--]);
//        }
//        System.out.print("\n");
//    }
//}




//import java.util.Scanner;
//public class Main {
//    public static void main(String args[]) {
//
//        int x = 0b10;
//        int y = 0b11;
//        int z = x+y;
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Wpisz:");
//        String n1 = input.next();
//        String n2 = input.next();
//
//        int num1 = Integer.parseInt(n1,2);
//        int num2 = Integer.parseInt(n2,2);
//        int num3 = num1+num2;
//
//        System.out.println(Integer.toBinaryString(num3));
//        //operacje na liczbach BINARNYCH
//
//    }
//}







////ZADANIE 15_________________________________________________________________
//public class Main {
//         public static void main (String args[]) {
//            int a = 10;
//            int b = 20;
//            int temp;
//
//            temp = a;
//            a = b;
//            b = temp;
//
//             System.out.println(b);
//         }
//}
//
////pośrednia zmienna



//ZADANIE 13_________________________________________________________________

//import java.util.Scanner;
//    public class Main {
//        public static void main (String args[]){
//           double a = 100.9981;
//            System.out.printf("%.2f",a);
//        }
//
//    }





//ZADANIE 12_________________________________________________________________
//import sun.font.TrueTypeFont;
//
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.stream.*;

//public class Main {
//    public static void main (String args[]){
//        Scanner input = new Scanner(System.in);

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter first number: ");
//        double n1 = input.nextDouble();
//        System.out.println("Enter second number: ");
//        double n2 = input.nextDouble();
//        System.out.println("Enter third number: ");
//        double n3 = input.nextDouble();
//
//        double[] numbers;
//        numbers = new double[3];
//        numbers[0] = n1;
//        numbers[1] = n2;
//        numbers[2] = n3;
//
//        System.out.println("Result: "+((Arrays.stream(numbers).sum())/numbers.length));

//}

//}


//ZADANIE 11__________________________________________________________________
//import java.util.Scanner;
//import java.lang.Math;
//
//public class Main {
//    public static void main (String args[]){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a radius: ");
//        double r = input.nextDouble();
//
//        double pi = Math.PI;
//
//        System.out.println("Perimeter = "+(2*pi*r));
//        System.out.println("Area = "+(pi*Math.pow(r,2)));
// //BIBLIOTEKA MATH
//
//    }
//}


//Zadanie 8__________________________________________________________
//        System.out.println("   J    a   v     v  a    ");
//        System.out.println("   J   a a   v   v  a a  ");
//        System.out.println("J  J  aaaaa   V V  aaaaa ");
//        System.out.println(" JJ  a     a   V  a     a");


//ZADANIE 7__________________________________________________________
//import java.util.Scanner;
//
//public class Main {
//    public static void main (String args[]){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your number: ");
//        int n = input.nextInt();
//
//        for (int i=1; i<=10; i++){
//            System.out.println(n+" x "+i+" = "+(n*i));
//        }
//
//
//    }
//}


//ZADANIE 5________________________________________________________
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main (String args[]){
//
//    Scanner input = new Scanner(System.in);
//    System.out.println("Enter first number: ");
//
//    double l = input.nextDouble();
//
//    System.out.println("Enter second number: ");
//    double j = input.nextDouble();
//    //input.close();
//
//    System.out.println(l*j);
//
//    //przy wpisywaniu z klawiatury uzywamy input.nextBoolean, next.String
//    }
//}

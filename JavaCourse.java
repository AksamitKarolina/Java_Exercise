package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*
        //1-3
        System.out.println("Hello World");
        System.out.println(1000);
        System.out.println("100"+"*"+"30000");
        System.out.println(100*30000);

        //4
        */
        Scanner input = new Scanner(System.in);
         /*
        System.out.println("Enter a number:");
        int num = input.nextInt();
        System.out.println("The last digit:"+(num%10));

        //5
        System.out.println("Enter the first number to add:");
        int num1 = input.nextInt();
        System.out.println("Enter the second number to add:");
        int num2 = input.nextInt();
        System.out.println("Result:"+(num1+num2));

        //6
        System.out.println("Enter the first number:");
        Double num3 = input.nextDouble();
        System.out.println("Enter the second number (divider):");
        Double num4 = input.nextDouble();
        System.out.println("Result:"+(num3/num4));

        //7
        System.out.println("Enter a radius:");
        Double r = input.nextDouble();
        double circleField = Math.PI*(pow(r,2));
        System.out.println("Result:"+circleField);

        //8  System.out.println(c) - lack of ;
        //9  a = 20; b = 100 - lack of numbers types

        //10
        //long num5 = Long.parseUnsignedLong("12_147_483_647");
        long nuum = 12_147_483_647L;
        System.out.println(nuum);

        //11
        Random rand =  new Random();
        int randNum = rand.nextInt(2) + 1;
        System.out.println(randNum);

        //12
        System.out.println("Enter the first number to change:");
        int num6 = input.nextInt();
        System.out.println("Enter the second number to change:");
        int num7 = input.nextInt();
        int num8 = num6;
        num6 = num7;
        num7 = num8;
        System.out.println("Changed values:"+num6);
        System.out.println("Changed values:"+num7);

        //13

        System.out.println("Enter the first number to get mean value:");
        int num9 = input.nextInt();
        System.out.println("Enter the second number to get mean value:");
        int num10 = input.nextInt();
        System.out.println("Enter the third number to get mean value:");
        int num11 = input.nextInt();
        System.out.println();
        int [] arr = {num9,num10,num11};
        int suum = 0;
        for (int i=0; i<arr.length; i++){
            suum+=arr[i];
        }

        double meanVal = suum/arr.length;
        System.out.println(meanVal);


        String ala = "Ala";
        String ola = "Ola";
        System.out.println(4+2+ala);
        System.out.println(ala+4+2);

        System.out.println(ala.concat(ola));



        System.out.println("Enter your number:");
        int num1 = input.nextInt();

        if (num1>5){
            System.out.println("It's bigger than five");
        }else{System.out.println("It's not bigger than five");}

        if (num1%3 == 0){
            System.out.println("Your number is divided by 3");
        }else{System.out.println("It's not divided by 3, the rest:"+" "+num1);}

        System.out.println("Write a word:");
        String str1 = input.next();
        if (str1.equalsIgnoreCase("Akademia")){
            System.out.println("Yes");
        }else{
            System.out.println("no");
        }

        System.out.println("Write the name:");
        String str2 = input.next();
        if(str2.endsWith("a")){
            System.out.println("Women");
        }else{
            System.out.println("Men");
        }


        System.out.println("Write 3 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int [] arr1 = {num1,num2,num3};
        Arrays.sort(arr1);
        System.out.println(arr1[0]);

        System.out.println("Write a word:");
        String str3 = input.next().toLowerCase();
        int len = str3.length();
        char ch1 = str3.charAt(len-1);
        char ch2 = str3.charAt(0);
        if(ch1 == ch2){
            System.out.println("ok");
        }else{
            System.out.println("not");
        }


        System.out.println("Enter url:");
         String url = input.next();
        if (url.equals("http://www.wp.pl") || url.equals("https://www.wp.pl")){
            System.out.println("Yes");
        }else{
            System.out.println("No");}

        System.out.println("Enter the word to check if there is a \"kajak\": ");
        String kaj = input.next();
        if (kaj.toLowerCase().contains("kajak")){
            System.out.println("yes");
        }else{ System.out.println("No");}

        System.out.println("Enter the ZIP code: ");
        String zip = input.next();
        boolean d0 = Character.isDigit(zip.charAt(0));
        boolean d1 = Character.isDigit(zip.charAt(1));
        char c2 = zip.charAt(2);
        boolean d3 = Character.isDigit(zip.charAt(3));
        boolean d4 = Character.isDigit(zip.charAt(4));
        boolean d5 = Character.isDigit(zip.charAt(5));
        if (d0 && d1 && d3 && d4 && d5 && c2 == '-'){
            System.out.println("yes");
        }else{ System.out.println("No");}


         //String

        String s12 = input.nextLine();
        String [] arr12 = s12.split(" ");
        int len = arr12.length-1;
        for (int i = arr12.length-1; i>=0; i--){
            System.out.println(i+" "+len);
            System.out.println(arr12[i]);
        }
        System.out.println("Write \"Akademia\"");
        String s13 = input.next();
        if (s13.equals("Akademia")){
            System.out.println("good");
            System.out.println(s13.toLowerCase());
        }else{
            System.out.println("bad");}

        System.out.println(s13.charAt(0) == 'a');
        System.out.println(s13.contains("kot"));

        int res = 5;
        int resul = res>2?18:33;
        System.out.println(resul+"wyn");
        if (2>4) res = 6;
        else res =8;
        System.out.println(res);
        */
        System.out.println("Enter the ZIP code: ");
        String zip = input.next();
        int len = zip.length();

        boolean x = true;
        if (len == 6) {

            for (int i = len - 1; i >= 0 && x == true; i--) {

                char toCheck = zip.charAt(i);
                //System.out.println(i+" "+toCheck);
                if (i == 2) {
                    if(toCheck != '-'){
                        x = false;
                        System.out.println("Error");
                    }
                }else{
                    if (toCheck <48 || toCheck >57 ){
                        x = false;
                        System.out.println("Error2");
                    }
                }
            }
        }else {
            System.out.println("Wrong number of chars");
        }

        if (x){
            System.out.println("Your ZIP number is fine!");
        }else{
            System.out.println("Your ZIP number is bad!");
        }

        //String [] zipArr = zip.split("");
        //System.out.println(zipArr[1]);

        int i =0;
        System.out.println(i++);



    }
}

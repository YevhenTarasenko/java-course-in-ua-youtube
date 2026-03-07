package com.java;

import java.util.Scanner;

//    *** lesson 3 ***
//class Main {

//    public static void main(String[] args) {
//        // This is a test comment
//        /*
//        This is one more comment
//         */
//        System.out.println("Hello \\ \" \n\tWorld!");
//    }
//}

//    *** lesson 4 ***
//class Main {
//    public static void main (String[] args) {
//        int num = -5;
//        num = 501;
//        System.out.print("Variable " + num);
//
////        Типи даних
////        byte використовує 1 байта памяті ОЗУ
////        short використовує 2 байта памяті ОЗУ
////        int використовує 4 байта памяті ОЗУ
////        long використовує 8 байта памяті ОЗУ
//
//        byte num1 = 100;
//        short num2 = 150;
//        int num3 = 500000;
//        long num4 = 5000000;
//
////        Числа з крапкою
//        float num5 = 5.505f; // 4 байта
//        double num6 = 5.505555d; // 8байта
//
////        Символи та текст
//        char sym = '*';
//        String word = "Hello";
//


////        Логічний тип даних
//        boolean isHappy = false;
//
//    }
//}

//    *** lesson 5 ***
//class Main {
//    public static void main(String[] arg) {
//        // Scanner scan = new Scanner(System.in);
////        String text = scan.nextLine();
//        // int userNum = scan.nextInt();
//        // System.out.print(userNum);
//
////        Математичні дії
//        int a = 5, b = 10, res;
//        res = a + b;
//        res += 5;
//        res++;
//        System.out.print(res);
//
//    }
//}

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int num1 = scan.nextInt();

        System.out.print("Enter second num: ");
        int num2 = scan.nextInt();

        System.out.print("Sum of first and second number: " + (num1 + num2));
    }
}
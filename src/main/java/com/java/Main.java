package com.java;

import java.sql.SQLOutput;
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

//class Main {
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter first num: ");
//        int num1 = scan.nextInt();
//
//        System.out.print("Enter second num: ");
//        int num2 = scan.nextInt();
//
//        System.out.print("Sum of first and second number: " + (num1 + num2));
//    }
//}


//    *** lesson 6 ***
//class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int user = scan.nextInt();
//        char sym = 't';
//        if(user == 5 || sym == 't') {
//            System.out.println("Number is 5");
//            boolean isHappy = false;
//            if(!isHappy) {
//                System.out.println("Bool is false");
//            }
//        } else if(user == 60)
//            System.out.println("Number is 60");
//        else if(user == 70)
//            System.out.println("Number is 70");
//        else if(user > 100)
//            System.out.println("Number is more 100");
//        else {
//            System.out.println("Number is undefined");
//        }
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int user = scan.nextInt();
//
//        switch(user) {
//            case 5:
//                System.out.println("Number is 5");
//                break;
//            case 50:
//                System.out.println("Number is 50");
//                break;
//            default:
//                System.out.println("Number is undefined");
//        }
//    }
//}

//class Main {
//    public static void main (String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter number 1: ");
//        int a = scan.nextInt();
//
//        System.out.println("Enter math symbol: ");
//        scan.nextLine();
//        char math = scan.nextLine().charAt(0);
//
//        System.out.println("Enter number 2: ");
//        int b = scan.nextInt();
//
//        int res = 0;
//        switch (math) {
//            case '+':
//                res = a + b;
//                System.out.println("Res: " + res);
//                break;
//            case '-':
//                res = a - b;
//                System.out.println("Res: " + res);
//                break;
//            case '*':
//                res = a * b;
//                System.out.println("Res: " + res);
//                break;
//            case '/':
//                if(b == 0)
//                    System.out.println("Error");
//                    else {
//                    res = a / b;
//                    System.out.println("Res: " + res);
//                }
//                break;
//            default:
//                System.out.println("Error");
//        }
//    }
//}

//    *** lesson 7 ***
//class Main {
//    public static void main(String[] args) {
////        цикли
////        for(float i = 100f; i > 0.5f; i /= 2) {
////            System.out.println("Element is " + i);
////        }
//
////        int i = 0;
////        while(i < 10) {
////            System.out.println("Element is " + i);
////            i++;
////        }
//
////        int i = 100;
////        do {
////            System.out.println("Element is " + i);
////            i++;
////        } while (i < 10);
//
//        // Оператори в циклах
//        for (byte i = 1; i <= 10; i++){
//
//            if(i == 8) {
//                break;
//            }
//            if(i %2 == 0) {
//                continue;
//            }
//            System.out.println(i);
//        }
//    }
//}

//    *** lesson 8 ***
//class Main {
////  Масиви даних
//    public static void main(String[] args) {
//        int[] nums = new int[5];
//        nums[0] = 500;
//        nums[1] = 500;
//        nums[2] = 500;
//        nums[3] = 500;
//        nums[4] = 500;
//        System.out.println(nums[0]);
//
////      byte[] num2 = new byte[5];
//        byte[] num2 = {6, 7, 3, 5, 3, -1};
//
////      Масиви та цикли
//        short[] numbers = { 5, 6, 2, 9, 0 };
//        for(int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }
//    }
//}

//class Main {
//    public static void main(String[] arg) {
//        System.out.print("Enter number: ");
//        Scanner scan = new Scanner(System.in);
//        int user_num = scan.nextInt();
//
//        short[] nums = new short[user_num];
//        for(int i = 0; i < user_num; i++){
//            System.out.println("Enter element " + (i + 1) + ":");
//            nums[i] = scan.nextShort();
//        }
//
//        short max_num = nums[0];
//        for(int i = 0; i < user_num; i++){
//            if(nums[i] > max_num) {
//                max_num = nums[i];
//            }
//        }
//
//        System.out.println("Max element: " + max_num);
//
//
//        for(int i = 0; i < user_num; i++){
//            System.out.println(nums[i]);
//        }
//    }
//}

class Main {

//  Багатовимірні масиви
    public static void main(String[] args) {
//        String[][] words = new String[2][2];
        String[][] words2 = {
                {"Hello", "World"},
                {"Hi", "Amigos"}
        };
        System.out.println(words2[1][1]);
    }
}
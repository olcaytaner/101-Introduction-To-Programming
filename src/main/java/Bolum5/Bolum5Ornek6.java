package Bolum5;

import java.util.Scanner;

public class Bolum5Ornek6 {

    public static void printOnes(int ones, boolean isOnePrinted){
        switch (ones){
            case 1:
                if (isOnePrinted){
                    System.out.print("bir");
                }
                break;
            case 2:
                System.out.print("iki");
                break;
            case 3:
                System.out.print("üç");
                break;
            case 4:
                System.out.print("dört");
                break;
            case 5:
                System.out.print("beş");
                break;
            case 6:
                System.out.print("altı");
                break;
            case 7:
                System.out.print("yedi");
                break;
            case 8:
                System.out.print("sekiz");
                break;
            case 9:
                System.out.print("dokuz");
                break;
        }
    }

    public static void printTens(int tens){
        switch (tens){
            case 1:
                System.out.print("on");
                break;
            case 2:
                System.out.print("yirmi");
                break;
            case 3:
                System.out.print("otuz");
                break;
            case 4:
                System.out.print("kırk");
                break;
            case 5:
                System.out.print("elli");
                break;
            case 6:
                System.out.print("altmış");
                break;
            case 7:
                System.out.print("yetmiş");
                break;
            case 8:
                System.out.print("seksen");
                break;
            case 9:
                System.out.print("doksan");
                break;
        }
    }

    public static void print3Digits(int thousands, boolean printWithRule){
        int hundreds = thousands / 100;
        int tens = (thousands / 10) % 10;
        int ones = thousands % 10;
        printOnes(hundreds, false);
        if (hundreds > 0){
            System.out.print("yüz");
        }
        printTens(tens);
        if (printWithRule){
            printOnes(ones, hundreds != 0 || tens != 0);
        } else {
            printOnes(ones, true);
        }
    }

    public static void main(String[] args){
        int thousands, remainder;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer < 1000000: ");
        n = input.nextInt();
        if (n >= 1000000 || n < 0){
            System.out.println("Enter an integer < 1000000");
            return;
        }
        thousands = n / 1000;
        remainder = n % 1000;
        print3Digits(thousands, true);
        if (thousands > 0){
            System.out.print("bin");
        }
        print3Digits(remainder, false);
    }

}

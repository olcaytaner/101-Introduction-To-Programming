package Bolum7;

import java.util.Scanner;

public class Bolum7Ornek5 {

    public static void printOnes(int ones, boolean isOnePrinted){
        String[] arrayOfOnes = {"sıfır", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"};
        if (ones > 0){
            if (ones == 1){
                if (isOnePrinted){
                    System.out.print(arrayOfOnes[ones]);
                }
            } else {
                System.out.print(arrayOfOnes[ones]);
            }
        }
    }

    public static void printTens(int tens){
        String[] arrayOfTens = {"sıfır", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"};
        if (tens > 0){
            System.out.print(arrayOfTens[tens]);
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

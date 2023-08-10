package Bolum6;

import java.util.Scanner;

public class Bolum6Ornek5 {
    public static int numberOfDigits(int n){
        if (n < 10){
            return 1;
        }
        return numberOfDigits(n / 10) + 1;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter an integer: ");
        n = input.nextInt();
        System.out.println("Number of digits: " + numberOfDigits(n));
    }

}

package Bolum7;

import Bolum6.Bolum6Ornek5;

import java.util.Scanner;

public class Bolum7Ornek6 {

    public static int[] digitsOfNumber(int N){
        int[] digits;
        int digitCount = Bolum6Ornek5.numberOfDigits(N);
        digits = new int[digitCount];
        int count = digitCount - 1;
        while (N > 0){
            digits[count] = N % 10;
            count = count - 1;
            N = N / 10;
        }
        return digits;
    }

    public static void main(String[] args){
        int N;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        N = input.nextInt();
        int[] digits = digitsOfNumber(N);
        System.out.println(digits.length);
    }
}

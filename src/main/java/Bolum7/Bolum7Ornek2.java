package Bolum7;

import Bolum6.Bolum6Ornek5;

import java.util.Scanner;

public class Bolum7Ornek2 {

    public static void main(String[] args){
        int N;
        int[] digits;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        N = input.nextInt();
        int digitCount = Bolum6Ornek5.numberOfDigits(N);
        digits = new int[digitCount];
        int count = 0;
        while (N > 0){
            digits[count] = N % 10;
            count = count + 1;
            N = N / 10;
        }
    }

}

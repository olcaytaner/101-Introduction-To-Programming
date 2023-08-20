package Bolum8;

import Bolum7.Bolum7Ornek6;

import java.util.Scanner;

public class Bolum8Ornek1 {

    public static void main(String[] args){
        int N;
        int[][] digits;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        N = input.nextInt();
        digits = new int[N][];
        for (int i = 0; i < N; i++){
            int number = input.nextInt();
            digits[i] = Bolum7Ornek6.digitsOfNumber(number);
        }
    }

}

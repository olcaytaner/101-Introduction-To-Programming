package Bolum7;

import java.util.Scanner;

public class Bolum7Ornek9 {

    public static int[] fibonacciNumbers(int N){
        int[] fibonacciNumbers;
        fibonacciNumbers = new int[N];
        fibonacciNumbers[0] = 1;
        fibonacciNumbers[1] = 1;
        for (int i = 2; i < N; i++){
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }
        return fibonacciNumbers;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter index of Fibonacci: ");
        int N = input.nextInt();
        int[] f = fibonacciNumbers(N);
    }
}

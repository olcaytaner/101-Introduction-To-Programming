package Bolum6;

import java.util.Scanner;

public class Bolum6Ornek8 {

    public static int factorial(int N){
        if (N == 0){
            return 1;
        }
        return factorial(N - 1) * N;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = input.nextInt();
        System.out.println(factorial(N));
    }

}

package Bolum5;

import java.util.Scanner;

public class Bolum5Ornek12 {

    public static int factorial(int N){
        int product = 1;
        for (int i = 1; i <= N; i++){
            product = product * i;
        }
        return product;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter M: ");
        int M = input.nextInt();
        System.out.print("Enter N: ");
        int N = input.nextInt();
        int product1 = factorial(M);
        int product2 = factorial(N);
        int product3 = factorial(M - N);
        int combination = product1 / (product2 * product3);
        System.out.println(combination);
    }

}

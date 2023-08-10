package Bolum6;

import java.util.Scanner;

public class Bolum6Ornek9 {

    public static int combination(int M, int N){
        if (N == 0){
            return 1;
        }
        if (M == N){
            return 1;
        }
        return combination(M - 1, N) + combination(M - 1, N - 1);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter M: ");
        int M = input.nextInt();
        System.out.print("Enter N: ");
        int N = input.nextInt();
        System.out.println(combination(M, N));
    }

}

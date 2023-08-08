package Bolum5;

import java.util.Scanner;

public class Bolum5Ornek14 {

    public static void printLine(int N){
        for (int j = 1; j <= N; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int M = input.nextInt();
        System.out.print("Enter number of columns: ");
        int N = input.nextInt();
        for (int i = 1; i <= M; i++){
            printLine(N);
        }
    }

}

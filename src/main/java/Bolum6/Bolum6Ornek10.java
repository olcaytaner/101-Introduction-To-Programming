package Bolum6;

import java.util.Scanner;

public class Bolum6Ornek10 {

    public static void printLine(int N){
        if (N == 1){
            System.out.println("*");
            return;
        }
        System.out.print("*");
        printLine(N - 1);
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

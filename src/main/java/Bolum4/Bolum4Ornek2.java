package Bolum4;

import java.util.Scanner;

public class Bolum4Ornek2 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int M = input.nextInt();
        System.out.print("Enter number of columns: ");
        int N = input.nextInt();
        for (int i = 1; i <= M; i++){
            for (int j = 1; j <= N; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

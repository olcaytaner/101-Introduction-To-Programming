package Bolum3;

import java.util.Scanner;

public class Bolum3Ornek23 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N:");
        int N = input.nextInt();
        while (N > 1){
            if (N % 2 == 0){
                N = N / 2;
            } else {
                N = 3 * N + 1;
            }
            System.out.println(N);
        }
    }
}

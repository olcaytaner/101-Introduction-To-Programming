package Bolum6;

import java.util.Scanner;

public class Bolum6Ornek6 {

    public static int fibonacci(int N){
        if (N < 3){
            return 1;
        }
        return fibonacci(N - 1) + fibonacci(N - 2);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter index of Fibonacci: ");
        int N = input.nextInt();
        System.out.println(fibonacci(N));
    }

}

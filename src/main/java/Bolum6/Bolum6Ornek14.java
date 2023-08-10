package Bolum6;

import java.util.Scanner;

public class Bolum6Ornek14 {

    public static int sumOfDivisorsHelper(int n, int divisor){
        if (divisor == 0){
            return 0;
        }
        if (n % divisor == 0){
            return sumOfDivisorsHelper(n, divisor - 1) + divisor;
        } else {
            return sumOfDivisorsHelper(n, divisor - 1);
        }
    }
    public static int sumOfDivisors(int n){
        return sumOfDivisorsHelper(n, n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        if (sumOfDivisors(n) == n){
            System.out.println("Perfect");
        } else {
            System.out.println("Not perfect");
        }
    }
}

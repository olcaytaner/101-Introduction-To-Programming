package Bolum6;

import java.util.Scanner;

public class Bolum6Ornek4 {

    public static int sumOfIntegers(int n){
        if (n == 0){
            return 0;
        }
        return sumOfIntegers(n - 1) + n;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sum = sumOfIntegers(n);
        System.out.print("Sum of numbers until " + n + " is: ");
        System.out.println(sum);
    }

}

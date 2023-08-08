package Bolum5;

import java.util.Scanner;

public class Bolum5Ornek7 {

    public static int sumOfIntegers(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
        return sum;
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

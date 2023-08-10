package Bolum6;

import java.util.Scanner;

public class Bolum6Ornek13 {

    public static boolean isPrimeHelper(int number, int divisor){
        if (divisor == 1){
            return true;
        } else {
            if (number % divisor == 0){
                return false;
            } else {
                return isPrimeHelper(number, divisor - 1);
            }
        }
    }

    public static boolean isPrime(int number){
        return isPrimeHelper(number, number - 1);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = input.nextInt();
        boolean isPrime = isPrime(number);
        if (isPrime){
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

}

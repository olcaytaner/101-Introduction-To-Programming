package Bolum5;

import java.util.Scanner;

public class Bolum5Ornek9 {

    public static boolean isPrime(int number){
        boolean prime = true;
        for (int i = 2; i <= number - 1; i++){
            if (number % i == 0){
                prime = false;
                break;
            }
        }
        return prime;
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

package Bolum5;

import java.util.Scanner;

public class Bolum5Ornek8 {

    public static int numberOfDigits(int n){
        int count = 0;
        while (n > 0){
            count = count + 1;
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter an integer: ");
        n = input.nextInt();
        System.out.println("Number of digits: " + numberOfDigits(n));
    }

}

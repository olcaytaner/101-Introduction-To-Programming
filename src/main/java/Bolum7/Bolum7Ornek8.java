package Bolum7;

import Bolum5.Bolum5Ornek9;

import java.util.Scanner;

public class Bolum7Ornek8 {

    public static int[] primeNumbers(int N){
        int[] primes;
        int primeCount = 0;
        for (int i = 2; i <= N; i++){
            if (Bolum5Ornek9.isPrime(i)){
                primeCount++;
            }
        }
        primes = new int[primeCount];
        int index = 0;
        for (int i = 2; i <= N; i++){
            if (Bolum5Ornek9.isPrime(i)){
                primes[index] = i;
                index++;
            }
        }
        return primes;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int N = input.nextInt();
        primeNumbers(N);
    }

}

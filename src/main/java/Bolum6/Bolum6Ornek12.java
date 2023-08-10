package Bolum6;

import Bolum5.Bolum5Ornek12;

import java.util.Scanner;

public class Bolum6Ornek12 {

    public static int powerOfTwo(int n){
        if (n == 0){
            return 1;
        }
        return powerOfTwo(n - 1) * 2;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        double sum = 0.0;
        for (int k = 1; k <= N; k++){
            sum += powerOfTwo(k) / (Bolum5Ornek12.factorial(k) + 0.0);
        }
        System.out.println(sum);
    }

}

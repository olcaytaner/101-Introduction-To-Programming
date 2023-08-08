package Bolum5;

import java.util.Scanner;

public class Bolum5Ornek21 {

    public static int powerOfTwo(int n){
        int product = 1;
        for (int j = 1; j <= n; j++){
            product = product * 2;
        }
        return product;
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

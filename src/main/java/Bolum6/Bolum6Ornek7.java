package Bolum6;

import java.util.Scanner;

public class Bolum6Ornek7 {

    public static double sumOfFormula1(int N){
        if (N == 1){
            return 0;
        }
        return sumOfFormula1(N - 1) + 1.0 / ((N - 1) * N);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("N: ");
        int N = input.nextInt();
        System.out.println(sumOfFormula1(N));
    }

}

package Bolum5;

import java.util.Scanner;

public class Bolum5Ornek11 {

    public static double sumOfFormula1(int N){
        double sum = 0.0;
        for (int i = 1; i <= N - 1; i++){
            sum += 1.0 / (i * (i + 1));
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("N: ");
        int N = input.nextInt();
        System.out.println(sumOfFormula1(N));
    }

}

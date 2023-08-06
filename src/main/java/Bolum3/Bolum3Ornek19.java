package Bolum3;

import java.util.Scanner;

public class Bolum3Ornek19 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("N: ");
        int N = input.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= N - 1; i++){
            sum += 1.0 / (i * (i + 1));
        }
        System.out.println(sum);
    }
}

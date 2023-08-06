package Bolum4;

import java.util.Scanner;

public class Bolum4Ornek13 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        double sum = 0.0;
        for (int k = 1; k <= N; k++){
            int product1 = 1;
            for (int j = 1; j <= k; j++){
                product1 = product1 * 2;
            }
            int product2 = 1;
            for (int j = 1; j <= k; j++){
                product2 = product2 * j;
            }
            double item = product1 / (product2 + 0.0);
            sum += item;
        }
        System.out.println(sum);
    }
}

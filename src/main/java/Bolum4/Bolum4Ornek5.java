package Bolum4;

import java.util.Scanner;

public class Bolum4Ornek5 {

    public static void main(String[] args){
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            int n = i;
            while (n > 0){
                int lastDigit = n % 10;
                sum += lastDigit;
                n = n / 10;
            }
        }
        System.out.println(sum);
    }

}

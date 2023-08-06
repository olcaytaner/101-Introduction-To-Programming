package Bolum3;

import java.util.Scanner;

public class Bolum3Ornek12 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        while (n > 0){
            int lastDigit = n % 10;
            System.out.print(lastDigit + " ");
            n = n / 10;
        }
    }

}

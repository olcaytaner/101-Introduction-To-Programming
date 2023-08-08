package Bolum5;

import java.util.Scanner;

public class Bolum5Ornek2 {

    public static int maxOfThree(int a, int b, int c){
        int large = -1;
        if (a > b && a > c){
            large = a;
        }
        if (b > a && b > c){
            large = b;
        }
        if (c > a && c > b){
            large = c;
        }
        return large;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, c;
        int largest = -1;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        largest = maxOfThree(a, b, c);
        System.out.println(largest);
    }

}

package Bolum2;

import java.util.Scanner;

public class Bolum2Ornek5 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if (a > b && a > c){
            System.out.println(a);
        }
        if (b > a && b > c){
            System.out.println(b);
        }
        if (c > a && c > b){
            System.out.println(c);
        }
    }
}

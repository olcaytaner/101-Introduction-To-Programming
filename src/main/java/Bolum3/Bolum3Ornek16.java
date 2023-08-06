package Bolum3;

import java.util.Scanner;

public class Bolum3Ornek16 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter maximum threshold: ");
        int N = input.nextInt();
        int a, b, c;
        a = 1;
        System.out.println(a);
        b = 1;
        System.out.println(b);
        c = a + b;
        while (c < N){
            System.out.println(c);
            a = b;
            b = c;
            c = a + b;
        }
    }

}

package Bolum2;

import java.util.Scanner;

public class Bolum2Ornek8 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, c;
        int maximum;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        maximum = a;
        if (b > maximum){
            maximum = b;
        }
        if (c > maximum){
            maximum = c;
        }
        System.out.println(maximum);
    }

}

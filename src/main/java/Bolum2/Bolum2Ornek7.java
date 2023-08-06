package Bolum2;

import java.util.Scanner;

public class Bolum2Ornek7 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if (a > b){
            if (a > c){
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b > c){
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }

}

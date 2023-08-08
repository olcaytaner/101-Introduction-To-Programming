package Bolum5;

import java.util.Scanner;

public class Bolum5Ornek3 {

    public static void maxOfThree(int a, int b, int c){
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

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        maxOfThree(a, b, c);
    }

}

package Bolum5;

import java.util.Scanner;

public class Bolum5Ornek10 {

    public static int fibonacci(int N){
        int a, b, c, index;
        if (N < 3){
            return 1;
        }
        a = 1;
        b = 1;
        c = a + b;
        index = 3;
        while (index != N){
            a = b;
            b = c;
            c = a + b;
            index++;
        }
        return c;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter index of Fibonacci: ");
        int N = input.nextInt();
        System.out.println(fibonacci(N));
    }

}

package Bolum7;

import Bolum5.Bolum5Ornek5;

import java.util.Scanner;

public class Bolum7Ornek10 {

    public static int[] februaryDays(int N){
        int[] result;
        result = new int[N];
        for (int i = 0; i < N; i++){
            result[i] = Bolum5Ornek5.daysOfFebruary(i);
        }
        return result;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter current year: ");
        int N = input.nextInt();
        int[] days = februaryDays(N);
    }
}

package Bolum7;

import java.util.Scanner;

public class Bolum7Ornek1 {

    public static void main(String[] args){
        int N;
        int[] numbers;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of integers: ");
        N = input.nextInt();
        numbers = new int[N];
        double sum = 0;
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }
        double average = sum / N;
        double sum2 = 0;
        for (int i = 0; i < numbers.length; i++){
            sum2 += (numbers[i] - average) * (numbers[i] - average);
        }
        System.out.println(Math.sqrt(sum2 / (N - 1)));
    }
}

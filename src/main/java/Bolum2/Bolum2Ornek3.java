package Bolum2;

import java.util.Scanner;

public class Bolum2Ornek3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height;
        double bodyMassIndex;
        int weight;
        System.out.println("Enter your height in m's:");
        height = input.nextDouble();
        System.out.println("Enter your weight in kg's:");
        weight = input.nextInt();
        bodyMassIndex = weight / (height * height);
        if (bodyMassIndex > 30) {
            System.out.println("You are very overweight");
        }
        if (25 < bodyMassIndex && bodyMassIndex < 30) {
            System.out.println("You are overweight");
        }
        if (20 < bodyMassIndex && bodyMassIndex < 25) {
            System.out.println("You are normal");
        }
        if (bodyMassIndex < 20) {
            System.out.println("You are underweight");
        }
    }
}

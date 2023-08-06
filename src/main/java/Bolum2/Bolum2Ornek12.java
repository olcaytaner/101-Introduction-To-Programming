package Bolum2;

import java.util.Scanner;

public class Bolum2Ornek12 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year;
        year = input.nextInt();
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println("29");
                } else {
                    System.out.println("28");
                }
            } else {
                System.out.println("29");
            }
        } else {
            System.out.println("28");
        }
    }
}

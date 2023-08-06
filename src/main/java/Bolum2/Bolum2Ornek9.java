package Bolum2;

import java.util.Scanner;

public class Bolum2Ornek9 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int month;
        System.out.println("Enter month index:");
        month = input.nextInt();
        if (month < 1 || month > 12){
            System.out.println("Wrong input for the month index");
        } else {
            if (month == 2){
                System.out.println(28);
            } else {
                if (month == 4 || month == 6 || month == 9 || month == 11){
                    System.out.println(30);
                } else {
                    System.out.println(31);
                }
            }
        }
    }

}

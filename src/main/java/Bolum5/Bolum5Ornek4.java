package Bolum5;

import java.util.Scanner;

public class Bolum5Ornek4 {

    public static int daysOfMonth(int month){
        if (month == 2){
            return 28;
        } else {
            if (month == 4 || month == 6 || month == 9 || month == 11){
                return 30;
            } else {
                return 31;
            }
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int month;
        System.out.println("Enter month index:");
        month = input.nextInt();
        if (month < 1 || month > 12){
            System.out.println("Wrong input for the month index");
        } else {
            System.out.println(daysOfMonth(month));
        }
    }

}

package Bolum5;

import java.util.Scanner;

public class Bolum5Ornek5 {

    public static int daysOfFebruary(int year){
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    return 29;
                } else {
                    return 28;
                }
            } else {
                return 29;
            }
        } else {
            return 28;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year;
        year = input.nextInt();
        System.out.println(daysOfFebruary(year));
    }

}

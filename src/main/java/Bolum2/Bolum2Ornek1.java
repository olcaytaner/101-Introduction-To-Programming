package Bolum2;

import java.util.Scanner;

public class Bolum2Ornek1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int not;
        not = input.nextInt();
        if (not > 50){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}

package Bolum2;

import java.util.Scanner;

public class Bolum2Ornek4 {

    final static double PI = 3.1415926;

    public static void main(String[] args){
        double radius, area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        radius = input.nextDouble();
        if (radius > 0){
            area = PI * radius * radius;
            System.out.println("Area of the circle:");
            System.out.println(area);
        } else {
            System.out.println("Wrong input: Negative radius is not possible");
        }
    }

}

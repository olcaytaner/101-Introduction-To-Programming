import java.util.Scanner;

public class Bolum1Ornek3 {

    final static double PI = 3.1415926;

    public static void main(String[] args){
        double radius, area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        radius = input.nextDouble();
        area = PI * radius * radius;
        System.out.println("Area of the circle:");
        System.out.println(area);
    }
}

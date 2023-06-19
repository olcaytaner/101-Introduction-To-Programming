import java.util.Scanner;

public class Bolum1Ornek2 {

    public static void main(String[] args){
        Scanner input;
        int number1, number2, sum;
        input = new Scanner(System.in);
        System.out.println("Enter a number");
        number1 = input.nextInt();
        System.out.println("Enter second number");
        number2 = input.nextInt();
        sum = number1 + number2;
        System.out.print("The sum of two numbers is: ");
        System.out.println(sum);
    }
}

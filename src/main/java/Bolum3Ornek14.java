import java.util.Scanner;

public class Bolum3Ornek14 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = input.nextInt();
        boolean prime = true;
        for (int i = 2; i <= number - 1; i++){
            if (number % i == 0){
                System.out.println("Not Prime");
                prime = false;
                break;
            }
        }
        if (prime){
            System.out.println("Prime");
        }
    }
}

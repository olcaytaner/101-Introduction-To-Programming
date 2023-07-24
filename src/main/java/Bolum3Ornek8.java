import java.util.Scanner;

public class Bolum3Ornek8 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.print("Sum of numbers until " + n + " is: ");
        System.out.println(sum);
    }

}

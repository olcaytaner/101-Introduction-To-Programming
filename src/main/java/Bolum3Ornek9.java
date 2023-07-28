import java.util.Scanner;

public class Bolum3Ornek9 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of integers: ");
        int n = input.nextInt();
        int sum = 0;
        int a;
        for (int i = 1; i <= n; i++){
            a = input.nextInt();
            sum = sum + a;
        }
        System.out.println("Sum: " + sum);
    }
}

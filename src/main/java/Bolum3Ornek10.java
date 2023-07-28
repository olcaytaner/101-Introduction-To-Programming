import java.util.Scanner;

public class Bolum3Ornek10 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int a;
        a = input.nextInt();
        while (a > 0){
            sum = sum + a;
            a = input.nextInt();
        }
        System.out.println("Sum: " + sum);
    }
}

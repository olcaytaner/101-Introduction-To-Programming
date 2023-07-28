import java.util.Scanner;

public class Bolum3Ornek13 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        int count = 0;
        System.out.print("Enter an integer: ");
        n = input.nextInt();
        while (n > 0){
            count = count + 1;
            n = n / 10;
        }
        System.out.println("Number of digits: " + count);
    }
}

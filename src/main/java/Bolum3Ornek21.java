import java.util.Scanner;

public class Bolum3Ornek21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n - 1; i++){
            if (n % i == 0){
                sum = sum + i;
            }
        }
        if (sum == n){
            System.out.println("Perfect");
        } else {
            System.out.println("Not perfect");
        }
    }

}

import java.util.Scanner;

public class Bolum3Ornek22 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = input.nextInt();
        int prime = 2;
        while (N > 1){
            if (N % prime == 0){
                N = N / prime;
                System.out.print(prime + " ");
            } else {
                prime = prime + 1;
            }
        }
    }
}

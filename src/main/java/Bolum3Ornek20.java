import java.util.Scanner;

public class Bolum3Ornek20 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter M: ");
        int M = input.nextInt();
        System.out.print("Enter N: ");
        int N = input.nextInt();
        int product1 = 1;
        for (int i = 1; i <= M; i++){
            product1 = product1 * i;
        }
        int product2 = 1;
        for (int i = 1; i <= N; i++){
            product2 = product2 * i;
        }
        int product3 = 1;
        for (int i = 1; i <= M - N; i++){
            product3 = product3 * i;
        }
        int combination = product1 / (product2 * product3);
        System.out.println(combination);
    }
}

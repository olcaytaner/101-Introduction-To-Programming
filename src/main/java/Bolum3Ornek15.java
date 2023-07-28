import java.util.Scanner;

public class Bolum3Ornek15 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number M:");
        int M = input.nextInt();
        System.out.print("Enter number N:");
        int N = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= M; i++){
            if (i % N == 0){
                continue;
            }
            sum = sum + i;
        }
        System.out.println(sum);
    }

}

import java.util.Scanner;

public class Bolum4Ornek7 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n + 1; i++){
            if (i <= n){
                System.out.println("*");
            } else {
                for (int j = 1; j <= n; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

}

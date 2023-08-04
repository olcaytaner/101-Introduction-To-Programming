import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Bolum4Ornek4 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int a = 1; a <= sqrt(N); a++){
            for (int b = 1; b <= sqrt(N); b++){
                if (a * a + b * b == N){
                    System.out.println(a + ":" + b);
                }
            }
        }
    }

}

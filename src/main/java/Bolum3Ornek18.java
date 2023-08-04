import java.util.Scanner;

public class Bolum3Ornek18 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int max = 0;
        int number = input.nextInt();
        while (number > 0){
            if (number > max){
                max = number;
            }
            number = input.nextInt();
        }
        System.out.println("Maximum: " + max);
    }
}

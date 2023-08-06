package Bolum4;

public class Bolum4Ornek6 {

    public static void main(String[] args){
        for (int number = 2; number <= 1000; number++){
            boolean prime = true;
            for (int i = 2; i <= number - 1; i++){
                if (number % i == 0){
                    prime = false;
                    break;
                }
            }
            if (prime){
                System.out.println(number);
            }
        }
    }
}

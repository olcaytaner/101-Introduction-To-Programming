package Bolum5;

public class Bolum5Ornek16 {

    public static boolean isPrime(int number){
        boolean prime = true;
        for (int i = 2; i <= number - 1; i++){
            if (number % i == 0){
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args){
        for (int number = 2; number <= 1000; number++){
            if (isPrime(number)){
                System.out.println(number);
            }
        }
    }
}

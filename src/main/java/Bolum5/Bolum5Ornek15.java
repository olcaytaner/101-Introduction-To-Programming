package Bolum5;

public class Bolum5Ornek15 {

    public static int sumOfDigits(int n){
        int sum = 0;
        while (n > 0){
            int lastDigit = n % 10;
            sum += lastDigit;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args){
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            sum += sumOfDigits(i);
        }
        System.out.println(sum);
    }
}

package Bolum6;

public class Bolum6Ornek11 {

    public static int sumOfDigits(int n){
        if (n < 10){
            return n;
        }
        return sumOfDigits(n / 10) + n % 10;
    }

    public static void main(String[] args){
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            sum += sumOfDigits(i);
        }
        System.out.println(sum);
    }
}

package Bolum6;

public class Bolum6Ornek2 {
    public static void printReverse(int N){
        if (N == 1){
            System.out.println(1);
            return;
        }
        System.out.println(N);
        printReverse(N - 1);
    }

    public static void main(String[] args){
        printReverse(5);
    }

}

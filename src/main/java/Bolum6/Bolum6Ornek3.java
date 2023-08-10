package Bolum6;

public class Bolum6Ornek3 {

    public static void print(int N){
        if (N == 1){
            System.out.println(1);
            return;
        }
        print(N - 1);
        System.out.println(N);
    }

    public static void main(String[] args){
        print(5);
    }

}

package Bolum7;

public class Bolum7Ornek7 {

    public static int maxOfArray(int[] elements){
        int max = elements[0];
        for (int i = 1; i < elements.length; i++){
            if (elements[i] > max){
                max = elements[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] a = {3, 4, 6, 2};
        System.out.println(maxOfArray(a));
    }
}

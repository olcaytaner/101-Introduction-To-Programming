package Bolum7;

public class Bolum7Ornek13 {

    public static boolean search(int[] array, int key){
        for (int i = 0; i < array.length; i++){
            if (array[i] == key){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] array1 = {3, 5, 2, 1, 6, 7};
        boolean a = search(array1, 2);
        System.out.println(a);
    }

}

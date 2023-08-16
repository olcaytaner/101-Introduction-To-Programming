package Bolum7;

public class Bolum7Ornek14 {

    public static int search(int[] array, int key){
        for (int i = 0; i < array.length; i++){
            if (array[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] array1 = {3, 5, 2, 1, 6, 7};
        int index = search(array1, 1);
        System.out.println(index);
    }

}

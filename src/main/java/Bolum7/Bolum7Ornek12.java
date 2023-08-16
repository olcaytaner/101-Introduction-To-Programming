package Bolum7;

public class Bolum7Ornek12 {

    public static void dummySort(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    Bolum7Ornek11.swapElements(array, i, j);
                }
            }
        }
    }

    public static void main(String[] args){
        int[] array1 = {3, 5, 2, 1, 6, 7};
        dummySort(array1);
    }

}

package Bolum7;

public class Bolum7Ornek11 {

    public static void swapElements(int[] array, int index1, int index2){
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public static void selectionSort(int[] array){
        for (int j = 0; j < array.length - 1; j++){
            int min = array[j];
            int minIndex = j;
            for (int i = j + 1; i < array.length; i++){
                if (array[i] < min){
                    min = array[i];
                    minIndex = i;
                }
            }
            swapElements(array, minIndex, j);
        }
    }

    public static void main(String[] args){
        int[] array1 = {3, 5, 2, 1, 6, 7};
        selectionSort(array1);
    }
}

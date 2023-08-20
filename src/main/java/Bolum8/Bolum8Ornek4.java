package Bolum8;

import Bolum7.Bolum7Ornek11;

public class Bolum8Ornek4 {

    public static void sort2DArray(int[][] array){
        for (int i = 0; i < array.length; i++){
            Bolum7Ornek11.selectionSort(array[i]);
        }
    }

    public static void main(String[] args){
        int[][] a = {{3, 4, 6, 2}, {1, 6, 2, 12}, {3, 9, 8, 2}};
        sort2DArray(a);
    }

}

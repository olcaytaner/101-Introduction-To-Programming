package Bolum8;

public class Bolum8Ornek6 {

    public static int search(int[][] array, int key){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] == key){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[][] a = {{3, 4, 6, 2}, {1, 6, 2, 12}, {3, 9, 8, 2}};
        System.out.println(search(a, 2));
    }
}

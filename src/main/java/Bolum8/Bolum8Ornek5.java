package Bolum8;

public class Bolum8Ornek5 {

    public static boolean search(int[][] array, int key){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] == key){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[][] a = {{3, 4, 6, 2}, {1, 6, 2, 12}, {3, 9, 8, 2}};
        boolean found = search(a, 12);
        System.out.println(found);
    }
}

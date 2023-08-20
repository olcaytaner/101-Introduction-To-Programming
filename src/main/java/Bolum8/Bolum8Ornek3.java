package Bolum8;

public class Bolum8Ornek3 {

    public static int maxOfArray(int[][] elements){
        int max = elements[0][0];
        for (int i = 0; i < elements.length; i++){
            for (int j = 0; j < elements[i].length; j++){
                if (elements[i][j] > max){
                    max = elements[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[][] a = {{3, 4, 6, 2}, {1, 6, 2, 12}, {3, 9, 8, 2}};
        System.out.println(maxOfArray(a));
    }

}

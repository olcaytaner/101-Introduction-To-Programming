package Bolum8;

public class Bolum8Ornek9 {

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2){
        int[][] matrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[i].length; j++){
                matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrix;
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2){
        int[][] matrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[i].length; j++){
                matrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return matrix;
    }

    public static void main(String[] args){
        int[][] matrix1 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int[][] matrix2 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        Bolum8Ornek7.printMatrix(matrix1);
        System.out.println();
        Bolum8Ornek7.printMatrix(matrix2);
        System.out.println();
        int[][] matrix3 = addMatrices(matrix1, matrix2);
        Bolum8Ornek7.printMatrix(matrix3);
        int[][] matrix4 = subtractMatrices(matrix1, matrix2);
        Bolum8Ornek7.printMatrix(matrix4);
    }
}

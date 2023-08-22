package Bolum8;

import java.util.Scanner;

public class Bolum8Ornek7 {

    public static int[][] readMatrix(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rowCount = input.nextInt();
        System.out.println("Enter number of columns");
        int columnCount = input.nextInt();
        int[][] matrix = new int[rowCount][columnCount];
        for (int i = 0; i < rowCount; i++){
            for (int j = 0; j < columnCount; j++){
                System.out.print("Enter cell " + i + " " + j + ":");
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            System.out.print(matrix[i][0]);
            for (int j = 1; j < matrix[i].length; j++){
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] matrix = readMatrix();
        printMatrix(matrix);
    }
}

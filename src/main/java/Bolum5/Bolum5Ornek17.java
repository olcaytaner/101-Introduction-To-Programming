package Bolum5;

import java.util.Scanner;
public class Bolum5Ornek17 {

    public static void printTwoStarsWithSpaceBetween(int N){
        System.out.print("*");
        for (int j = 1; j <= N; j++){
            System.out.print(" ");
        }
        System.out.println("*");
    }

    public static void main(String[] args){
        int rowCount, columnCount;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter number of rows: ");
            rowCount = input.nextInt();
        }while (rowCount % 2 == 0 || rowCount < 3);
        do{
            System.out.println("Enter number of columns: ");
            columnCount = input.nextInt();
        }while (columnCount < 3);
        for (int i = 1; i <= rowCount; i++){
            if (i == rowCount / 2 + 1){
                Bolum5Ornek14.printLine(columnCount);
            } else {
                printTwoStarsWithSpaceBetween(columnCount - 2);
            }
        }
    }

}

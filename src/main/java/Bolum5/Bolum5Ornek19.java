package Bolum5;

import java.util.Scanner;

public class Bolum5Ornek19 {

    public static void printSpacesAndStar(int N){
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
        }while (rowCount < 2);
        do{
            System.out.println("Enter number of columns: ");
            columnCount = input.nextInt();
        }while (columnCount % 2 == 0 || columnCount < 3);
        for (int i = 1; i <= rowCount; i++){
            if (i == 1){
                Bolum5Ornek14.printLine(columnCount);
            } else {
                printSpacesAndStar(columnCount / 2);
            }
        }
    }

}

package Bolum5;

import java.util.Scanner;

public class Bolum5Ornek18 {

    public static void main(String[] args){
        int rowCount, columnCount;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter number of rows: ");
            rowCount = input.nextInt();
        }while (rowCount % 2 == 0 || rowCount < 5);
        do{
            System.out.println("Enter number of columns: ");
            columnCount = input.nextInt();
        }while (columnCount < 2);
        for (int i = 1; i <= rowCount; i++){
            if (i == 1 || i == rowCount || i == rowCount / 2 + 1){
                Bolum5Ornek14.printLine(columnCount);
            } else {
                System.out.println("*");
            }
        }
    }

}

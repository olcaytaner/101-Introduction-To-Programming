package Bolum4;

import java.util.Scanner;

public class Bolum4Ornek10 {

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
                for (int j = 1; j <= columnCount; j++){
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= columnCount / 2; j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }

}

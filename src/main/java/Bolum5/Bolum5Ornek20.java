package Bolum5;

import java.util.Scanner;

public class Bolum5Ornek20 {

    public static void main(String[] args){
        int rowCount;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter number of rows: ");
            rowCount = input.nextInt();
        }while (rowCount % 2 == 0 || rowCount < 3);
        for (int i = 1; i <= rowCount; i++){
            if (i == rowCount / 2 + 1){
                Bolum5Ornek14.printLine(2);
            } else {
                if (i < rowCount / 2 + 1){
                    Bolum5Ornek17.printTwoStarsWithSpaceBetween(rowCount / 2 - i + 1);
                } else {
                    Bolum5Ornek17.printTwoStarsWithSpaceBetween(i - rowCount / 2 - 1);
                }
            }
        }
    }

}

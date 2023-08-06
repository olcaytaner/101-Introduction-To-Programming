package Bolum4;

import java.util.Scanner;

public class Bolum4Ornek11 {

    public static void main(String[] args){
        int rowCount;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter number of rows: ");
            rowCount = input.nextInt();
        }while (rowCount % 2 == 0 || rowCount < 3);
        for (int i = 1; i <= rowCount; i++){
            if (i == rowCount / 2 + 1){
                System.out.println("**");
            } else {
                if (i < rowCount / 2 + 1){
                    System.out.print("*");
                    for (int j = 1; j <= rowCount / 2 - i + 1; j++){
                        System.out.print(" ");
                    }
                    System.out.println("*");
                } else {
                    System.out.print("*");
                    for (int j = 1; j <= i - rowCount / 2 - 1; j++){
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
            }
        }
    }

}

package Bolum8;

import java.util.Scanner;

public class Bolum8Ornek2 {

    public static void main(String[] args){
        int languageIndex;
        String[][] daysOfWeek = {{"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"},
                {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}};
        System.out.println("Enter language (0 for Turkish, 1 for English): ");
        Scanner input = new Scanner(System.in);
        do{
            languageIndex = input.nextInt();
        } while (languageIndex < 0 || languageIndex > 1);
        for (int i = 0; i < 7; i++){
            System.out.println(daysOfWeek[languageIndex][i]);
        }
    }

}

import java.util.Scanner;

public class Bolum2Ornek10 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int month;
        System.out.println("Enter month index:");
        month = input.nextInt();
        if (month < 1 || month > 12){
            System.out.println("Wrong input for the month index");
        } else {
            switch (month){
                case 2:
                    System.out.println(28);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(30);
                    break;
                default:
                    System.out.println(31);
                    break;
            }
        }
    }

}

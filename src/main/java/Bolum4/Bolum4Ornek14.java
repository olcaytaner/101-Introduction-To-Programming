package Bolum4;

public class Bolum4Ornek14 {

    public static void main(String[] args){
        for (int i = 0; i <= 23; i++){
            if (i == 12){
                break;
            }
            for (int j = 0; j <= 59; j++){
                System.out.println(i + ":" + j);
            }
        }
    }
}

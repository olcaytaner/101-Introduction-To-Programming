package Bolum4;

public class Bolum4Ornek16 {

    public static void main(String[] args){
        for (int i = 0; i <= 23; i++){
            if (i == 15){
                break;
            }
            for (int j = 0; j <= 59; j++){
                System.out.println(i + ":" + j);
                if (i == 14 && j == 56){
                    break;
                }
            }
        }
    }

}

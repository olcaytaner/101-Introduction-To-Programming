package Bolum4;

public class Bolum4Ornek15 {

    public static void main(String[] args){
        for (int i = 0; i <= 23; i++){
            if (i == 6 || i == 13){
                continue;
            }
            for (int j = 0; j <= 59; j++){
                System.out.println(i + ":" + j);
            }
        }
    }

}

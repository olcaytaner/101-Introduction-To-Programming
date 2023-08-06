package Bolum4;

public class Bolum4Ornek17 {

    public static void main(String[] args){
        boolean flag = false;
        for (int i = 0; i <= 23; i++){
            for (int j = 0; j <= 59; j++){
                System.out.println(i + ":" + j);
                if (i == 14 && j == 56){
                    flag = true;
                    break;
                }
            }
            if (flag == true){
                break;
            }
        }
    }

}

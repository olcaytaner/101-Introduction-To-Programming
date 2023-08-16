package Bolum7;

public class Bolum7Ornek15 {

    public static int[] search(int[] array, int key){
        int[] result;
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == key){
                count++;
            }
        }
        result = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == key){
                result[index] = i;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] array1 = {3, 5, 2, 1, 6, 7, 1, 3, 5, 3, 2, 7, 6, 1, 3};
        int[] indexArray = search(array1, 8);
    }

}

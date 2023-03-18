package _29_8_2022_Diziler_Arrays;

public class secondBiggestElement {
    //    int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
//    Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
    public static void main(String[] args) {
        int[] array = {15, 25, 22, 18, 30};
        int enb = 0;
        int max;
        int[] scArray = new int[array.length - 1];
        for (int i = 0; i < array.length; i+=2)
            for (int j = 1; j < array.length; j+=2) {
                max = Math.max(array[i], array[j]);
                if (max > enb)
                    enb = max;
            }

        for (int i = 0, k = 0; i < array.length; i++) {
            if (array[i] == enb)
                continue;
            scArray[k++] = array[i];
        }
        enb = 0;
        for (int i = 0; i < scArray.length; i+=2)
            for (int j = 1; j < scArray.length; j+=2) {
                max = Math.max(scArray[i], scArray[j]);
                if (max > enb)
                    enb = max;
            }
        System.out.println(enb);
    }
}

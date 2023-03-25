package _11._29_8_2022_Diziler_Arrays;

import java.lang.reflect.Array;

public class arrayAvarage {
    //    7-
//    int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
//    Array'in ortalamasını alınız.
    public static void main(String[] args) {
        int[] array = {12, 14, 21 ,23, 10, 4};
        int toplam = 0;
        for (int i = 0; i < array.length; i++)
            toplam += array[i];
        System.out.println(toplam / array.length);
    }
}

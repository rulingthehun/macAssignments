package _11._29_8_2022_Diziler_Arrays;

public class arraySum {
    //    10-
//    İnt Array oluştur ve elemanları   : 25,30,30,35,100
//    Array in elemanlarının toplamını yazdır.
//            Cevap 220 olmalı.
    public static void main(String[] args) {
        int[] array = {25, 30, 30, 35, 100};
        int toplam = 0;
        for (int e : array)
            toplam += e;
        System.out.println(toplam);
    }
}

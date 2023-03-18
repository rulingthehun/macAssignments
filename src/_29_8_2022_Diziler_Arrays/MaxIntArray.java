package _29_8_2022_Diziler_Arrays;

public class MaxIntArray {
    //    int Array oluşturun ve elemanları : 12,2,5,15,8
//    En büyük değeri yazdırınız.
    public static void main(String[] args) {
        int[] dizi = {12, 2, 5, 15, 8};
        int enb = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > enb)
                enb = dizi[i];
        }
        System.out.println("enb = " + enb);
    }
}

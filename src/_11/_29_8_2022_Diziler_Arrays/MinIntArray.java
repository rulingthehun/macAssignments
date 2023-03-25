package _11._29_8_2022_Diziler_Arrays;

public class MinIntArray {
    //    int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
//    En küçük (minimum) sayıyı yazdırınız.
    public static void main(String[] args) {
        int[] dizi = {14, 19, 5, 21};
        int enk = dizi[0];
        for (int i : dizi)
            if (i < enk)
                enk = i;
        System.out.println("enk = " + enk);
    }
}

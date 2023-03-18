package _29_08_2022_Metodlar;

public class _29_08_2022_Metodlar_Soru5 {
    //        soru 5:
//        getSum isminde bir method oluşturun.
//        Parametresi Array'tir.
//        Dizideki tüm $ ları kaldır ve tüm sayıları topla
//        return yaptğımız veri tipi 'int' olmalıdır.
//        sonuç 0'dan küçükse, -1 yazdırın.
//        Örnek1:
//        Array = $13, $15, $20
//        Cevap = 48 olmalı
//        Örnek 2 :
//        Array= $-13, $0, $0
//        Cevap = -1 olmalı.
    public static void main(String[] args) {
        String[] arr = {"$13", "$15", "$20"};
        System.out.println(getSum(arr));
    }
    public static int getSum(String[] arr) {
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += Integer.parseInt(arr[i].replaceAll("\\D", ""));  //  "\\D" ->  rakamın dışında ne varsa sildi
        }
        if (toplam < 0) {
            return -1;
        } else {
            return toplam;
        }
    }
}

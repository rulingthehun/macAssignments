package _13._29_08_2022_Metodlar;

import java.util.Scanner;

public class _29_08_2022_Metodlar_Soru6 {
    //        soru 6:
//        EvenOddNums isminde bir method oluşturun.
//        Bu yöntem String olan bir parametreyi kabul etsin.
//        Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
//        Sayıların her basamağını alın ve basamak çiftse
//        toplayın, tekse çıkartın. Toplam sonucu yazdırın.
//        **İpucu:Sayılar işlemleri yapabilmeniz için,
//        basamakları tam sayıya dönüştürmeniz gerekiyor.**
//        For example Örnek:
//        String =  "6678421312"
//        6+6-7+8+4+2-1-3-1+2
//        sonuç 16 olmalı
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("10 haneli sayi girin = ");
        String sayilar = oku.next();
        int toplam = EvenOddNums(sayilar);
        System.out.println("toplam = " + toplam);
    }

    public static int EvenOddNums(String sayilar) {
        int[] sayi = new int[10];
        int toplam = 0;
        for (int i = 0; i < sayilar.length(); i++) {
            sayi[i] = Integer.parseInt(String.valueOf(sayilar.charAt(i)));
            if (sayi[i] % 2 == 0)
                toplam += sayi[i];
            else
                toplam -= sayi[i];
        }
        return toplam;
    }
}

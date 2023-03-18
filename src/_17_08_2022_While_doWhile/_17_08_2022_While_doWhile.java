package _17_08_2022_While_doWhile;

import java.util.Arrays;
import java.util.Scanner;

public class _17_08_2022_While_doWhile {
    public static void main(String[] args) {
//        Soru 1:
//        Girilen bir sayıya kadar olan sayıların çarpım sonucunu bulunuz
        Scanner oku = new Scanner(System.in);
        System.out.print("Kaca kadar sayilar capilsin = ");
        int sayi = oku.nextInt();
        int sayac = 1;
        int sonuc = 1;
        while (sayac < sayi) {
            sonuc = sonuc * sayac;
            sayac++;
        }
        System.out.println(sayi + " sayisina kadar olan sayilarin carpimi = " + sonuc);
//        Cikti:
//        Kaca kadar sayilar capilsin = 9
//        9 sayisina kadar olan sayilarin carpimi = 40320
//        Soru 2:
//        0-100 arasındaki sayılardan teklerin ayrı çiftleri ayrı toplamını bulunuz
        int[] dizi = new int[99];
        int ciftSonuc = 0;
        int tekSonuc = 0;
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = i + 1;
            if (dizi[i] % 2 == 0)
                ciftSonuc += dizi[i];
            else
                tekSonuc += dizi[i];
        }
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));
        System.out.println("ciftSonuc = " + ciftSonuc);
        System.out.println("tekSonuc = " + tekSonuc);
//        Cikti:
//        Arrays.toString(dizi) = [1, 2, 3, ..., 98, 99]
//        ciftSonuc = 2450
//        tekSonuc = 2500
//        Soru 3:
//        100 den 0 a kadar olan tüm tek sayıları ekrana yazdırınız.
        int[] dizi2 = new int[100];
        for (int i = 99; i > 0; i--) {
            dizi2[i] = i;
            if (dizi2[i] % 2 == 1)
                System.out.print(dizi2[i] + " tek sayidir ");
        }
        System.out.println();
        System.out.println("Arrays.toString(dizi2) = " + Arrays.toString(dizi2));
//        Soru 4:
//        0 ile 100 arasındaki sayılardan hem 4 e hem de 5 tam bölünebilen sayıları ekrana yazdırınız.
        int[] dizi3 = new int[100];
        for (int i = 1; i < 100; i++) {
            dizi3[i] = i;
            if (dizi3[i] % 4 == 0 && dizi3[i] % 5 == 0)
                System.out.println(dizi3[i] + " sayisi 4 ve 5'e tam bolunur");
        }
//        Cikti:
//        20 sayisi 4 ve 5'e tam bolunur
//        40 sayisi 4 ve 5'e tam bolunur
//        60 sayisi 4 ve 5'e tam bolunur
//        80 sayisi 4 ve 5'e tam bolunur
    }
}

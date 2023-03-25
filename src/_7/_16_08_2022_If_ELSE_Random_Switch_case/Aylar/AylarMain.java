package _7._16_08_2022_If_ELSE_Random_Switch_case.Aylar;

import java.util.Scanner;

public class AylarMain {
//    Girilen bir ay numarasına göre , ayın hem adını hem de kaç gün olduğunu sayı ile yazdırınız
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Istenilen ay no = ");
        int ayNo = oku.nextInt();
        switch (ayNo) {
            case 1:
                Aylar ocak = Aylar.OCAK;
                System.out.println("Ay adi = " + ocak.ayAd + "\nAy gun sayisi = " + ocak.gunMiktari); break;
            case 2:
                Aylar subat = Aylar.SUBAT;
                System.out.println("Ay adi = " + subat.ayAd + "\nAy gun sayisi = " + subat.gunMiktari); break;
            case 3:
                Aylar mart = Aylar.MART;
                System.out.println("Ay adi = " + mart.ayAd + "\nAy gun sayisi = " + mart.gunMiktari); break;
            case 4:
                Aylar nisan = Aylar.NISAN;
                System.out.println("Ay adi = " + nisan.ayAd + "\nAy gun sayisi = " + nisan.gunMiktari); break;
            case 5:
                Aylar mayis = Aylar.MAYIS;
                System.out.println("Ay adi = " + mayis.ayAd + "\nAy gun sayisi = " + mayis.gunMiktari); break;
            case 6:
                Aylar haziran = Aylar.HAZIRAN;
                System.out.println("Ay adi = " + haziran.ayAd + "\nAy gun sayisi = " + haziran.gunMiktari); break;
            case 7:
                Aylar temmuz = Aylar.TEMMUZ;
                System.out.println("Ay adi = " + temmuz.ayAd + "\nAy gun sayisi = " + temmuz.gunMiktari); break;
            case 8:
                Aylar agustos = Aylar.AGUSTOS;
                System.out.println("Ay adi = " + agustos.ayAd + "\nAy gun sayisi = " + agustos.gunMiktari); break;
            case 9:
                Aylar eylul = Aylar.EYLUL;
                System.out.println("Ay adi = " + eylul.ayAd + "\nAy gun sayisi = " + eylul.gunMiktari); break;
            case 10:
                Aylar ekim = Aylar.EKIM;
                System.out.println("Ay adi = " + ekim.ayAd + "\nAy gun sayisi = " + ekim.gunMiktari); break;
            case 11:
                Aylar kasim = Aylar.KASIM;
                System.out.println("Ay adi = " + kasim.ayAd + "\nAy gun sayisi = " + kasim.gunMiktari); break;
            case 12:
                Aylar aralik = Aylar.ARALIK;
                System.out.println("Ay adi = " + aralik.ayAd + "\nAy gun sayisi = " + aralik.gunMiktari); break;
            default:
                System.out.println("Tanimsiz ay no");
        }
    }
}

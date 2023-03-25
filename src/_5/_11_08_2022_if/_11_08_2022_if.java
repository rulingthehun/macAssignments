package _5._11_08_2022_if;

import java.util.Scanner;

public class _11_08_2022_if {
    public static void main(String[] args) {
//        Soru 1:
        // Girilen 1 sayının onlar basamağının tek olup olmadıgını yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi girin = ");
        int sayi = oku.nextInt();
        if (sayi <= 9) {
            System.out.println("Hatali giris");
        }
        int sayiOnlar = sayi / 10 % 10;
        if (sayiOnlar / 2 == 1)
            System.out.println("Sayi tek");
        else
            System.out.println("Sayi cift");
//        Cikti:
//        Sayi girin = 7746
//        Sayi cift
//        Soru 2:
        // Girilen bir şifrenin "Bayrak" kelimesine eşit olup olmadığını yazdırınız.
        Scanner oku2 = new Scanner(System.in);
        System.out.print("Sifreyi girin = ");
        String sifre = oku2.next();
        if (sifre.equalsIgnoreCase("Bayrak"))
            System.out.println("Hatali sifre");
        else
            System.out.println("Gecerli sifre");
//        Cikti:
//        Sifreyi girin = BAYRAK
//        Hatali sifre
//        Soru 3:
        //Girilen bir kelimenin ilk ve son harfinin aynı olup olmadığını yazdırınız.
        Scanner oku3 = new Scanner(System.in);
        System.out.print("Bir kelime girin = ");
        String kelime = oku3.next();
        char ilkHarf = kelime.charAt(0);
        char sonHarf = kelime.charAt(kelime.length()-1);
        if (ilkHarf==sonHarf)
            System.out.println("Ilk ve son harf ayni");
        else
            System.out.println("Ilk ve son harf farkli");
//        Cikti:
//        Bir kelime girin = harf
//        Ilk ve son harf farkli
//        Soru 4:
        //Girilen bir kelimede A harfinin olup olmadığını yazdırınız.
        Scanner oku4 = new Scanner(System.in);
        System.out.print("Bir kelime girin = ");
        String kelime2 = oku4.next();
        if (kelime2.contains("A"))
            System.out.println("A harfi var");
        else
            System.out.println("A harfi yok");
//        Cikti:
//        Bir kelime girin = vArMi
//        A harfi var
//        Soru 5:
        //Girilen 2 kelimenin aynı uzunlukta olup olmadığını yazdırınız.
        Scanner oku5 = new Scanner(System.in);
        System.out.print("2 kelime girin = ");
        String kelime3_1 = oku5.next();
        String kelime3_2 = oku5.next();
        if (kelime3_1.length()==kelime3_2.length())
            System.out.println("Kelime uzunluklari esit");
        else
            System.out.println("Kelime uzunluklari farkli");
//        Cikti:
//        2 kelime girin = Kelime
//        farkli
//        Kelime uzunluklari esit
//        Soru 6:
        //Kullanıcının bir yeni şifre girmesini isteyiniz,
        // şifrenin uzunluğu 8 den küçük ise, şifreniz kabul edilmedi yazsın.
        Scanner oku6 = new Scanner(System.in);
        System.out.print("Sifrenizi girin = ");
        String sifre2 = oku6.next();
        if (sifre2.length()<8)
            System.out.println("Sifre kabul edilmedi");
//        Cikti:
//        Sifrenizi girin = ##sif##
//        Sifre kabul edilmedi
    }
}
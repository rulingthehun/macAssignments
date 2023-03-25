package _4._10_08_2022_String_Metodlar_3;

import java.util.Scanner;

public class _10_08_2022_String_Metodlar_3 {
    public static void main(String[] args) {
        //1-Girilen bir cümlenin ilk ve son harfini bulunuz
//        Scanner oku = new Scanner(System.in);
//        System.out.print("Bir cumle girin = ");
//        String cumle = oku.nextLine();
//        System.out.println("cumlenin ilk harfi = " + cumle.charAt(0));
//        System.out.println("cumlenin son harfi = " + cumle.charAt(cumle.length() - 1));
//        Cikti:
//        Bir cumle girin = Bu bir cumledir
//        cumlenin ilk harfi = B
//        cumlenin son harfi = r

        //2-Girilen 3 kelimelik bir cumleyi kelimelerine ayırınız
//        Scanner oku2 = new Scanner(System.in);
//        System.out.print("3 kelimelik cumle girin = ");
//        String cumle2 = oku2.nextLine();
//        int boslukIndex = cumle2.indexOf(" ");
//        System.out.println("cumlenin ilk kelimesi = " + cumle2.substring(0, boslukIndex));
//        String cumle2v2 = cumle2.substring(boslukIndex + 1);
//        int boslukIndex2 = cumle2v2.indexOf(" ");
//        System.out.println("cumlenin ikinci kelimesi = " + cumle2v2.substring(0, boslukIndex2));
//        String cumle2v3 = cumle2v2.substring(boslukIndex2 + 1);
//        System.out.println("cumlenin ucuncu kelimesi = " + cumle2v3);
//        Cikti:
//        3 kelimelik cumle girin = Uc kelimelik cumle
//        cumlenin ilk kelimesi = Uc
//        cumlenin ikinci kelimesi = kelimelik
//        cumlenin ucuncu kelimesi = cumle

        //3-Girilen 3 kelimelik bir cümlenin kelimelerinin ilk karakterlerini bulunuz
//        Scanner oku3 = new Scanner(System.in);
//        System.out.print("3 kelimelik cumle girin = ");
//        String cumle3 = oku3.nextLine();
//        int boslukIndexv2 = cumle3.indexOf(" ");
//        System.out.println("cumlenin ilk kelimesinin ilk harfi = " + cumle3.charAt(0));
//        String cumle3v2 = cumle3.substring(boslukIndexv2 + 1);
//        int boslukIndex2v2 = cumle3v2.indexOf(" ");
//        System.out.println("cumlenin ikinci kelimesinin ilk harfi = " + cumle3v2.charAt(0));
//        String cumle2v3 = cumle3v2.substring(boslukIndex2v2 + 1);
//        System.out.println("cumlenin ucuncu kelimesinin ilk harfi = " + cumle2v3.charAt(0));
//        Cikti:
//        3 kelimelik cumle girin = Cumlenin ilk karakteri
//        cumlenin ilk kelimesinin ilk harfi = C
//        cumlenin ikinci kelimesinin ilk harfi = i
//        cumlenin ucuncu kelimesinin ilk harfi = k

        //4-Girilen bir kelimenin içerisinde B harifnin geçip geçnmediğini bulunuz.
//        Scanner oku4 = new Scanner(System.in);
//        System.out.print("Bir kelime girin = ");
//        String kelime = oku4.next();
//        kelime= kelime.toUpperCase();
//        if (kelime.contains("B")) System.out.println("B harfi var");
//        else System.out.println("B harfi yok");
//        Cikti:
//        Bir kelime girin = B harfi gecer mi
//        B harfi var

        //5-Girilen bir kredi kartı bilgisini yandaki şekilde gösteriniz.  **** **** **** 4567
//        Scanner oku5 = new Scanner(System.in);
//        System.out.print("Kredi karti numaralarini girin = ");
//        String kartNo = oku5.nextLine();
//        String sonHaneler = kartNo.substring(kartNo.length() - 4);
//        String kartNo2 = kartNo.substring(0, kartNo.length() - 4);
//        String kartNo3 = kartNo2.replaceAll("[0-9]", "*");
//        System.out.println("Kart numaralariniz = " + kartNo3 + sonHaneler);
//        Cikti:
//        Kredi karti numaralarini girin = 1111 2222 3333 4444
//        Kart numaralariniz = **** **** **** 4444

        //6-Girilen bir cümledeki son kelimeyi bulunuz
        Scanner oku6 = new Scanner(System.in);
        System.out.print("Bir cumle girin = ");
        String cumle4 = oku6.nextLine();
        String sonKelime = cumle4.substring(cumle4.lastIndexOf(" ")+1);
        System.out.println("Cumlenin son kelimesi = " + sonKelime);
//        Cikti:
//        Bir cumle girin = Cumlenin son kelimesini bul
//        Cumlenin son kelimesi = bul
    }
}

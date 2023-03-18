package _10_08_2022_Aritmetik_islemler;

public class _10_08_2022_Aritmetik_islemler {
    public static void main(String[] args) {
        //Soru 1:
        //Verilen iki int hakkında (num1,  num2),
        //İlk int'i ikinci int'e bölün.
        //Sonucu yazdırın.
        int sayi1 = 4;
        int sayi2 = 2;
        System.out.println("bolum = " + sayi1 / sayi2);
//        Cikti:
//        bolum = 2
        //Soru 2:
        //Verilen 3 double hakkında, (num1 , num2, num3),
        //Bu üç double'ı birbiriyle çarpın ve cevabı  **sonuca** eşitleyin.
        //Sonucu yazdırın.
        double dsayi1 = 3.15;
        double dsayi2 = 5.5;
        double dsayi3 = 9.46;
        double sonuc = dsayi1 * dsayi2 * dsayi3;
        System.out.println("sonuc = " + sonuc);
//        Cikti:
//        sonuc = 163.89450000000002
        //Soru 3:
        //Oluşturulmuş olan double'lar hakkında,
        //Bu 4 doubleyi  birbiriyle çarpın ve **sonuca**  eşitleyin.
        //Double sonucu yazdırın.
        double dosayi1 = 15.15;
        double dosayi2 = 80.77;
        double dosayi3 = 48.2;
        double dosayi4 = 99.11;
        double sonuc2 = dosayi1 * dosayi2 * dosayi3 * dosayi4;
        System.out.println("sonuc2 = " + sonuc2);
//        Cikti:
//        sonuc2 = 5845574.907381001
        //Soru 4:
        //Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        //Bu int'leri birbiriyle çarpın ve **sonuca** eşitleyin.
        //**int sonuc** u yazdırın.
        int sayi11 = 99;
        int sayi12 = 53;
        int sayi13 = 41;
        int sayi14 = 5;
        int sonuc3 = sayi11 * sayi12 * sayi13 * sayi14;
        System.out.println("sonuc3 = " + sonuc3);
//        Cikti:
//        sonuc3 = 1075635
        //Soru 5:
        //Verilen int ler hakkında (num1, num2),
        //num1 'in   num2'ye bölümünden **kalanı, int sonuc'a**  eşitleyin.
        //int sonucu yazdırın.
        int sayi21 = 50;
        int sayi22 = 9;
        int sonuc4 = sayi21 % sayi22;
        System.out.println("sonuc4 = " + sonuc4);
//        Cikti:
//        sonuc4 = 5
        //Soru 6:
        //Verilen 2 tane int (num1, num2),
        //Int'lerin farkını yazdırın.
        int sayi31 = 5088;
        int sayi32 = 18;
        int sonuc5 = sayi31 - sayi32;
        System.out.println("sonuc5 = " + sonuc5);
//        Cikti:
//        sonuc5 = 5070
        //Soru 7:
        //Verilen 4 tane int (num 1, num2 , num3 , num4),
        //Int'leri birbirinden çıkarın.
        //Sonucu yazdırın.
        //Örneğin;
        //num1 = 90
        //num2 = 40
        //num3 = 10
        //num4 = 10
        //Sonuc 30 olmalı.
        int sayi41 = 68940;
        int sayi42 = 5622;
        int sayi43 = 411;
        int sayi44 = 25;
        int sonuc6 = sayi41 - sayi42 - sayi43 - sayi44;
        System.out.println("sonuc6 = " + sonuc6);
//        Cikti:
//        sonuc6 = 62882
    }
}

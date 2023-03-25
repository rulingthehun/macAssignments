package _1._08_08_2022_String_Metodlar_1;

public class _08_08_2022_String_Metodlar_1 {
    public static void main(String[] args) {
        //Soru 1:
        // **I love java** olan bir String oluşturun.
        // Bu cümlenin toplam karakter sayısını yazdırın.
        String cumle = "**I love Java**";
        System.out.println("Cumlenin karakter sayisi = " + cumle.length());
        //Cikti:
        //Cumlenin karakter sayisi = 15
        //Soru 2:
        // **Sprint planning** olan bir String oluşturun.
        // Bu dizenin _toplam karakter sayısını_ yazdırın.
        String cumle2 = "**Sprint planning**";
        System.out.println("Cumlenin karakter sayisi = " + cumle2.length());
        //Cikti:
        //Cumlenin karakter sayisi = 19
        //Soru 3:
        //**apple** olan bir String oluşturun.
        //String'in _içinde_ **app** olup olmadığını **doğrula**.
        String kelime = "**apple**";
        if (kelime.contains("app")) {
            System.out.println("Iceriyor");
        } else {
            System.out.println("Icermiyor");
        }
        //Cikti:
        //Iceriyor
        //Soru 4:
        //**orange** kelimesinden oluşan bir String oluşturun.
        // String'in **Apple**'a _eşit_ olup olmadığını doğrulayın.
        String kelime2 = "**orange**";
        if (kelime2.equals("**Apple**")) {
            System.out.println("Kelimeler esit");
        } else {
            System.out.println("Kelimeler farkli");
        }
        //Cikti:
        //Kelimeler farkli
        //Soru 5:
        //**apple**  olan  bir String oluşturun.
        //String'in **apple**'a _eşit_ olup olmadığını doğrulayın.
        //_Büyük harf veya küçük harf önemli değildir._
        String kelime3 = "**apple**";
        if (kelime3.equalsIgnoreCase("**APPLE**")) {
            System.out.println("Kelimeler esit");
        } else {
            System.out.println("Kelimeler farkli");
        }
        //Cikti:
        //Kelimeler esit
        //Soru 6:
        //**Florida** kelimesinden bir String oluşturun.
        //Florida kelimesinin içindeki, sadece  **'o'**  harfinin bulunduğu indexini yazdırın.
        String kelime4 = "**Florida**";
        int harf = kelime4.indexOf("o");
        char oHarfi = kelime4.charAt(harf);
        System.out.println("o harfi = " + oHarfi);
        //Cikti:
        //o harfi = o
        //Soru 7:
        //**Thank you** olan bir String oluşturun.
        //Thank you içindeki, sadece  **'y'** harfinin bulunduğu _konumu_ yazdırın.
        String kelime5 = "**Thank you**";
        int harf2 = kelime5.indexOf("y");
        System.out.println("y harfinin konumu = " + harf2);
        //Cikti:
        //y harfinin konumu = 8
        //Soru 8:
        //**Main method** oluşturun.
        //**Mouse** değerinde bir String oluştur.
        //Mouse String'inin 3_. sırasındaki karakteri_ yazdırın.
        String kelime6 = "**Mouse**";
        System.out.println("3. karakter = " + kelime6.charAt(2));
        //Cikti:
        //3. karakter = M
        //Ozel soru:
        //3 kelimelik ismi olan kişinin ad , 2.ad ve soyadını A.E.Y. şeklinde yazınız.
        String isim = "Mustafa Kemal Ataturk";
        char ilkHarf = isim.charAt(0);
        int boslukIndex = isim.indexOf(" ");
        char ikinciHarf = isim.charAt(boslukIndex + 1);
        String isim2 = isim.substring(boslukIndex + 1);
        int boslukIndex2 = isim2.indexOf(" ");
        char ucuncuHarf = isim2.charAt(boslukIndex2 + 1);
        System.out.println("Bas harfler = " + ilkHarf + "." + ikinciHarf + "." + ucuncuHarf);
        //Cikti:
        //Bas harfler = M.K.A
    }
}
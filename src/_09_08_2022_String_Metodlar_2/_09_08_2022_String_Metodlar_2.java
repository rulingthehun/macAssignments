package _09_08_2022_String_Metodlar_2;

import java.util.Scanner;

public class _09_08_2022_String_Metodlar_2 {
    public static void main(String[] args) {
        //Soru 1:
        //**paper** olan bir String oluşturun.
        //String'i _büyük harfe_ çevirin ve yazdırın.
        //örn: apple > APPLE
        String kelime = "paper";
        System.out.println("kelime.toUpperCase() = " + kelime.toUpperCase());
        //Cikti:
        //kelime.toUpperCase() = PAPER
        //Soru 2:
        //**OraNge** olan bir String oluşturun.
        //String'i _küçük harfe_ çevirin ve yazdırın.
        //örn: APPLE > apple
        String kelime2 = "OraNge";
        System.out.println("kelime2.toLowerCase() = " + kelime2.toLowerCase());
        //Cikti:
        //kelime2.toLowerCase() = orange
        //Soru 3:
        //**New Jersey** olan bir String oluşturun.
        // String'i _büyük harfe_ çevirin ve yazdırın
        String kelime3 = "New Jersey";
        System.out.println("kelime3.toUpperCase() = " + kelime3.toUpperCase());
        //Cikti:
        //kelime3.toUpperCase() = NEW JERSEY
        //Soru 4:
        //**New York** olan bir String oluşturun.
        // String'i _küçük harfe_ çevirin ve yazdırın
        String kelime4 = "New York";
        System.out.println("kelime4.toLowerCase() = " + kelime4.toLowerCase());
        //Cikti:
        //kelime4.toLowerCase() = new york
        //Soru 5:
        //**PADDLE** olan bir String oluşturun.
        //String'i _küçük harfe_ çevirin ve yazdırın.
        String kelime5 = "PADDLE";
        System.out.println("kelime5.toLowerCase() = " + kelime5.toLowerCase());
        //Cikti:
        //kelime5.toLowerCase() = paddle
        //Soru 6:
        //**apple** olan bir String oluşturun.
        //String'in _içinde_ **app** olup olmadığını **doğrula**.
        String kelime6 = "apple";
        if (kelime6.contains("app")) {
            System.out.println("Iceriyor");
        } else {
            System.out.println("Icermiyor");
        }
        //Cikti:
        //Iceriyor
        //Ozel soru:
        // Girilen bir cumledeki kelimeleri ilk harflerini yazdırınız
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir cumle girin = ");
        String cumle = oku.nextLine();
        cumle = cumle.trim();
        char ilkHarf = cumle.charAt(0);
        int boslukIndex = cumle.indexOf(" ");
        char ikinciHarf = cumle.charAt(boslukIndex + 1);
        String cumle2 = cumle.substring(boslukIndex + 1);
        int bosluIndex2 = cumle2.indexOf(" ");
        char ucuncuHarf = cumle2.charAt(bosluIndex2 + 1);
        System.out.println("Ilk harfler = " + ilkHarf + ikinciHarf + ucuncuHarf);
        //Cikti:
        //Bir cumle girin = Benim adim Java
        //Ilk harfler = BaJ
    }
}

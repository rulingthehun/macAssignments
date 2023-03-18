package _29_08_2022_Metodlar;


public class _29_08_2022_Metodlar_Soru2 {
    public static void main(String[] args) {
//        soru 2:
//        "OrtaKelime" isminden bir method oluşturun.
//        Bu method String'i parametre olarak almalı.
//        Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
//        Ortadaki kelimeyi return yapınız.
//        Örnek: Ben Java'yı seviyorum.
//        print : Java'yı
//        Örnek2:
//        Java'yı kolayca öğreniyorum.
//        print: kolayca
        String text = "Ben Java'yı seviyorum.";
        System.out.println(ortaKelime(text));
    }

    public static String ortaKelime(String text) {

        int bosluk = text.indexOf(" ");
        String word = text.substring(bosluk + 1, text.lastIndexOf(" "));

        return word;
    }
}

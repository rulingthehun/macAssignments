package _29_08_2022_Metodlar;

import java.util.Scanner;

public class _29_08_2022_Metodlar_Soru1 {
    public static void main(String[] args) {
        //    soru 1:
        //        Ismi **randomNum** olan bir method oluşturun.
//        Parametre olarak **int max** almalı.
//        Bu method, 0 ile max arasında random bir değer döndürmelidir.
//        Random numarayı döndürünüz.
        Scanner oku = new Scanner(System.in);
        System.out.print("Kaca kadar sayi uretilsin? = ");
        int max = oku.nextInt();
        int random = randomNum(max);
        System.out.println("random = " + random);
    }

    public static int randomNum(int max) {
        int randomSayi = (int) (Math.random() * max);
        return randomSayi;
    }
}

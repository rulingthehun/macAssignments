package _18_08_2022_for_break_continue;

import java.util.ArrayList;
import java.util.Scanner;

public class _10SayiYazdir {
//    7-Kullanıcından 10 sayı isteyiniz, ve ekrana yazdırınız,  eğer sonra
//    girilen sayı önce girilenden büyük ise dikkate almasın(pass geçsin).
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        ArrayList<Integer> liste = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Sayi girin = ");
            liste.add(oku.nextInt());
        }
        System.out.println("1. sayi = " + liste.get(0));
        for (int i = 1; i < 10; i++) {
            if (liste.get(i) > liste.get(i - 1))
                continue;
            System.out.println((i + 1) + ". sayi = " + liste.get(i));
        }
    }
}

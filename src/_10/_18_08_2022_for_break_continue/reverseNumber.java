package _10._18_08_2022_for_break_continue;

import java.util.Scanner;

public class reverseNumber {
    //    6-Kullanıcnın gireceği bir sayının basamaklarına göre tersi olan sayıyı bulunuz
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi girin = ");
        int sayi = oku.nextInt();
        int reverseSayi = 0;
        int basamak;
        for (int i = sayi; i > 0; i /= 10) {
            basamak = i % 10;
            reverseSayi = reverseSayi * 10 + basamak;
        }
        System.out.println("reverseSayi = " + reverseSayi);
    }
}

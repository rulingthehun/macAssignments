package _18_08_2022_for_break_continue;

import java.util.Scanner;

public class tekCiftToplam {
//    3-  Kullanıcıdan 10 adet sayı isteyiniz, eğer sayı
//    çift ise toplasın, tek ise girdiğinde ise döngü sonlansın.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Sayi girin = ");
            sayi = oku.nextInt();
            if (sayi % 2 == 0){
                toplam += sayi;
            } else {
                break;
            }
        }
        System.out.println("toplam = " + toplam);
    }
}
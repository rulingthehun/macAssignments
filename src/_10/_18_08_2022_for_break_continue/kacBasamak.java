package _10._18_08_2022_for_break_continue;

import java.util.Scanner;

public class kacBasamak {
//    4- Kullanıcın gireceği bir sayının kaç basamak olduğunu bulunuz
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi girin = ");
        int sayi = oku.nextInt();
        int sayac = 0;
        while (sayi > 0){
            sayi /= 10;
            sayac++;
        }
        System.out.println("\u001b[31;1m " + "Sayi " + sayac + " basamak" + "\u001b[31;1m ");
    }
}

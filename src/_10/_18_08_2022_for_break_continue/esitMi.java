package _10._18_08_2022_for_break_continue;

import java.util.Scanner;

public class esitMi {
    //    5- Kullanıcın girdiği bir sayının ilk ve son basamaklarının eşit olup olmadığınız bulunuz
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi girin = ");
        int sayi = oku.nextInt();
        int ilkBasamak = sayi % 10;
        while (sayi > 9)
            sayi /= 10;
        int sonBasamak = sayi;
        if (sonBasamak == ilkBasamak)
            System.out.println("Sayinin birler ve onlar basamagi esit");
        else
            System.out.println("Sayinin birler ve onlar basamagi esit degil");
    }
}

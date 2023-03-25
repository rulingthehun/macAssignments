package _7._16_08_2022_If_ELSE_Random_Switch_case.Sayi;

import java.util.Scanner;

public class sayiYazdir {
//    2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("3 basamakli bir sayi girin = ");
        int sayi = oku.nextInt();
        int birler = sayi % 10;
        int onlar = (sayi/10) % 10;
        int yuzler = sayi / 100;
        switch(yuzler) {
            case 0:System.out.print("Hatali giris");break;
            case 1:System.out.print("yuz");break;
            case 2: System.out.print("iki yuz");break;
            case 3:System.out.print("uc yuz");break;
            case 4:System.out.print("dört yuz");break;
            case 5:System.out.print("bes yuz");break;
            case 6:System.out.print("altı yuz");break;
            case 7:System.out.print("yedi yuz");break;
            case 8:System.out.print("sekiz yuz");break;
            case 9:System.out.print("dokuz yuz");break;
        }
        switch(onlar) {
            case 0:System.out.print("");break;
            case 1:System.out.print(" on");break;
            case 2:System.out.print(" yirmi");break;
            case 3:System.out.print(" otuz");break;
            case 4:System.out.print(" kirk");break;
            case 5:System.out.print(" elli");break;
            case 6:System.out.print(" atmis");break;
            case 7:System.out.print(" yetmis");break;
            case 8:System.out.print(" seksen");break;
            case 9:System.out.print(" doksan");break;
        }
        switch(birler) {
            case 0:System.out.print("");break;
            case 1:System.out.print(" bir");break;
            case 2:System.out.print(" iki");break;
            case 3:System.out.print(" üc");break;
            case 4:System.out.print(" dört");break;
            case 5:System.out.print(" bes");break;
            case 6:System.out.print(" alti");break;
            case 7:System.out.print(" yedi");break;
            case 8:System.out.print(" sekiz");break;
            case 9:System.out.print(" dokuz");break;
        }
    }
}

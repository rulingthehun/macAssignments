package _13._29_08_2022_Metodlar;

import java.util.Scanner;

public class _29_08_2022_Metodlar_Soru3 {
    public static void main(String[] args) {
        //        soru 3:
//        reverseString isminde bir method oluşturun.
//        Bu method bir String'i parametre olarak alsın.
//        Ve bu method, girilen String'i tersten yazsın.
//        Terste yazılmış halini yazdırınız.
//        Örn: String = "Java'yı Seviyorum."
//        Print: .muroyiveS ıy'avaJ
        reverseString(printText());
    }

    public static void reverseString(String text) {
        String reverseText = " ";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverseText += text.charAt(i);
        }
        System.out.println("tersi : " + reverseText);
    }

    public static String printText() {
        Scanner input = new Scanner(System.in);
        System.out.print("Cumle giriniz = ");
        String cumle = input.nextLine();
        return cumle;
    }
}

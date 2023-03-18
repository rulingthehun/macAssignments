package _29_8_2022_NestedLoop_Loops;

import java.util.Scanner;

public class _01_SymmetricNumber {
    //    1- Girilen bir sayının simetrik sayı (12321, 55555, 45554, 11611,77377)
//    sayı olup olmadığını bulunuz
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number = ");
        String num = scan.next();
        String firstPart = "";
        if (num.length() % 2 == 0)
            firstPart = num.substring(0, num.length() / 2);
        else
            firstPart = num.substring(0, num.length() / 2 + 1);
        String lastPart = num.substring(num.length() / 2);
        int intfirstPart = Integer.parseInt(firstPart);
        int intlastPart = Integer.parseInt(lastPart);
        int reverseLastPart = 0;
        for (int i = intlastPart; i > 0; i /= 10) {
            int basamak = i % 10;
            reverseLastPart = reverseLastPart * 10 + basamak;
        }
        if (intfirstPart == reverseLastPart)
            System.out.println("Numbers are symmetrical");
        else
            System.out.println("Numbers are not symmetrical");
    }
}

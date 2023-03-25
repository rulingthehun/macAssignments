package _11._29_8_2022_Diziler_Arrays;

import java.util.Scanner;

public class arraySubstring {
    //    11-- Kullanıcıdan alacağınız 5 ayrı kelimeyi bir diziye atayınız,
//            /Kelimelerden en uzun olanının ilk ve son harfininin yerlerini değiştiriniz.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array = new String[5];
        int longest = 0;
        String longestString = "";
        for (int i = 0; i < array.length; i++) {
            System.out.print("Kelime girin = ");
            array[i] = scan.next();
            if (array[i].length() > longest) {
                longest = array[i].length();
                longestString = array[i];
            }
        }
        char firstLetter = longestString.charAt(0);
        char lastLetter = longestString.charAt(longestString.length() - 1);
        String remainingLetters = longestString.substring(1, longestString.length() - 1);
        System.out.println(lastLetter + remainingLetters + firstLetter);
    }
}

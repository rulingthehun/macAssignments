package _29_8_2022_Diziler_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arraySubtraction {
    //    12: Kullanıcıdan alacağınız 10 elemanlı bir diziyi doldurduktan sonra,
//    ayrı bir döngüde en büyük ve en küçük rakamın farkını bulunuz.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number = ");
            array[i] = scan.nextInt();
        }
        int enb = array[0];
        int enk = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > enb)
                enb = array[i];
            if (array[i] < enk)
                enk = array[i];
        }
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println(enb - enk);
    }
}

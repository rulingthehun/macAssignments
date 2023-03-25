package _11._29_8_2022_Diziler_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayEvenNumbers {
    //    13: Kullanıcıdan alacağınız 10 elemanlı bir diziyi doldurduktan sonra,
//    ayrı bir döngüde çift rakam sayısını bulunuz ve yazdırınız
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[3];
        System.out.print("Enter number = ");
        for (int i = 0; i < array.length; i++)
            array[i] = scan.nextInt();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        int evenNumbersCount = 0;
        for (int i : array)
            if (i % 2 == 0){
                evenNumbersCount++;
                evenNumbers.add(i);
            }
        Arrays.sort(array);
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Even Numbers Count = " + evenNumbersCount);
        System.out.println("Even numbers = " + evenNumbers);
    }
}

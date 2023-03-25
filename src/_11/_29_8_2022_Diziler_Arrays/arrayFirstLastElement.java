package _11._29_8_2022_Diziler_Arrays;

import java.util.Arrays;

public class arrayFirstLastElement {
    //    6-
//    Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
//    ilk ve son elementlerini kapsayan yeni array'e return edin.
//            Oluşturacağınız int array'i =   ([1, 2, 3, 4])
//    Sonuç bu şekilde olmalıdır. [1, 4]
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] firstLastArray = new int[array.length - (array.length - 2)];
        firstLastArray[0] = array[0];
        firstLastArray[1] = array[array.length - 1];
        System.out.println(Arrays.toString(firstLastArray));
    }
}

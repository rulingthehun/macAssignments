package _11._29_8_2022_Diziler_Arrays;

public class arrayOddEven {
    //    int Array oluşturun ve elemanları : 5,6,8,12,14,19
//    Eğer sayı çiftse topla, tekse çıkar.
//**Örneğin:**
//            **-5 + 6 + 8 + 12 + 14 - 19 = 16**
//    Toplamlarını yazdırın.
    public static void main(String[] args) {
        int[] array = {5, 6, 8, 12, 14, 19};
        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
            int kalan = array[i] % 2;
            if (kalan==0)
                toplam += array[i];
            else
                toplam -= array[i];
        }
        System.out.println("toplam = " + toplam);
    }
}

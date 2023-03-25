package _13._29_08_2022_Metodlar;

public class _29_08_2022_Metodlar_Soru4 {
    public static void main(String[] args) {
        //        soru 4:
//        adı  reverseWord olan bir method oluşturun
//        Bu methodun String olarak bir parametresi olmalıdır
//        Ve bu cümledeki kelimelerle tersine çevirmeli
//        Ters halini yazdırın.
//        Örnek 1 :
//        Dize: Java yazın
//        dönüş şöyle olmalıdır:  yazın Java
//        Örnek 2:
//        Dize: Sakin olun ve evde kalın
//        dönüş olmalı: kalın evde ve olun sakin
        String text = "Sakin olun ve evde kalın";
        reverseWord(text);
    }
    public static void reverseWord(String text) {
        String[] str = text.split(" ");
        String[] reverseText = new String[str.length];
        int index = 0;
        for (int i = str.length - 1; i >= 0; i--) {
            reverseText[index] = str[i];
            index++;
        }
        String newReverseText = " ";
        for (int i = 0; i < reverseText.length; i++) {
            newReverseText += reverseText[i] + " ";
        }
        System.out.println("newReverseText: " + newReverseText);
    }
}

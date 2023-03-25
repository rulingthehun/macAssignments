package _11._29_8_2022_Diziler_Arrays;

public class StringArray {
    //    1-
//    String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
//    Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
//    Eğer aitse "true" çevirin.
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Banana", "Pineapple"};
        System.out.println(doesItContain(fruits, "apple"));
    }
    public static boolean doesItContain(String[] fruits, String fruit){
        boolean doesItContain = false;
        for (String f : fruits){
            doesItContain = f.equalsIgnoreCase(fruit);
            if (doesItContain)
                break;
        }
        return doesItContain;
    }
}

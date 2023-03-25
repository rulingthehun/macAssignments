package _12._29_8_2022_NestedLoop_Loops;

public class Q3 {
    /*
                   3. Aşağıdaki for döngüsüne denk while döngüsü hangisidir?  (başlangıçta toplam=0 varsayın)

               for (i = 1; i <= 100; i = i + 1)
                   toplam = toplam + i;
     */
    public static void main(String[] args) {
        int toplam = 0;
        int i = 0;
        for (i = 1; i <= 100; i = i + 1)
            toplam = toplam + i;
        System.out.println("toplam = " + toplam);
        toplam = 0;
        i = 0;
        while (i <= 100) {
            toplam += i;
            i++;
        }
        System.out.println("toplam = " + toplam);
    }
}

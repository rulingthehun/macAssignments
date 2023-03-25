package _12._29_8_2022_NestedLoop_Loops;

public class Q4 {
    /*
         4- Aşağıdaki çıktıyı veren programı yazınız
          *****
           ****
            ***
             **
              *
     */
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = i; j < 5; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print("*");
            System.out.println();
        }
        System.out.print("---------------");
    }
}

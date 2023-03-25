package _12._29_8_2022_NestedLoop_Loops;

public class Q5 {
    /*
           5- Aşağıdaki çıktıyı veren programı yazınız
            **********
             ********
              ******
               ****
                **
     */
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = i; j < 10; j++)
                System.out.print(" ");
            for (int k = 0; k < i; k++)
                System.out.print("**");
            System.out.println(" ");
        }
    }
}

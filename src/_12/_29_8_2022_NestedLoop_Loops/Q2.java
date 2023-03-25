package _12._29_8_2022_NestedLoop_Loops;

public class Q2 {
    /*
                  2- Aşağıdaki do-while döngüsüne denk  while döngüsü hangisidir?

              do {
                x = x + y;
              } while (x < z);
     */
    public static void main(String[] args) {
        int x = 12;
        int y = 1;
        int z = 16;
        do {
            x += y;
            System.out.println("x = " + x);
        } while (x < z);
        x = 12;
        while (x < z){
            x += y;
            System.out.println("2.x = " + x);
        }

    }
}

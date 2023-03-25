package _7._16_08_2022_If_ELSE_Random_Switch_case.Random;

public class Random {
    //    3- 20-80 arasında üretilen bir sayının birler basamağını yazı ile yazdırınız.
    public static void main(String[] args) {
        int randomSayi = (int) (Math.random() * ((80 - 20) + 1)) + 20;
        int birler = randomSayi % 10;
        switch(birler) {
            case 0:System.out.print("sifir");break;
            case 1:System.out.print("bir");break;
            case 2:System.out.print("iki");break;
            case 3:System.out.print("uc");break;
            case 4:System.out.print("dort");break;
            case 5:System.out.print("bes");break;
            case 6:System.out.print("alti");break;
            case 7:System.out.print("yedi");break;
            case 8:System.out.print("sekiz");break;
            case 9:System.out.print("dokuz");break;
        }
    }
}

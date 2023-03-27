package _17_07_11_2022_Selenium_Wait_Scroll_Odevleri_Robot_Class;

import Utility.BaseDriverEdge;
import org.junit.Test;

public class Q2 extends BaseDriverEdge {
    /*
               2-
           Senaryo
           1- https://www.youtube.com/ adresine gidiniz
           2- "Selenium" kelimesi ile video aratınız.
           3- Listelenen sonuçlarda 80 videoaya kadar lsiteyi uzatınız.
           4- Son videonun title ını yazdırınız.
     */
    @Test
    public void Test(){
        driver.get("https://www.youtube.com/");

        driverStop();
    }
}

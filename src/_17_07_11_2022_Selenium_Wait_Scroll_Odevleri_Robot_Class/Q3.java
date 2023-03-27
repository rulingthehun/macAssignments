package _17_07_11_2022_Selenium_Wait_Scroll_Odevleri_Robot_Class;

import Utility.BaseDriverEdge;
import org.junit.Test;

public class Q3 extends BaseDriverEdge {
    /*
                3-
            Senaryo
            1- google.com ile sayfayı açınız.
            2- Daha sonra Yeni bir TAB (ctrl+T) açınız.
            3- Bu açılan yeni sayfada facebook.com u açınız.
            4- Bu sayfanın açıldığını URL sinden kontrol ediniz.
            4- Daha sonra facebook.com sayfasını kapatınız.
     */
    @Test
    public void Test(){
        driver.get("https://www.google.com/");

        driverStop();
    }
}
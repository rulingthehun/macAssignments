package _17_07_11_2022_Selenium_Wait_Scroll_Odevleri_Robot_Class;

import Utility.BaseDriverEdge;
import org.junit.Test;

public class Q5 extends BaseDriverEdge {
    /*
                  5-
            Senaryo
            1) https://demoqa.com/dynamic-properties adresine gidin
            2) “Will enable 5 seconds” butonunun enable olmasini bekleyin
            3) “Will enable 5 seconds” butonunun enable oldugunu test edin
     */
    @Test
    public void Test(){
        driver.get("https://demoqa.com/dynamic-properties");

        driverStop();
    }
}
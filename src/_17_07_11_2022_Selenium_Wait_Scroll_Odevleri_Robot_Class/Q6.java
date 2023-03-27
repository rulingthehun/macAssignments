package _17_07_11_2022_Selenium_Wait_Scroll_Odevleri_Robot_Class;

import Utility.BaseDriverEdge;
import org.junit.Test;

public class Q6 extends BaseDriverEdge {
    /*
                6-
             Senaryo
             https://demoqa.com/dynamic-properties adresine gidin
             1) “Visible After 5 seconds” butonunun gorunur olmasini bekleyin
             2) “Visible After 5 seconds” butonunun gorunur oldugunu test edin
     */
    @Test
    public void Test(){
        driver.get("https://demoqa.com/dynamic-properties");

        driverStop();
    }
}
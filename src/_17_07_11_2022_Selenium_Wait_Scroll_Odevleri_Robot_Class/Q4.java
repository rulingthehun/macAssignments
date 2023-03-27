package _17_07_11_2022_Selenium_Wait_Scroll_Odevleri_Robot_Class;

import Utility.BaseDriverEdge;
import org.junit.Test;

public class Q4 extends BaseDriverEdge {
    /*
                    4-
             Senaryo
             1) https://demoqa.com/browser-windows adresine gidin
             2) Alerts’e tiklayin
             3) On button click, alert will appear after 5 seconds karsisindaki click me butonuna basin
             4) Allert’in gorunur olmasini bekleyin
             5) Allert uzerindeki yazinin “This alert appeared after 5 seconds” oldugunu test edin
             6) Ok diyerek alerti kapatin
     */
    @Test
    public void Test(){
        driver.get("https://demoqa.com/browser-windows");

        driverStop();
    }
}
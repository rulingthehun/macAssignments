package _17_07_11_2022_Selenium_Wait_Scroll_Odevleri_Robot_Class;

import Utility.BaseDriverChrome;
import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Q3 extends BaseDriverChrome {
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
    public void Test() throws AWTException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://www.google.com/");
        Robot rbt = new Robot();
        //For macOS
        rbt.keyPress(KeyEvent.VK_META);
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        MyFunc.Wait(1);
        rbt.keyRelease(KeyEvent.VK_META);

        rbt.keyPress(KeyEvent.VK_META);
        rbt.keyPress(KeyEvent.VK_T);
        rbt.keyRelease(KeyEvent.VK_META);
        rbt.keyRelease(KeyEvent.VK_T);
        wait.equals(driver.getWindowHandles().size() == 2);
        List<String> windowIDs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowIDs.get(1));
        driver.get("https://tr-tr.facebook.com/");
        String url = driver.getCurrentUrl();
        MyFunc.Wait(2);
        Assert.assertEquals("https://tr-tr.facebook.com/", url);
        driver.close();
        driverStop();
    }
}
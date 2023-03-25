package _14._25_10_2022_Selenium_CssSelector;

import Utility.BaseDriverEdge;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Q5 extends BaseDriverEdge {
    /*
                5-

            Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]

            Fake Alerts' tıklayınız.

            Show Alert Box'a tıklayınız.

            Ok'a tıklayınız.

            Alert kapanmalıdır.
     */
    @Test
    public void Test(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        driver.findElement(By.cssSelector("a[id='fakealerttest']")).click();
        driver.findElement(By.cssSelector("input[id='fakealert']")).click();
        MyFunc.Bekle(1.5);
        driver.findElement(By.cssSelector("button[id='dialog-ok']")).click();
        //new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.alertIsPresent());
        //driver.switchTo().alert().accept();

        driverStop();

    }
}

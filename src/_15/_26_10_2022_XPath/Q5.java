package _15._26_10_2022_XPath;

import Utility.BaseDriverEdge;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;

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

        driver.findElement(By.xpath("//a[@id='fakealerttest']")).click();
        driver.findElement(By.xpath("//input[@id='fakealert']")).click();
        MyFunc.Wait(1.5);
        driver.findElement(By.xpath("//button[@id='dialog-ok']")).click();
        //new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.alertIsPresent());
        //driver.switchTo().alert().accept();

        driverStop();

    }
}

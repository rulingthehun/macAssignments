package _15._26_10_2022_XPath;

import Utility.BaseDriverEdge;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;

public class Q6 extends BaseDriverEdge {
    /*
                 6-

             Bu siteye gidiniz.  https://testpages.herokuapp.com/styled/index.html

             Fake Alerts'e tıklayınız.

             Show modal dialog buttonuna tıklayınız.

             Ok'a tıklayınız.

             Alert kapanmalıdır.
     */
    @Test
    public void Test(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.xpath("//a[@id='fakealerttest']")).click();
        driver.findElement(By.xpath("//input[@id='fakealert']")).click();
        MyFunc.Bekle(1.5);
        driver.findElement(By.xpath("//button[@id='dialog-ok']")).click();

        driverStop();
    }
}

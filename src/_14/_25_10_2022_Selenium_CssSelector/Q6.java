package _14._25_10_2022_Selenium_CssSelector;

import Utility.BaseDriverEdge;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

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
        driver.findElement(By.cssSelector("a[id='fakealerttest']")).click();
        driver.findElement(By.cssSelector("input[id='modaldialog']")).click();
        MyFunc.Wait(1.5);
        driver.findElement(By.cssSelector("button[id='dialog-ok']")).click();

        driverStop();
    }
}

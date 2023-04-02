package _14._25_10_2022_Selenium_CssSelector;

import Utility.BaseDriverEdge;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Q3 extends BaseDriverEdge {
    /*
            3-
        1) Bu siteye gidin. -> https://www.snapdeal.com/

        2) "teddy bear" aratın ve  Search butonuna tıklayın.

        3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
        Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
     */
    @Test
    public void Test(){
        driver.get("https://www.snapdeal.com/");

        WebElement inputValEnter = driver.findElement(By.cssSelector("input[id='inputValEnter']"));
        inputValEnter.sendKeys("teddy bear");

        driver.findElement(By.cssSelector("button[class='searchformButton col-xs-4 rippleGrey']")).click();

        WebElement searchMessage = driver.findElement(By.cssSelector("div[id='searchMessageContainer']>div[class='search-result-txt-section  marT12']"));
        Assert.assertTrue("Wrong enter", searchMessage.getText().contains(" results for teddy bear"));

        driverStop();
    }
}

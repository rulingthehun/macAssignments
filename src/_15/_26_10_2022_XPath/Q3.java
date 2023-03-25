package _15._26_10_2022_XPath;

import Utility.BaseDriverEdge;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

        WebElement inputValEnter = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
        inputValEnter.sendKeys("teddy bear");

        driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();

        WebElement searchMessage = driver.findElement(By.xpath("//div[@id='searchMessageContainer']//div[@class]"));
        Assert.assertTrue("Wrong enter", searchMessage.getText().contains(" results for teddy bear"));

        driverStop();
    }
}

package _14._25_10_2022_Selenium_CssSelector;

import Utility.BaseDriverEdge;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Q2 extends BaseDriverEdge {
    /*
             2-
         1) Bu siteye gidin. -> https://demo.applitools.com/

         2) Username kısmına "ttechno@gmail.com" girin.

         3) Password kısmına "techno123." girin.

         4) "Sign in" buttonunan tıklayınız.

         5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.

     */
    @Test
    public void Test(){
        driver.get("https://demo.applitools.com/");

        WebElement username = driver.findElement(By.cssSelector("input[placeholder='Enter your username']"));
        username.sendKeys("ttechno@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("input[placeholder='Enter your password']"));
        password.sendKeys("techno123.");

        driver.findElement(By.cssSelector("a[id='log-in']")).click();

        WebElement text = driver.findElement(By.cssSelector("h6[id='time']"));
        Assert.assertTrue("Wrong enter", text.getText().contains("Your nearest branch closes in: 30m 5s"));

        driverStop();
    }
}

package _17_07_11_2022_Selenium_Wait_Scroll_Odevleri_Robot_Class;

import Utility.BaseDriverChrome;
import Utility.BaseDriverEdge;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Q4 extends BaseDriverChrome {
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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.xpath("//span[text()='Alerts']")).click();
        driver.findElement(By.id("timerAlertButton")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        String alertText = driver.switchTo().alert().getText();
        Assert.assertEquals("Wrong alert", "This alert appeared after 5 seconds", alertText);
        driver.switchTo().alert().accept();
        driverStop();
    }
}
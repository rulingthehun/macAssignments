package _17_07_11_2022_Selenium_Wait_Scroll_Odevleri_Robot_Class;

import Utility.BaseDriverChrome;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Q5 extends BaseDriverChrome {
    /*
                  5-
            Senaryo
            1) https://demoqa.com/dynamic-properties adresine gidin
            2) “Will enable 5 seconds” butonunun enable olmasini bekleyin
            3) “Will enable 5 seconds” butonunun enable oldugunu test edin
     */
    @Test
    public void Test(){
        driver.get("https://demoqa.com/dynamic-properties");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement enableAfterButton = driver.findElement(By.id("enableAfter"));
        wait.until(ExpectedConditions.elementToBeClickable(enableAfterButton));
        Assert.assertTrue("Button is not enable", enableAfterButton.isEnabled());
        driverStop();
    }
}
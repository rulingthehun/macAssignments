package _17_07_11_2022_Selenium_Wait_Scroll_Odevleri_Robot_Class;

import Utility.BaseDriverChrome;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Q6 extends BaseDriverChrome {
    /*
                6-
             Senaryo
             https://demoqa.com/dynamic-properties adresine gidin
             1) “Visible After 5 seconds” butonunun gorunur olmasini bekleyin
             2) “Visible After 5 seconds” butonunun gorunur oldugunu test edin
     */
    @Test
    public void Test(){
        driver.get("https://demoqa.com/dynamic-properties");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement visibleAfter = driver.findElement(By.id("visibleAfter"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
        Assert.assertTrue("The button is not visible", visibleAfter.isDisplayed());
        driverStop();
    }
}
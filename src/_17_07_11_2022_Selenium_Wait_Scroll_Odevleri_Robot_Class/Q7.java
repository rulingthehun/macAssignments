package _17_07_11_2022_Selenium_Wait_Scroll_Odevleri_Robot_Class;

import Utility.BaseDriverChrome;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Q7 extends BaseDriverChrome {
    /*
                7-Senaryo
            https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
            1) “Add Element” butona basin
            2) “Delete” butonu gorunur oluncaya kadar bekleyin
            3) “Delete” butonunun gorunur oldugunu test edin
            4) Delete butonuna basarak butonu silin
            5) Delete butonunun gorunmedigini test edin
     */
    @Test
    public void Test() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        List<WebElement> deleteButton = driver.findElements(By.xpath("//*[text()='Delete']"));
        wait.until(ExpectedConditions.visibilityOf(deleteButton.get(0)));
        Assert.assertTrue("Delete button is not visible", deleteButton.get(0).isDisplayed());
        MyFunc.Wait(2);
        deleteButton.get(0).click();
        wait.until(ExpectedConditions.invisibilityOf(deleteButton.get(0)));
        deleteButton.clear();
        Assert.assertEquals("Delete button is visible", 0, deleteButton.size());
        driverStop();
    }
}
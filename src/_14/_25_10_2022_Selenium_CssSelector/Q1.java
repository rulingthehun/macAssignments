package _14._25_10_2022_Selenium_CssSelector;

import Utility.BaseDriverEdge;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Q1 extends BaseDriverEdge {
    /*

1) Bu siteye gidin. ->  http://demoqa.com/text-box

2) Full Name kısmına "Automation" girin.

3) Email kısmına "testing@gmail.com" girin.

4) Current Address kısmına "Testing Current Address" girin.

5) Permanent Address kısmına "Testing Permanent Address" girin.

6) Submit butonuna tıklayınız.

7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.

8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

*/
    @Test
    public void Test(){
        driver.get("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.cssSelector("input[placeholder='Full Name']"));
        fullName.sendKeys("Automation");

        WebElement userEmail = driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
        userEmail.sendKeys("testing@gmail.com");

        WebElement currentAddress = driver.findElement(By.cssSelector("textarea[placeholder='Current Address']"));
        currentAddress.sendKeys("Testing Current Address");

        WebElement button = driver.findElement(By.cssSelector("div>button[type='button']"));
        button.click();

        new Actions(driver).scrollByAmount(0, 500).build().perform();

        WebElement name = driver.findElement(By.cssSelector("p[id='name']"));
        Assert.assertTrue("Wrong enter", name.getText().contains("Automation"));

        WebElement email = driver.findElement(By.cssSelector("p[id='email']"));
        Assert.assertTrue("Wrong enter", email.getText().contains("testing"));

        driverStop();

    }
}

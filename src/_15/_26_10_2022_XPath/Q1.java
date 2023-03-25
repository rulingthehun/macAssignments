package _15._26_10_2022_XPath;

import Utility.BaseDriverEdge;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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

        WebElement fullName = driver.findElement(By.xpath("//input[@id='userName']"));
        fullName.sendKeys("Automation");

        WebElement userEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
        userEmail.sendKeys("testing@gmail.com");

        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddress.sendKeys("Testing Current Address");

        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddress.sendKeys("Testing Permanent Address");

        WebElement button = driver.findElement(By.xpath("//button[@id='submit']"));
        button.click();

        new Actions(driver).scrollByAmount(0, 500).build().perform();

        WebElement name = driver.findElement(By.xpath("//p[@id='name']"));
        Assert.assertTrue("Wrong enter", name.getText().contains("Automation"));

        WebElement email = driver.findElement(By.xpath("//p[@id='email']"));
        Assert.assertTrue("Wrong enter", email.getText().contains("testing"));

        driverStop();

    }
}

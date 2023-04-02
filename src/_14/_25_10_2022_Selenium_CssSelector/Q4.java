package _14._25_10_2022_Selenium_CssSelector;

import Utility.BaseDriverEdge;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Q4 extends BaseDriverEdge {
    /*
        4-

           Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]

           Calculate'e tıklayınız.

           İlk input'a herhangi bir sayı giriniz.

           İkinci input'a herhangi bir sayı giriniz.

           Calculate button'una tıklayınız.

           Sonucu alınız.

           Sonucu yazdırınız.
     */
    @Test
    public void Test(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        new Actions(driver).scrollByAmount(0, 2000).build().perform();
        driver.findElement(By.cssSelector("a[id='calculate']")).click();

        WebElement number1 = driver.findElement(By.cssSelector("input[id='number1']"));
        number1.sendKeys("370");
        WebElement number2 = driver.findElement(By.cssSelector("input[id='number2']"));
        number2.sendKeys("88");

        driver.findElement(By.cssSelector("input[id='calculate']")).click();

        WebElement answer = driver.findElement(By.cssSelector("span[id='answer']"));
        System.out.println("Answer = " + answer.getText());

        driverStop();
    }
}

package _17_07_11_2022_Selenium_Wait_Scroll_Odevleri_Robot_Class;

import Utility.BaseDriverChrome;
import Utility.BaseDriverEdge;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Q2 extends BaseDriverChrome {
    /*
               2-
           Senaryo
           1- https://www.youtube.com/ adresine gidiniz
           2- "Selenium" kelimesi ile video aratınız.
           3- Listelenen sonuçlarda 80 videoaya kadar lsiteyi uzatınız.
           4- Son videonun title ını yazdırınız.
     */
    @Test
    public void Test(){
        driver.get("https://www.youtube.com/");
        List<WebElement> acceptCookies = driver.findElements(By.xpath("(//*[@class='yt-spec-touch-feedback-shape__fill'])[12]"));
        if (acceptCookies.size() > 0)
            acceptCookies.get(0).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        MyFunc.Wait(3.6);
        WebElement searchButton = driver.findElement(By.cssSelector("input[id='search']"));
        searchButton.sendKeys("selenium");
        MyFunc.Wait(1);
        searchButton.sendKeys(Keys.ENTER);

        MyFunc.Wait(0.6);

        List<WebElement> videos;
        do {
            videos = driver.findElements(By.cssSelector("h3[class*='style-scope']>[id='video-title']"));
            //WebElement theVideo = videos.get(videos.size()-1);
            //new Actions(driver).scrollToElement(theVideo).build().perform();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 3100);");
        }while (videos.size()<80);
        MyFunc.Wait(1.6);

        System.out.println("Last video title = " + videos.get((videos.size())-1).getText());
        driverStop();
    }
}

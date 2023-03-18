package _31_10_2022_ActionAssignment;

import Utility.BaseDriverFirefox;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
// Ödev : 1  http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
// buradaki ülke ve şehirleri findElements ile topluca bularak bir döngü ile bütün şehirleri doğru ülkere dağıtınız.



public class ActionSeleniumOdev1 extends BaseDriverFirefox {
    public static void main(String[] args) {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        Actions actions=new Actions(driver);

        MyFunc.Bekle(2);
        List<WebElement> cities=driver.findElements(By.cssSelector("div[id='answerDiv']>div"));
        List<WebElement> destBoxes=driver.findElements(By.cssSelector("div[id='questionDiv']>div[class='destinationBox']"));

        for (WebElement city : cities) {
            for (WebElement destBox : destBoxes) {
                actions.clickAndHold(city).perform();
                actions.moveToElement(destBox) .release().perform();
                if (city.getAttribute("class").equals("correctAnswer"))
                    break;
            }
        }

        MyFunc.Bekle(3);
        driver.quit();
    }
}

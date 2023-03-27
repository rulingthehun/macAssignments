package _16._31_10_2022_ActionAssignment;

import Utility.BaseDriverFirefox;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

public class dragCapitals extends BaseDriverFirefox {
    @Test
    public void Test(){
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        driver.manage().deleteAllCookies();

        Actions actions = new Actions(driver);

        MyFunc.Wait(0.5);
        List<WebElement> cities = driver.findElements(By.cssSelector("div[id='answerDiv']>div"));
        List<WebElement> destBox = driver.findElements(By.cssSelector("div[id='questionDiv']>div[class='destinationBox']"));

        for (WebElement e : cities) {
            for (WebElement d : destBox) {
                actions.dragAndDrop(e, d).build().perform();
                if (e.getAttribute("class").equals("correctAnswer"))
                    break;
            }
        }

        MyFunc.Wait(3);
        driverStop();
    }
}

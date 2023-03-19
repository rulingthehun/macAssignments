package _31_10_2022_ActionAssignment;

import Utility.BaseDriverChrome;
import Utility.BaseDriverFirefox;
import Utility.BaseDriverSafari;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class dragCities extends BaseDriverFirefox {
    @Test
    public void Test() {
        Actions actions = new Actions(driver);
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
        driver.manage().deleteAllCookies();

        List<WebElement> cities = driver.findElements(By.cssSelector("#allItems>li"));
        List<WebElement> boxes = driver.findElements(By.cssSelector("[id^='box']"));

        for (WebElement e : cities) {
            String groupId = e.getAttribute("groupid");
            switch (groupId) {
                case "box1" : actions.dragAndDrop(e, boxes.get(0)).build().perform(); break;
                case "box2" : actions.dragAndDrop(e, boxes.get(1)).build().perform(); break;
                case "box3" : actions.dragAndDrop(e, boxes.get(2)).build().perform(); break;
                case "box4" : actions.dragAndDrop(e, boxes.get(3)).build().perform(); break;
                case "box5" : actions.dragAndDrop(e, boxes.get(4)).build().perform(); break;
                case "box6" : actions.dragAndDrop(e, boxes.get(5)).build().perform(); break;
                case "box7" : actions.dragAndDrop(e, boxes.get(6)).build().perform(); break;
            }
        }
        driver.switchTo().alert().accept();
        MyFunc.Bekle(3.2);
        driverStop();
    }
}

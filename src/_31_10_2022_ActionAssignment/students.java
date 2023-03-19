package _31_10_2022_ActionAssignment;

import Utility.BaseDriverFirefox;
import Utility.BaseDriverSafari;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class students extends BaseDriverFirefox {
    @Test
    public void Test(){
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");
        driver.manage().deleteAllCookies();
        Actions actions = new Actions(driver);

        List<WebElement> students = driver.findElements(By.cssSelector("ul[id='allItems']>*"));
        List<WebElement> boxes = driver.findElements(By.cssSelector("div[id='dhtmlgoodies_mainContainer']>*"));

        for (WebElement e : students)
            for (WebElement b : boxes)
                actions.dragAndDrop(e, b).build().perform();
        driverStop();
    }
}

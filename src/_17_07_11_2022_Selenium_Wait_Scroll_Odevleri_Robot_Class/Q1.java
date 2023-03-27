package _17_07_11_2022_Selenium_Wait_Scroll_Odevleri_Robot_Class;

import Utility.BaseDriverEdge;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Q1 extends BaseDriverEdge {
    /*
    Senaryo
    1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
    2- random 100 e kadar 2 sayı üretiniz.
    3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
    4- Sonuçları Assert ile kontrol ediniz.
    5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.
 */
    @Test
    public void Test(){
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        //new Actions(driver).scrollByAmount(0, 1000).build().perform();
        int randomNumber1 = (int) (Math.random() * 100);
        int randomNumber2 = (int) (Math.random() * 100);
        System.out.println("randomNumber1 = " + randomNumber1);
        System.out.println("randomNumber2 = " + randomNumber2);
        driver.findElement(By.id("number1Field")).sendKeys(Integer.toString(randomNumber1));
        driver.findElement(By.id("number2Field")).sendKeys(Integer.toString(randomNumber2));
        Select selectOperation = new Select(driver.findElement(By.id("selectOperationDropdown")));
        List<WebElement> option = driver.findElements(By.cssSelector("select[id='selectOperationDropdown']>option"));
        int num = 0;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        for (WebElement e : option) {
            selectOperation.selectByIndex(num);
            String operation = selectOperation.getAllSelectedOptions().get(0).getText();
            System.out.println("operation = " + operation);
            WebElement calculateButton = driver.findElement(By.id("calculateButton"));
            calculateButton.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated
                    (By.xpath("//label[text()='Answer']")));
            WebElement answer = driver.findElement(By.id("numberAnswerField"));
            int result;
            switch (operation){
                case "Add" :
                    MyFunc.Wait(0.8);
                    result = randomNumber1 + randomNumber2;
                    System.out.println("answer = " + answer.getAttribute("value"));
                    Assert.assertEquals("Wrong answer", Integer.toString(result),
                            answer.getAttribute("value"));
                    System.out.println("******************");
                    break;
                case "Subtract" :
                    MyFunc.Wait(0.8);
                    result = randomNumber1 - randomNumber2;
                    System.out.println("answer = " + answer.getAttribute("value"));
                    Assert.assertEquals("Wrong answer", Integer.toString(result),
                            answer.getAttribute("value"));
                    System.out.println("******************");
                    break;
                case "Multiply" :
                    MyFunc.Wait(0.8);
                    result = randomNumber1 * randomNumber2;
                    System.out.println("answer = " + answer.getAttribute("value"));
                    Assert.assertEquals("Wrong answer", Integer.toString(result),
                            answer.getAttribute("value"));
                    System.out.println("******************");
                    break;
                case "Divide" :
                    MyFunc.Wait(0.8);
                    double dResult = (double) randomNumber1 / (double) randomNumber2;
                    System.out.println("answer = " + answer.getAttribute("value"));
                    Assert.assertEquals("Wrong answer", Double.toString(dResult),
                            answer.getAttribute("value"));
                    System.out.println("******************");
                    break;
                case "Concatenate" :
                    MyFunc.Wait(0.8);
                    String sResult = randomNumber1 + Integer.toString(randomNumber2);
                    System.out.println("answer = " + answer.getAttribute("value"));
                    Assert.assertEquals("Wrong answer", sResult,
                            answer.getAttribute("value"));
                    System.out.println("******************");
                    break;
            }
            MyFunc.Wait(0.45);
            num++;
        }
        MyFunc.Wait(3);
        driverStop();

    }
}

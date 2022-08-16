import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsPage extends BaseClass{

    public AlertsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, new WebDriverWait(driver, Duration.ofSeconds(10)));
    }
    public void NavigateToUrl(){
        Driver().navigate().to("https://demo.automationtesting.in/Alerts.html");
    }
    public void AllOtherStuff(){
//        driver.navigate().to("https://demo.automationtesting.in");
////        driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='#Textbox']"))).click();
//        Thread.sleep(3000);
//
//        driver.findElement(By.cssSelector(".btn-info")).click(); // here you forgot to press click
//        Thread.sleep(3000);
//        Alert alertFirst = driver.switchTo().alert();
//        alertFirst.sendKeys("Trayana");
//        alertFirst.accept();
//
//        // Assert.assertEquals(driver.switchTo().alert().getText(), "Hello Trayana How are you today"); HERE THE ALERT IS NOT PRESENT AFTER YOU ENTER STH IN IT
//        // SO YOU HAVE TO ASSERT THE MESSAGE THAT COMES FROM THE PAGE
//
//        String actualResult= driver.findElement(By.id("demo1")).getText();
//        Assert.assertEquals("Hello Trayana How are you today", actualResult);
    }
}

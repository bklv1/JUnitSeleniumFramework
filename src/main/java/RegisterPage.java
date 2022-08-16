import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class RegisterPage extends BaseClass{

    public RegisterPage(WebDriver driver, WebDriverWait wait) {
        super(driver, new WebDriverWait(driver, Duration.ofSeconds(10)));
    }
    public void NavigateToRegisterUrl(){
        Driver().navigate().to("https://demo.automationtesting.in/Register.html");
    }
//    By firstName = By.xpath("//input[@ng-model='FirstName']");
//    By lastName = By.xpath("//input[@ng-model='LastName']");

    public WebElement nameXpath(String firstOrLastName){
        WebElement element;
        element= Wait().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@ng-model='"+firstOrLastName+"']")));
        return element;
    }
    By allCheckBoxes = By.xpath("//input[@type='checkbox']");

    public void EnterFirstName(String enterFirstName){
       nameXpath("FirstName").sendKeys(enterFirstName);
    }
    public void EnterLastName(String enterLastName){
       nameXpath("LastName").sendKeys(enterLastName);
    }
    public void ClickOnAllCheckBoxes(){
      List<WebElement> checkboxes= Wait().until(ExpectedConditions.presenceOfAllElementsLocatedBy(allCheckBoxes));
      for (WebElement element : checkboxes){
          element.click();
      }
    }

}

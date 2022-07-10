import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FirstPage extends BaseClass {
    public FirstPage(WebDriver driver) {
        super(driver, new WebDriverWait(driver, Duration.ofSeconds(10)));
    }
    public void NavigateToWebpage(){
        getDriver().navigate().to("http://demo.automationtesting.in/Register.html");
    }
    public WebElement FindElementByPlaceholder(String tagName, String attributeName, String value){
       WebElement element= getDriver().findElement(By.xpath("//"+tagName+"[@"+attributeName+"=\""+value+"\"]"));
       return element;
    }
    public List<WebElement> FindAllCheckboxes(){
        List<WebElement> collection = getDriver().findElements(By.xpath("//input[@type='checkbox']"));
        return collection;
    }
    public WebElement SelectGender(String gender){
        WebElement element= getDriver().findElement(By.xpath("//input[@value='"+gender+"']"));
        return element;
    }

    public  void RegisterOnlyWithRequiredFields(){

            String firstName = "Ivana";
            String lastName = "Petrova";
            String validEmail = "ipetrova@mail.com";
            String validPhone = "0884136665";
            String invalidPhone = "nevaliden098";
            String gender = "FeMale";

            FindElementByPlaceholder("input", "placeholder", "First Name").sendKeys(firstName);
            FindElementByPlaceholder("input", "placeholder", "Last Name").sendKeys(lastName);
            FindAllCheckboxes().get(1).click();
            getDriver().findElement(By.id("eid")).findElement(By.tagName("input")).sendKeys(validEmail);
            getDriver().findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(4) > div > input")).sendKeys(validPhone);
            SelectGender(gender).click();
//            getDriver().findElement(By.id("countries")).findElement(By.tagName("option")).click();
            var submitButton =getDriver().findElement(By.xpath("//button[@type='submit']"));
            Actions actions = new Actions(getDriver());
            actions.moveToElement(submitButton).perform();
            getDriver().findElement(By.tagName("path")).click(); //this will hide the ad so our element can be clicked
            new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(submitButton)).click();

            getWait().until(ExpectedConditions.elementToBeClickable(submitButton));

    }
}




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstPage extends BaseClass {

    public FirstPage(WebDriver driver) {
        super(driver,new WebDriverWait(driver, Duration.ofSeconds(10)));
    }

    public void NavigateToWebpage(){
        Driver().navigate().to("https://demo.automationtesting.in/Index.html");
    }
//     By emailField = By.id("name"); // this is with regular POM

//    @FindBy(id="name")
//    WebElement emailField;  //This is with Page Factory

    @FindBy(id="email")
    WebElement email;

    @FindBy(id="enterimg")
    WebElement clickArrow;

    public void EnterMail(){
        //PageFactory.initElements(Driver(), this); // With Page Factory
        PageFactory.initElements(Driver(),this);
        email.sendKeys("ceco@mail.ceco");
        clickArrow.click();
//        Driver().findElement(emailField).sendKeys("opa"); //Regular POM
    }
}



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
    private WebDriver driver;
    private WebDriverWait wait;

    public BaseClass(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public WebDriver getDriver() {
        return driver;
    }
    public WebDriverWait getWait(){
        return wait;
    }

}

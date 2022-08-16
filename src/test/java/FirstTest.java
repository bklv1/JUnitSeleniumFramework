import org.junit.Assert;
import org.junit.Test;

public class FirstTest extends TestBase{
//    @Test
//    public void MyTest() {
//        FirstPage fp = new FirstPage(driver);
//        fp.NavigateToWebpage();
//        fp.EnterMail();
//
//    }

    @Test
    public void OnlyFirstAndLastName(){
        RegisterPage page = new RegisterPage(driver, wait);
        page.NavigateToRegisterUrl();
        page.EnterFirstName("Tsvetomir");
        page.EnterLastName("Banovski");
        page.ClickOnAllCheckBoxes();
        var stop=0;
    }
    @Test
    public void HomePageTest(){
        FirstPage firstPage = new FirstPage(driver);
        firstPage.NavigateToWebpage();
        firstPage.EnterMail();
        var stop=0;
    }
}

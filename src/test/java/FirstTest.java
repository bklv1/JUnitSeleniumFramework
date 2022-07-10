import org.junit.Assert;
import org.junit.Test;

public class FirstTest extends TestBase{
    @Test
    public void MyTest() {
        FirstPage fp = new FirstPage(driver);
        fp.NavigateToWebpage();
        fp.RegisterOnlyWithRequiredFields();

    }

}

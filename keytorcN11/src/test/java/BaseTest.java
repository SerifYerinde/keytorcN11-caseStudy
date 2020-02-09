import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    //browserı açıp urle gidecek driver tanımlandı
    public static WebDriver driver;
    //gidilecek Url tanımlandı
    public String baseUrl="http://www.n11.com";
    public Logger log= LogManager.getLogger(getClass().getName());
}

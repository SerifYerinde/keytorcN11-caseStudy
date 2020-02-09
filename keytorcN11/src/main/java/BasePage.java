import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {
    protected WebDriver driver;//web driver tanımlandı
    private WebDriverWait wait;


    public BasePage(WebDriver driver) {
        //Testten gelen web driver için null dönmemesi gerektiğinden ve program ilk yüklendiğinde driver hazır olması için (constructor) tanımlandı.
        this.driver = driver;
        wait=new WebDriverWait(driver, 20);
            System.out.println("N11 anasayfasına hoşgeldiniz");
        }




    public WebElement element(By Locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
        return driver.findElement(Locator);
        //Web element için global değişken tanımlandı. Parametre olarak verdiğimiz locatorı bulup o web elementi bize dönecektir
    }
    public void sendKeys(By Locator, String value){
        element(Locator).sendKeys(value);
    }
    public void selectElement(WebElement element, String value){
        Select select= new Select(element);
        select.selectByValue(value);
    }
}

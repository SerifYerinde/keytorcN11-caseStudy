import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class LogInFunction extends BasePage {
    public LogInFunction(WebDriver driver) {
        super(driver);
    }
    private By email=By.id("email");
    private By password=By.id("password");
    private By loginButton=By.id("loginButton");
    private By searchData=By.id("searchData");
    private By iconSearch=By.cssSelector(".iconSearch");
    private By samsungList=By.xpath("//h3[@class='productName ']");
    private By second=By.cssSelector(".pagination > a:nth-child(2)");
    private By secondActive=By.cssSelector(".pagination > .active");
    private By thirdProduct=By.xpath("//li[3]/div/div/span");
    private By thirdProductName=By.xpath("//div[2]/ul/li[3]/div/div/a/h3");
    private By favoritePageLink=By.linkText("Favorilerim / Listelerim");
    private By topMenu=By.xpath("//div[2]/div[2]/div[2]/div");
    private By favoriteListItemTitle=By.cssSelector(".favorites .listItemTitle");
    private By favoriteDelete=By.xpath("//li[1]/div/div[3]/span");
    private By favoriteDeleteConfirm=By.cssSelector(".btnBlack");
    private By favoriteProduct=By.xpath("//li[1]/div/div/a/h3");
    private By message=By.cssSelector(".message");


    public  void  LogInForm(){
        element(By.linkText("Giriş Yap")).click();
        sendKeys(email, "keytorc@proje.com");
        sendKeys(password, "keytorcprojeN11");
        element(loginButton).click();
        Assert.assertEquals(element(By.linkText("keytorc proje")).getText(), "keytorc proje");
        System.out.println("keytorc proje kullanıcısı ile login olundu");
        search();
        secondPage();
        favoritePage();
    }
public void search(){
        sendKeys(searchData, "samsung");
        element(iconSearch).click();
        String samsung=element(samsungList).getText();
    System.out.println(samsung+" ürünü bulundu");
    System.out.println(samsung.contains("Samsung")+ " samsung ürünü listede mevcut");

}
public void secondPage(){
    element(second).click();
    System.out.println(element(secondActive).getText() + ". sayfaya geçiş sağlandı");
    element(thirdProduct).click();
String favoriteAdded=element(thirdProductName).getText();
    System.out.println(favoriteAdded + " ürünü favorilere eklendi");
}

public void favoritePage(){
    Actions builder = new Actions(driver);
    builder.moveToElement(element(topMenu)).build().perform();
    element(favoritePageLink).click();
    element(favoriteListItemTitle).click();
    element(favoriteDelete).click();
    element(favoriteDeleteConfirm).click();
    System.out.println(element(favoriteProduct).getText()+element(message).getText());





}
}

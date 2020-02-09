import org.apache.log4j.MDC;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends BaseTest implements ITestListener {
    public void onTestStart(ITestResult ıTestResult) {
        driver.get(baseUrl);
        log.info("N11 anasayfasına giriş yapıldı");
    }

    public void onTestSuccess(ITestResult ıTestResult) {
        System.out.println("başarılı");
        log.info("başarılı");
    }

    public void onTestFailure(ITestResult ıTestResult) {
        System.out.println("fail");
        log.error("hata");
        //log4j ile loglama yapıldığında hata mesajını dosya içine yazdırmaktadır
        MDC.put("fail", ıTestResult.getThrowable());
        //Hata olduğu an program sonlandırılacaktır
        driver.quit();
    }

    public void onTestSkipped(ITestResult ıTestResult) {
        System.out.println("skip");
        log.warn("skip");

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult ıTestResult) {

    }

    public void onStart(ITestContext ıTestContext) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SerifYerinde\\Desktop\\otomasyon programlar\\chromedriver.exe");
        driver= new ChromeDriver();
        log.info("Browser Açıldı");

    }

    public void onFinish(ITestContext ıTestContext) {
        //driver.quit();
        log.info("Browser kapatıldı");
    }
}

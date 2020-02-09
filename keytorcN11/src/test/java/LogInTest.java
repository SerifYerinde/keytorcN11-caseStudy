
import org.testng.annotations.Listeners;
        import org.testng.annotations.Test;


@Listeners ({Listener.class})
public class LogInTest extends BaseTest {
    @Test
    public void LogInTestCase(){
        LogInFunction logInFunction=new LogInFunction(driver);
        logInFunction.LogInForm();
    }
}

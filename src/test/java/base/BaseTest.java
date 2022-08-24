package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import javax.print.DocFlavor;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    private EventFiringWebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        homePage = new HomePage(driver);
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions())); //listen for events
        driver.manage().timeouts().setScriptTimeout(1, TimeUnit.SECONDS);
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.register(new EventReporter());
        goHome();
        setCookie();


    }
    @BeforeMethod
    public void goHome()
    {
        driver.get("https://the-internet.herokuapp.com/"); //launch browser
    }
    @AfterClass
    public  void teardown()
    {
        System.out.println(driver.getTitle());
        driver.quit();
    }


    @AfterMethod

    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            //cast driver to Take Screenshot class
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                com.google.common.io.Files.move(screenshot, new File("resources/screenshots/" + result.getName()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public WindowManager getWindowManager()
    {
        return new WindowManager(driver);
    }

    private ChromeOptions getChromeOptions()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
      //  options.setHeadless(true); //run without opening browser
        return options;
    }
    private void setCookie() //creates cookie
    {
        Cookie cookie = new Cookie.Builder("tau", "123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }

}

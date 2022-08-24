package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;

import javax.print.DocFlavor;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().setScriptTimeout(1, TimeUnit.SECONDS);
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        goHome();
        homePage = new HomePage(driver);


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
    public void recordFailure(ITestResult result)
    {
        if(ITestResult.FAILURE== result.getStatus()) {
            //cast driver to Take Screenshot class
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/"+ result.getName()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}

package base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;
import utils.WindowManager;

import javax.print.DocFlavor;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
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
    public void takesScreenshot()
    {
        var camera = (TakesScreenshot)driver; //cast
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        Files.move(Screenshot, new File("resources/screenshots/test.png"))
        System.out.println("Screenshot taken: " + screenshot.getAbsolutePath());
    }

    public WindowManager getWindowManager()
    {
        return new WindowManager(driver);
    }
//    @AfterMethod
//<<<<<<< HEAD
//    public void recordFailure(ITestResult result)
//    {
//        if(ITestResult.FAILURE== result.getStatus()) {
//            //cast driver to Take Screenshot class
//            var camera = (TakesScreenshot) driver;
//            File screenshot = camera.getScreenshotAs(OutputType.FILE);
//            try {
//                com.google.common.io.Files.move(screenshot, new File("resources/screenshots/"+ result.getName()));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//=======
//        public void takesScreenshot()
//        {
//            var camera = (TakesScreenshot)driver; //cast
//            File screenshot = camera.getScreenshotAs(OutputType.FILE);
//            com.google.common.io.Files.move(Screenshot, new File("resources/screenshots/test.png"))
//            System.out.println("Screenshot taken: " + screenshot.getAbsolutePath());
//        }
//
//        public WindowManager getWindowManager()
//        {
//            return new WindowManager(driver);
//>>>>>>> 55f0ae8b25499e5eb516acfdb83cfdd4ba1564fa
//        }

}

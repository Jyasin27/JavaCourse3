package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import javax.print.DocFlavor;
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


}

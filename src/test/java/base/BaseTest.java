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
import java.util.List;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
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

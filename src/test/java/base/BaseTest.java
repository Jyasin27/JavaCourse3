package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;

import javax.print.DocFlavor;
import java.util.List;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
    @Test
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/"); //launch browser
        homePage = new HomePage(driver);
       // driver.manage().window().setSize(new Dimension(352, 400));


//       //find all links on pg and count them
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());
//
//        WebElement inputsLink = driver.findElement(By.linkText("Shifting Content"));
//        inputsLink.click();
//        driver.findElement(By.linkText("Example 1: Menu Element")).click();
//        List<WebElement> menu = driver.findElements(By.tagName("li"));
//        System.out.println(menu.size());




        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main(String args[])
    {
        BaseTest test = new BaseTest();
        test.setUp();
    }
}

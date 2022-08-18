package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;
    private By link_Example1 = By.xpath("//a[@href='/dynamic_loading/1']");
    private By link_Example2 = By.xpath("//a[@href='/dynamic_loading/2']");

    public DynamicLoadingPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExample1Link()
    {
        driver.findElement(link_Example1).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickLinkExample2()
    {
        driver.findElement(link_Example2).click();
        return new DynamicLoadingExample2Page(driver);
    }

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample2Page {

    private WebDriver driver;

    private By startBtn = By.xpath("//button[text()='Start']");
    private By loadedText = By.id("finish");

    public DynamicLoadingExample2Page(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickStartBtn()
    {
        driver.findElement(startBtn).click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText));

    }

    public String getLoadedText()
    {
       return driver.findElement(loadedText).getText();
    }


}

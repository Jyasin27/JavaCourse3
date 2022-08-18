package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample1Page {

    private WebDriver driver;
    private By startBtn =By.xpath("//div[@id='start']//button");
    private By loadingIndicator = By.id("loading");
    private By loadedText = By.id("finish");


    public DynamicLoadingExample1Page(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickStartBtn()
    {
        driver.findElement(startBtn).click();
//        WebDriverWait wait = new WebDriverWait(driver, 5); //for specific method
//        wait.until(ExpectedConditions.invisibilityOf(
//                driver.findElement(loadingIndicator)));

        FluentWait wait = new FluentWait(driver)           //like line 26
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(
                driver.findElement(loadingIndicator)));
    }
    public String getLoadedText()
    {
       return driver.findElement(loadedText).getText();

    }
}

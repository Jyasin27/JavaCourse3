package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample2Page {

    private WebDriver driver;

    private By startBtn = By.id("start");
    private By loadIndicator = By.id("loading");
    private By loadedText = By.xpath("//div[@id='finish']");

    public DynamicLoadingExample2Page(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickStartBtn()
    {
        driver.findElement(startBtn).click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadIndicator)));
    }

    public String getLoadedText()
    {
       return driver.findElement(loadedText).getText();
    }


}

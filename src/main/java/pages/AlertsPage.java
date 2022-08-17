package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    private WebDriver driver;
    private By triggerAlertBtn = By.xpath("//button[text()='Click for JS Alert']");
    private By results = By.id("result");
    private By jsConfirmBtn = By.xpath("//button[text()='Click for JS Confirm']");
    private By triggerPromptBtn = By.xpath("//button[text()='Click for JS Prompt']");

    public AlertsPage (WebDriver driver)
    {
        this.driver = driver;
    }

    public void triggerAlertBtn()
    {
        driver.findElement(triggerAlertBtn).click();
    }

    public void alert_clickToAccept()
    {
        driver.switchTo().alert().accept(); //click "OK" alert btn out of the dom
    }
    public String getResultText()
    {
      return   driver.findElement(results).getText();
    }

    public void jsConfirmBtn()
    {
        driver.findElement(jsConfirmBtn).click();
    }

    public void alert_clickToDismiss()
    {
        driver.switchTo().alert().dismiss();
    }
    public String alert_getText()
    {
       return driver.switchTo().alert().getText();
    }
    public String getResult()
    {
        return driver.findElement(results).getText();
    }

    public void triggerPromptBtn()
    {
        driver.findElement(triggerPromptBtn).click();
    }

    public void alert_setInput(String text)
    {
        driver.switchTo().alert().sendKeys(text);
    }


}

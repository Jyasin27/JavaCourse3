package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDomPage {

    private WebDriver driver;
    private By table = By.id("large-table");
    public LargeAndDeepDomPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void scrollToTable() //when page is in the dom
    {
        WebElement tableElement = driver.findElement(table);
        String script = "arguments[0].scrollIntoView();"; //function call
        ((JavascriptExecutor)driver).executeScript(script, tableElement); //cast the Java Script to driver
    }
}


package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WysiwygEditorPage {

    private WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIndentBtn = By.cssSelector("//button[@aria-label='Increase indent']");


    public WysiwygEditorPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void clearTextAre()
    {
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }
    public void setTextArea(String text)
    {
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }
    public String getTextFromEditor()
    {
        switchToEditArea();
      String text =  driver.findElement(textArea).getText();
      switchToMainArea();
      return text;
    }
    public void decreaseIndent ()
    {
        driver.findElement(decreaseIndentBtn).click();
    }
    private void switchToEditArea()
    {
        driver.switchTo().frame(editorIframeId); //only access thing in the html frame
    }

    public void switchToMainArea()
    {
        driver.switchTo().parentFrame();
    }



}

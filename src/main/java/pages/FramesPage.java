package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {

    private  WebDriver driver;
    private By nestedFramesBtn = By.linkText("Nested Frames");
    private By leftFrame = By.linkText("LEFT");
    private By bottomFrame = By.xpath("BOTTOM");
    public FramesPage(WebDriver driver)
    {
        this.driver = driver;

    }
    public void selectLeftFrame()
    {
        driver.switchTo().frame(String.valueOf(leftFrame));


    }
    public void selectBottomFrame()
    {
        driver.switchTo().frame(String.valueOf(bottomFrame));

    }

}

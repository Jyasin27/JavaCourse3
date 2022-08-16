package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By slider = By.xpath("//input[@type='range']");
    private By sliderValue = By.id("range");

    public HorizontalSliderPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void setSliderValue (String value) //explain please
    {
        while (!getValue().equals(value))
        {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }

    }
    public String getValue()
    {
        return driver.findElement(sliderValue).getText();
    }
}

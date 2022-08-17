package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ContextMenuPage {

    private WebDriver driver;
    private By box = By.id("hot-spot");

    public ContextMenuPage (WebDriver driver)
    {
        this.driver = driver;
    }

    public void rightClickInBox()
    {
        driver.findElement(box).sendKeys(Keys.RIGHT);
    }

//    public String alertText(String text)
//    {
//        ;
//    }

}

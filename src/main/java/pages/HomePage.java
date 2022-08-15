package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {


    private  WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication()
    {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown()
    {
        clickLink("DropDown");
        return new DropdownPage(driver);
    }

    public void clickLink(String linkText)
    {
        driver.findElement(By.linkText(linkText)).click();
    }
}


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

    public HoversPage clickHovers()
    {
        clickLink("Hovers");
        return  new HoversPage(driver);
    }
    public KeyPressesPage clickKeyPresses()
    {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public HorizontalSliderPage clickHorizontalSlider()
    {
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public AlertsPage clickJavaScriptAlert()
    {
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickUploadBtn()
    {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }


    public void clickLink(String linkText)
    {
        driver.findElement(By.linkText(linkText)).click();
    }

}


package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.management.DynamicMBean;
import java.nio.channels.MulticastChannel;

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

    public ContextMenuPage clickContextMenuBtn()
    {
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public WysiwygEditorPage clickWysiwygEditor()
    {
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoading()
    {
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public LargeAndDeepDomPage clickLargeAndDeepDom()
    {
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }
    public InfiniteScrollPage clickInfiniteScroll()
    {
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public FramesPage clickFramesPage()
    {
        clickLink("Frames");
        return new FramesPage(driver);
    }
    public MultipleWindowsPage clickMultipleWindows()
    {
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }
    public void clickLink(String linkText)
    {
        driver.findElement(By.linkText(linkText)).click();
    }

}


package navigation;

import base.BaseTest;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

    @Test
    public void testNavigation()
    {
        homePage.clickDynamicLoading().clickExample1Link();
        getWindowManager().goBack();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }
    @Test
    public void testSwitchTo()
    {
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }
}

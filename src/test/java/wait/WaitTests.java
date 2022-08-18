package wait;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTest {

    @Test
    public void testWaitUntilHidden()
    {
        var loadingPage = homePage.clickDynamicLoading().clickExample1Link();
        loadingPage.clickStartBtn();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");

    }
    @Test
    public void testWaitUntilHidden2()
    {
        var loadPage = homePage.clickDynamicLoading().clickLinkExample2();
        loadPage.clickStartBtn();
        assertEquals(loadPage.getLoadedText(), "Hello World!", "Load text for e.g.2 incorrect");
    }
}

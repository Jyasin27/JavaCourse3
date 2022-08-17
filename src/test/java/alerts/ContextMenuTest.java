package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTest {

    @Test
    public void contextClickTest()
    {
        var contextMenuPage = homePage.clickContextMenuBtn();
        contextMenuPage.rightClickInBox();
        String text = contextMenuPage.alert_textDisplayed();
        contextMenuPage.alert_clickAccept();
        assertEquals(text, "You selected a context menu");

    }
}

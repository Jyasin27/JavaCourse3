package hover;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTest extends BaseTest {

    @Test
    public void testHoverUser1()
    {
        var hoversPage = homePage.clickHovers();
        var caption= hoversPage.hoverOverFigure(1);
       assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed");
       assertEquals(caption.getTitle(), "name: user1","Caption title incorrect");
       assertEquals(caption.getLinkText(), "View profile", "Caption link text is incorrect");
       assertTrue(caption.getlink().endsWith("/users/1"), "Link incorrect");
    }
}

package slider;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTest extends BaseTest {

    @Test
    public void testSlider()
    {
        String value = "4";
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.setSliderValue(value);
        assertEquals(horizontalSliderPage.getValue(),value, "Slider value is incorrect");
    }

}

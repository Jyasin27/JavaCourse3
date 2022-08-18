package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTest extends BaseTest {

    @Test
    public void testWysiwyg()
    {
        var editorPage =  homePage.clickWysiwygEditor();
        editorPage.clearTextAre();

        String text1 = "Hello ";
        String text2 = "World";

        editorPage.setTextArea(text1);
        editorPage.increaseIndentBtn();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(), text1 +text2,
                "Text from editor is incorrect");

    }
}

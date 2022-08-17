package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTest {

    @Test
    public void testFileUpload()
    {
        var uploadPage = homePage.clickUploadBtn();
        uploadPage.uploadFile("C:\\Users\\jyasin\\IdeaProjects\\JavaCourse3\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(), "chromedriver.exe", "Upload files incorrect");
    }
}

package alerts;

import base.BasePage;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BasePage {

    @Test
    public  void testFileUpload(){
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        String absolutePathOfFile = "C:\\automation\\automation\\resources\\chromedriver.exe";
        fileUploadPage.uploadFile(absolutePathOfFile);

        assertEquals(fileUploadPage.getUploadedFiles(),
                "chromedriver.exe","Invalide file name");
    }


}

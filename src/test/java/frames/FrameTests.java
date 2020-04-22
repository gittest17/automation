package frames;

import base.BasePage;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BasePage {

    @Test
    public void testWysiwyg(){
        WysiwygEditorPage editorPage = homePage.clickWisiyigEditor();
        editorPage.clearTextArea();

        String text1 = "Hello";
        String test2 = "World";
        editorPage.setTextArea(text1);
        editorPage.decreaseIdentation();
        editorPage.setTextArea(test2);

        assertEquals(editorPage.getTextFromEditor(),
                text1 + test2, "Incorrect text");

    }


}

package javascript;

import base.BasePage;
import org.testng.annotations.Test;

public class JavaScriptTests extends BasePage {

    @Test
    public  void testScrollToTable(){
        homePage.clickLargeAndDeepDomPage().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        //homePage.clickInfiniteScroll().scrollToParagraph(5);
    }

}

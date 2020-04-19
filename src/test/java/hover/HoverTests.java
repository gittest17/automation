package hover;

import base.BasePage;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTests extends BasePage {

    @Test
    public void testHoverUser1(){

        HoversPage hoversPage = homePage.clickHovers();
        HoversPage.FigureCaption caption = hoversPage.hoverOverFigure(1);

        assertTrue(caption.isCaptureDispalayed(), "Caption is not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption title incorrect");
        assertEquals(caption.getLinkText(), "View profile", "caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Incorrect link");
    }
}

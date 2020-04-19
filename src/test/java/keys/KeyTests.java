package keys;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import pages.KeyPressesPage;

public class KeyTests extends BasePage {

    @Test
    public void testBackspace(){
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterText("A" + Keys.BACK_SPACE);

        assertEquals(keyPressesPage.getText(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPI(){
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterPI();
    }
}

package dropdown;

import base.BasePage;
import org.testng.annotations.Test;
import pages.DropDownPage;

public class DropDownTest extends BasePage {

    @Test
    public void testSelectOption(){
        DropDownPage dropDownPage = homePage.clickDropDown();
        dropDownPage.selectFromDropDown("Option 1");
        selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.

    }


}

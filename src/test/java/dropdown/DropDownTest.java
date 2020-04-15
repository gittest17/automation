package dropdown;

import base.BasePage;
import org.testng.annotations.Test;
import  pages.DropDownPage;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

public class DropDownTest extends BasePage {

    @Test
    public void testSelectOption(){
        DropDownPage dropDownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        List<String> selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");

    }


}

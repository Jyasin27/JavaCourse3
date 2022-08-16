package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTest {

    @Test
    public void testSelectOption(){
       var dropDownPage =  homePage.clickDropdown();
       String option = "Option 1";
       dropDownPage.selectFromDropdown("Option 1");
      var selectedOptions = dropDownPage.getSelectedOptions();
      assertEquals(selectedOptions.size(), 1, "incorrect number of selections");
      assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}

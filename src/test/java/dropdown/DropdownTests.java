package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

public class DropdownTests extends BaseTest {

    @Test
    public void testSelectOption(){
       var dropDownPage =  homePage.clickDropdown();
       dropDownPage.selectFromDropdown("Option 1");
      var selectedOptions = dropDownPage.getSelectedOptions();
      assertEquals(selectedOptions.size(), 1, "incorrect number of selections");
      assertTrue(selectedOptions.contains(option))
    }
}

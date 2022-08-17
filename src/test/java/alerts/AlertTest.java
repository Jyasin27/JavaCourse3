package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTest {

    @Test
    public void testAcceptAlert()
    {
      var alertsPage =  homePage.clickJavaScriptAlert();
      alertsPage.triggerAlertBtn();
      alertsPage.alert_clickToAccept();
      assertEquals(alertsPage.getResultText(), "You successfully clicked an alert");


    }
    @Test
    public void testGetTextFromAlert()
    {
        var alertsPage =  homePage.clickJavaScriptAlert();
        alertsPage.jsConfirmBtn();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testSetInputInAlert()
    {
        var alertPage = homePage.clickJavaScriptAlert();
        alertPage.triggerPromptBtn();

        String text = "TAU Rocks!";
        alertPage.alert_setInput(text);
        alertPage.alert_clickToAccept();

        assertEquals(alertPage.getResult(),"You entered: " + text, "Results test incorrect");
    }
}


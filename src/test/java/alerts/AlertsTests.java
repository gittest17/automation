package alerts;

import base.BasePage;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BasePage {

    @Test
    public void testAcceptAlert(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlert();
        alertsPage.trrigerAlert();
        alertsPage.alert_clickToAccept();

        assertEquals(alertsPage.getResult(),
                "You successfuly clicked an alert", "Incorrect message");
    }

    @Test
    public void testGetTextFromAlert(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlert();
        alertsPage.trrigerConfirm();

        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();

        assertEquals(text,"I am a JS Confirm", "Incorrect text alert");

    }

    @Test
    public void testSetInputInAlert(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlert();
        alertsPage.trrigerPrompt();

        String text = "TAU rocks!";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();

        assertEquals(alertsPage.getResult(), "You entered: " +text, "Incorrect alert text");
    }
}

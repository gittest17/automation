package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AlertsPage {

    private WebDriver driver;
    private By trrigerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By trrigerConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By trrigerPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");
    private By results = By.id("result");

    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void trrigerAlert(){
        driver.findElement(trrigerAlertButton).click();
    }
    public void trrigerConfirm(){
        driver.findElement(trrigerConfirmButton).click();
    }
    public void trrigerPrompt(){
        driver.findElement(trrigerPromptButton).click();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String getResult(){
        return driver.findElement(results).getText();
    }


}

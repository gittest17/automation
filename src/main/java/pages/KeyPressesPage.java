package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class KeyPressesPage {

    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultText = By.id("result");

    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public String getText(){
        return  driver.findElement(resultText).getText();
    }

    public void enterPI(){
        enterText(Keys.chord(Keys.ALT, "p") + "= 3.14");
    }
}

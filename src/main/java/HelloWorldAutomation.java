import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HelloWorldAutomation {

    private WebDriver driver;
    public String baseURL = "https://the-internet.herokuapp.com/";


    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        WebElement shiftContent = driver.findElement(By.linkText("Shifting Content"));
        shiftContent.click();

        WebElement example1 = driver.findElement(By.linkText("Example 1: Menu Element"));
        example1.click();

        List<WebElement> countMenu = driver.findElements(By.tagName("li"));
        System.out.println(countMenu.size());

        driver.quit();
    }

    public static void main(String[] args) {
        HelloWorldAutomation test = new HelloWorldAutomation();
        test.setUp();
    }
}

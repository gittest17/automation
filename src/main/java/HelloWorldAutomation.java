import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldAutomation {

    private WebDriver driver;
    public String baseURL = "https://the-internet.herokuapp.com/";


    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main(String[] args) {
        HelloWorldAutomation test = new HelloWorldAutomation();
        test.setUp();
    }
}

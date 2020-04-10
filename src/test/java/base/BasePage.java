package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BasePage {

    private WebDriver driver;
    public String baseURL = "https://the-internet.herokuapp.com/";
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();

        homePage = new HomePage(driver);


    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}

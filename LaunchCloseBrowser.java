import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class LaunchCloseBrowser {

    WebDriver driver;
    String browserType = "Chrome";

    @BeforeTest
    public void beforeActualTest(){

            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            driver.navigate().to("https://www.instacart.ca/");
    }

    @AfterTest
    public void TearDownEverything(){
        driver.quit();
    }
}

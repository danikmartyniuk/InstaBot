package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import utils.CapabilitiesGenerator;
import utils.TestListener;

@Listeners ({TestListener.class})
public class BaseTest {

    WebDriver driver;

    @BeforeTest
    public void setUp () {
        driver = new ChromeDriver(CapabilitiesGenerator.getChromeOptions());

    }

    @AfterTest
    public void close () {
        driver.quit();
    }

    public WebDriver getDriver () {
        return this.driver;
    }

}

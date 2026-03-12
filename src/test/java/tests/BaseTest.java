package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import base.DriverManager;
import constants.FrameworkConstants;
import pages.HomePage;

public class BaseTest {

    public static WebDriver driver;
    private static final Logger log = LogManager.getLogger(BaseTest.class);
    @BeforeMethod
    public void setup()
    {
    	log.info("opening the parabank page");
        driver=DriverManager.getDriver();
        driver.get(FrameworkConstants.URL);
    }
    @AfterMethod
    public void tearDown()
    {log.info("closing the browser");
        DriverManager.quitDriver();
    }

}

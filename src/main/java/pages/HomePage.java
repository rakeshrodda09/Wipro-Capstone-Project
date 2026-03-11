package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HomePage {

    WebDriver driver;
    private static final Logger log = LogManager.getLogger(HomePage.class);
    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }
    By logout=By.linkText("Log Out");
    public boolean isLoginSuccessful()
    {   log.info("verifying login is successful or not");
    try {
        return driver.findElement(By.linkText("Log Out")).isDisplayed();
    } catch (Exception e) {
        return false;
    }
    }
    public void logout()
    {
    	log.info("logging out");
        driver.findElement(logout).click();
    }

}

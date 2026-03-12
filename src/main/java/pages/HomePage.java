package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HomePage {
    WebDriver driver;
    private static final Logger log = LogManager.getLogger(HomePage.class);
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText="Log Out")
    WebElement logout;
    public boolean isLoginSuccessful()
    {
        log.info("verifying login success");
        try {
            return logout.isDisplayed();
        } catch(Exception e) {
            return false;
        }
    }
    public void logout()
    {
        log.info("logging out");
        logout.click();
    }
}

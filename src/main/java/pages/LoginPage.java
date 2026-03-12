package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginPage {
    WebDriver driver;
    private static final Logger log = LogManager.getLogger(LoginPage.class);
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(name="username")
    WebElement username;
    @FindBy(name="password")
    WebElement password;
    @FindBy(xpath="//input[@value='Log In']")
    WebElement loginBtn;
    public void login(String user,String pass)
    {
        log.info("entering username");
        username.sendKeys(user);
        log.info("entering password");
        password.sendKeys(pass);
        log.info("clicking login button");
        loginBtn.click();
    }
}
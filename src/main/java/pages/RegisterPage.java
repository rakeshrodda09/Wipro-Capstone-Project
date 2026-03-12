package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RegisterPage {
    WebDriver driver;
    private static final Logger log = LogManager.getLogger(RegisterPage.class);
    public RegisterPage(WebDriver driver)
    {
    	this.driver=driver;
        PageFactory.initElements(driver,this);
        }
    @FindBy(linkText="Register")
    WebElement registerLink;
    @FindBy(id="customer.firstName")
    WebElement firstName;
    @FindBy(id="customer.lastName")
    WebElement lastName;
    @FindBy(id="customer.address.street")
    WebElement address;
    @FindBy(id = "customer.address.city")
    WebElement city;
    @FindBy(id = "customer.address.state")
    WebElement state;
    @FindBy(id = "customer.address.zipCode")
    WebElement zip;
    @FindBy(id = "customer.phoneNumber")
    WebElement phone;
    @FindBy(id = "customer.ssn")
    WebElement ssn;
    @FindBy(id = "customer.username")
    WebElement username;
    @FindBy(id = "customer.password")
    WebElement password;
    @FindBy(id = "repeatedPassword")
    WebElement confirmPassword;
    @FindBy(xpath = "//input[@value='Register']")
    WebElement registerBtn;
    public void openRegister()
    {
    	log.info("opens the register form");
        registerLink.click();
    }
    public void registerUser(String user,String pass)
    {
    	log.info("entering registration details");
        firstName.sendKeys("Rakesh");
        lastName.sendKeys("Rodda");
        address.sendKeys("Gp2");
        city.sendKeys("Hyd");
        state.sendKeys("Tg");
        zip.sendKeys("50300");
        phone.sendKeys("9978632945");
        ssn.sendKeys("67469");
        username.sendKeys(user);
        password.sendKeys(pass);
        confirmPassword.sendKeys(pass);
        log.info("submitting registration form");
        registerBtn.click();
    }

}

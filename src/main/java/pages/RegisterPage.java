package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RegisterPage {
    WebDriver driver;
    private static final Logger log = LogManager.getLogger(RegisterPage.class);
    public RegisterPage(WebDriver driver)
    {
        this.driver=driver;
    }

    By registerLink=By.linkText("Register");
    By firstName=By.id("customer.firstName");
    By lastName=By.id("customer.lastName");
    By address=By.id("customer.address.street");
    By city=By.id("customer.address.city");
    By state=By.id("customer.address.state");
    By zip=By.id("customer.address.zipCode");
    By phone=By.id("customer.phoneNumber");
    By ssn=By.id("customer.ssn");
    By username=By.id("customer.username");
    By password=By.id("customer.password");
    By confirmPassword=By.id("repeatedPassword");
    By registerBtn=By.xpath("//input[@value='Register']");

    public void openRegister()
    {
    	log.info("opens the register form");
        driver.findElement(registerLink).click();
    }
    public void registerUser(String user,String pass)
    {
    	log.info("entering registration details");
        driver.findElement(firstName).sendKeys("Rakesh");
        
        driver.findElement(lastName).sendKeys("Rodda");
        
        driver.findElement(address).sendKeys("Gp2");
        
        driver.findElement(city).sendKeys("Hyd");
        
        driver.findElement(state).sendKeys("Tg");
        
        driver.findElement(zip).sendKeys("50300");
        
        driver.findElement(phone).sendKeys("9978632945");
        
        driver.findElement(ssn).sendKeys("67469");
        
        driver.findElement(username).sendKeys(user);
        
        driver.findElement(password).sendKeys(pass);
        
        driver.findElement(confirmPassword).sendKeys(pass);
        log.info("submitting registration form");
        driver.findElement(registerBtn).click();
    }

}

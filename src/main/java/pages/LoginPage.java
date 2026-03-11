package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginPage {
    WebDriver driver;
    private static final Logger log = LogManager.getLogger(LoginPage.class);
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }
    By username=By.name("username");
    By password=By.name("password");
    By loginBtn=By.xpath("//input[@value='Log In']");
    public void login(String user,String pass)
    {
    	log.info("entering username");
        driver.findElement(username).sendKeys(user);
        log.info("entering password");
        driver.findElement(password).sendKeys(pass);
        log.info("clicking on login button");
        driver.findElement(loginBtn).click();
    }

}
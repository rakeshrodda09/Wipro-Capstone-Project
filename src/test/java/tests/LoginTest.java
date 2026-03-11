package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	private static final Logger log = LogManager.getLogger(LoginTest.class);
    @Test
    public void loginTest()
    {
    	log.info("login test started");
        LoginPage login=new LoginPage(driver);
        log.info("entering username and password and performing login");
        login.login(RegisterTest.username,RegisterTest.password);
        HomePage home=new HomePage(driver);
        log.info("verifying login success on home page");
        Assert.assertTrue(home.isLoginSuccessful());
        log.info("login test completed");
    }

}

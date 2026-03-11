package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegisterPage;
import utils.RandomDataUtil;

public class RegisterTest extends BaseTest {

    public static String username;
    public static String password="pass123";
    private static final Logger log = LogManager.getLogger(RegisterTest.class);
    @Test
    public void registerUserTest()
    {
    	log.info("register test started");
        RegisterPage register=new RegisterPage(driver);
        log.info("generating a new username");
        username=RandomDataUtil.generateUsername();
        log.info("opening register page");
        register.openRegister();
        log.info("registering a new user with generated credentials");
        register.registerUser(username,password);

        HomePage home=new HomePage(driver);
        log.info("verifying if registration is successful");
        Assert.assertTrue(home.isLoginSuccessful());
        log.info("user registered successfully");
        log.info("register test completed");
    }

}

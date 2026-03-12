package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import testdata.TestData;

public class RegisterTest extends BaseTest {

    private static final Logger log = LogManager.getLogger(RegisterTest.class);
    @Test
    public void registerUserTest()
    {
    	log.info("register test started");
        RegisterPage register=new RegisterPage(driver);
        log.info("opening registration page");
        register.openRegister();
        log.info("generating a new username for registration");
        register.registerUser(TestData.username, TestData.password);
        HomePage home=new HomePage(driver);
        log.info("verifying if registration is successful");
        Assert.assertTrue(home.isLoginSuccessful(),"Registration failed");
        log.info("user registered successfully");
        log.info("register test completed");
    }

}

package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import testdata.TestData;

public class LogoutTest extends BaseTest {
	private static final Logger log = LogManager.getLogger(LogoutTest.class);
    @Test
    public void logoutTest()
    {
    	log.info("logout test started");
        LoginPage login=new LoginPage(driver);
        log.info("logging into the application with valid credentials");
        login.login(TestData.username, TestData.password);
        HomePage home=new HomePage(driver);
        log.info("performing logout");
        home.logout();
        log.info("user logged out successfully");
        log.info("logout test completed");
    }

}
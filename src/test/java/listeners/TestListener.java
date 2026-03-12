package listeners;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.*;
import reports.ExtentManager;
import tests.BaseTest;
import utils.ScreenshotUtil;

public class TestListener implements ITestListener {
    private static ExtentReports extent = ExtentManager.getInstance();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    private static final Logger log = LogManager.getLogger(TestListener.class);
    
    @Override
    public void onTestStart(ITestResult result) {
    	log.info(" Test started: " + result.getMethod().getMethodName());
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        log.info("Test passed: " + result.getMethod().getMethodName());
    	test.get().pass("Test Passed");
    }
    @Override
    public void onTestFailure(ITestResult result) {
    	log.error("Test failed:" + result.getMethod().getMethodName());
    	log.error("Failure reason:" + result.getThrowable());
        test.get().fail(result.getThrowable());
        try {
        	String path=ScreenshotUtil.captureScreenshot(BaseTest.driver,result.getMethod().getMethodName());
        	test.get().addScreenCaptureFromPath(path);
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        log.warn("Test skipped:" + result.getMethod().getMethodName());
    	test.get().skip("Test Skipped");
    }
    @Override
    public void onFinish(ITestContext context) {
        log.info("Test execution done and generating report");
    	extent.flush();   
    }
}

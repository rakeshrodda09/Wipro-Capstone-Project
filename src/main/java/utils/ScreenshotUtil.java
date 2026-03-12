package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class ScreenshotUtil {

    public static String captureScreenshot(WebDriver driver,String name)
    {
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String path="screenshots/failedTests/"+name+".png";

        try{
            FileUtils.copyFile(src,new File(path));
        }
        catch(IOException e){}

        return path;
    }

}
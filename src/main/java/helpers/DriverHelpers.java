package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class DriverHelpers {

    public static WebDriver firefoxDriverInit(){
        WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver",
                "/src/main/resources/geckodriver");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        return driver;
    }

    public static void closeSession(WebDriver driver, StringBuffer verificationErrors){
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}

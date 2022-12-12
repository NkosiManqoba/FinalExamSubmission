package BaseTests;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTests {

    protected static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }
    protected HomePage homePage;


    @BeforeSuite
    public void setUp() {

        System.setProperty("webdriver.chrome.driver","resources/chromedriverOLD.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(60 ,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(60 , TimeUnit.SECONDS);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(60 , TimeUnit.SECONDS);
        //homePage.clickMakeAppointment();
        homePage = new HomePage(driver);
        }


   @AfterMethod
    public void captureScreenshot(ITestResult testResult) {

        if (ITestResult.FAILURE == testResult.getStatus()) {

            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File(System.getProperty("user.dir") +
                    "/resources/screenshots/Failed Tests/" + testResult.getName() + "_" + testResult.getStartMillis() + "fail.png");

            try {
                FileHandler.copy(source, destination);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (ITestResult.SUCCESS == testResult.getStatus()) {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File(System.getProperty("user.dir") +
                    "/resources/screenshots/Passed Tests/" + testResult.getName() + "_" + testResult.getStartMillis() + "pass.png");
            try {
                FileHandler.copy(source, destination);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
   /* @AfterSuite
    public void tearDown(){
        driver.quit();
    }*/
}

package BaseTests;

import Pages.BookAppointmentPage;
import Pages.HomePage;
import Pages.LoginPage;
import com.sun.net.httpserver.Authenticator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTests {

    @Test(priority = 1,dataProvider = "loginDetails")
    public void loginTest(String userName , String password , boolean Success) {

     LoginPage loginPage = homePage.clickMakeAppointment();
      //  loginPage.getLoginText().equals("Please login to make appointment.");
       Assert.assertTrue(Success,loginPage.getLoginText());

    loginPage.sendUsername(userName);
    loginPage.sendPassword(password);
    loginPage.logIN();

    }
        @DataProvider
        public Object[][] loginDetails() {
            Object[][] data = new Object[1][3];
            data[0][0] = "John Doe";data[0][1]="ThisIsNotAPassword";data[0][2] = true;
            return data;
        }
    }


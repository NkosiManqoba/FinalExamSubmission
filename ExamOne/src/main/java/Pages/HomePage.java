package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

   private WebDriver driver;
    private By makeAppointment = By.id("btn-make-appointment");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickMakeAppointment(){
        driver.findElement(makeAppointment).click();
        return new LoginPage(driver);
    }

}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
     public WebDriver driver;

    // Declaring the fields on from the login page

    private By username = By.id("txt-username");
    private By password = By.id("txt-password");
    private By loginButton = By.id("btn-login");

    private By loginText = By.className("lead");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getLoginText(){
    return driver.findElement(loginText).getText();
    }



    // Method that will input my login details and click on submit button to login
    public void sendUsername(String Username) {
        driver.findElement(username).sendKeys(Username);

    }
    public void sendPassword(String inputPassword){
        driver.findElement(password).sendKeys(inputPassword);

    }
        public BookAppointmentPage logIN(){
        driver.findElement(loginButton).click();
       return new BookAppointmentPage(driver);
    }

}


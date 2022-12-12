package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppointmentConfirmation extends BookAppointmentPage {

        public WebDriver driver;
   /* public By facility = By.name("facility");
    public By reAdmission = By.name("hospital_readmission");
    public By healthProgram = By.id("radio_program_medicare");
    public By dateOfVisit = By.id("txt_visit_date");
    public By visitComments = By.id("txt_comment");
    public By submitButton = By.id("btn-book-appointment");*/

        private By goToHomePage = By.xpath("//*[@id=\"summary\"]/div/div/div[7]/p/a");
    public AppointmentConfirmation(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

  /*  public void assertFacility() {
        driver.findElement(facility).getText();
        System.out.println(facility);
    }
    public void assertReAdmission() {
        driver.findElement(reAdmission).getText();
        System.out.println(reAdmission);
    }
    public void assertHealthProgram() {
        driver.findElement(healthProgram).getText();
        System.out.println(healthProgram);
    }
    public void assertDateOfVisit() {
        driver.findElement(dateOfVisit).getText();
        System.out.println(dateOfVisit);
    }
    public void assertVisitComments() {
        driver.findElement(visitComments).getText();
        System.out.println(visitComments);
    }*/

    public void clickGoToHomePage(){
        driver.findElement(goToHomePage).click();

    }



}

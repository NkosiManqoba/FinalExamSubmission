package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BookAppointmentPage {

    public  WebDriver driver ;
    public By facility = By.id("facility");
    public By reAdmission = By.id("hospital_readmission");
    public By healthProgram = By.id("radio_program_medicare");
    public By dateOfVisit = By.id("txt_visit_date");
    public By visitComments = By.id("txt_comment");
    public By submitButton = By.id("btn-book-appointment");
    public BookAppointmentPage(WebDriver driver) {

        this.driver = driver;
    }
    public void setFacility(String Facility) {
        driver.findElement(facility).sendKeys(Facility);
    }

    public void setReAdmission() {
        driver.findElement(reAdmission).click();
    }
    public void setHealthcareProgram(String Program) {
        driver.findElement(healthProgram).sendKeys(Program);
    }
    public void setVisitDate(String VisitDate) {
        driver.findElement(dateOfVisit).sendKeys(VisitDate);
    }
    public void setComments(String Comments) {
        driver.findElement(visitComments).sendKeys(Comments);
    }
    public AppointmentConfirmation submitAppointment() {
        driver.findElement(submitButton).click();
        return new AppointmentConfirmation(driver);
    }
    public String assertFacility() {
        return driver.findElement(facility).getText();
        //System.out.println(facility);
    }
    public String assertReAdmission() {
       return driver.findElement(reAdmission).getText();
        //System.out.println(reAdmission);
    }
    public String assertHealthProgram() {
        return driver.findElement(healthProgram).getText();
       // System.out.println(healthProgram);
    }
    public String assertDateOfVisit() {
      return  driver.findElement(dateOfVisit).getText();
       // System.out.println(dateOfVisit);
    }
    public String assertVisitComments() {
       return driver.findElement(visitComments).getText();
       // System.out.println(visitComments);
    }
}
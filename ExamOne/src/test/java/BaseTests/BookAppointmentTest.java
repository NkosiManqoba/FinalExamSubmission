package BaseTests;

import Pages.AppointmentConfirmation;
import Pages.BookAppointmentPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BookAppointmentTest extends BaseTests {

    @Test(priority = 2, dataProvider = "bookingDetails")
    public void makeBooking(String facility, String Program, String visitDate, String comment) {

        BookAppointmentPage bookAppointmentPage = new BookAppointmentPage(driver);
        bookAppointmentPage.setFacility(facility);
        bookAppointmentPage.setHealthcareProgram(Program);
        bookAppointmentPage.setVisitDate(visitDate);
        bookAppointmentPage.setComments(comment);
        bookAppointmentPage.submitAppointment();

        Assert.assertEquals(bookAppointmentPage.assertFacility(),facility);
        Assert.assertEquals(bookAppointmentPage.assertFacility(),Program);
        Assert.assertEquals(bookAppointmentPage.assertFacility(),visitDate);
        Assert.assertEquals(bookAppointmentPage.assertFacility(),comment);
    }

    @DataProvider
    public Object[][] bookingDetails() {
        Object[][] data = new Object[1][4];

        data[0][0] = "Seoul CURA Healthcare Center";
        data[0][1] = "Medicare";
        data[0][2] = "01/12/2022";
        data[0][3] = "This is the 1st appointment";
       // data[1][0] = "Tokyo CURA Healthcare Center"; data[1][1] = "Medicaid"; data[1][2] = "14/12/2022"; data[1][3] = "This is the 2nd appointment";
        // data[2][0] = "Tokyo CURA Healthcare Center"; data[2][1] = "Medicaid"; data[2][2] = "14/12/2022"; data[2][3] = "This is the 2nd appointment";
        return data;
    }
    /*@Test(priority = 3)
    public void confirmAppointment() {
        AppointmentConfirmation appointmentConfirmation = new AppointmentConfirmation(driver);
        appointmentConfirmation.clickGoToHomePage();
    }*/
}


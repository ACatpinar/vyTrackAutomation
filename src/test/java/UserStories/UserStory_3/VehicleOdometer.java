package UserStories.UserStory_3;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CreateVehiclePage;
import pages.HoversPage;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class VehicleOdometer {
    Actions actions;
    WebDriver driver;
    Faker faker= new Faker();
    /*

    2.Verify that Truck driver should be able to create Vehicle odometer or cancel it.
    3.Verify that truck driver should be able to delete or edit Vehicle odometer.
    4.Verify that truck driver should be able to reset grid by click on grid setting"

     */
    @BeforeMethod
    public void SetUp() throws InterruptedException{
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));

        LoginPage loginPage = new LoginPage();

        String username=ConfigurationReader.getProperty("username");
        loginPage.userNameInput.sendKeys(username);

        String password=ConfigurationReader.getProperty("password");
        loginPage.passwordInput.sendKeys(password);

        loginPage.loginButton.click();
        Thread.sleep(3000);
        HoversPage hoversPage = new HoversPage();
        hoversPage.HoverOverFleet.click();
        hoversPage.vehicleOdometer.click();

    }

   @Test
    public void VehicleOdometerPage(){

    // "1. Verify that truck driver should be able to see all vehicle odometer information on the grid.
       HoversPage hoversPage = new HoversPage();
       Assert.assertTrue(hoversPage.vehicleOdometerPage.isDisplayed());
    }
    @Test
    public void CreateVehicleOdometer()throws InterruptedException{

        CreateVehiclePage createVehiclePage = new CreateVehiclePage();
        Thread.sleep(2000);
        createVehiclePage.createVehicleOdometerButton.click();
        Thread.sleep(2000);

        createVehiclePage.odometerValueInput.sendKeys(faker.number().digit());
        Thread.sleep(2000);

        createVehiclePage.dateInput.click();
        String date  = "Jul 10, 2020";
        createVehiclePage.dateInput.sendKeys(date);

        createVehiclePage.nameInput.sendKeys(faker.name().fullName());

        Thread.sleep(2000);
        createVehiclePage.addPlateButton.click();
        createVehiclePage.addPlateButton.click();

        createVehiclePage.choosePlateButton.click();
        createVehiclePage.selectButton.click();



    }

}

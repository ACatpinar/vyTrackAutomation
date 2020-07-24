package UserStories.UserStory_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HoversPage;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class VehicleOdometer {
    Actions actions;
    WebDriver driver;
    /*
    "1. Verify that truck driver should be able to see all vehicle odometer informations
    on the grid.
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
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        Driver.getDriver().get("https://qa2.vytrack.com/entity/Extend_Entity_VehiclesOdometer");




    }
   @Test
    public void VehicleOdometerPage(){

       Driver.getDriver().get("https://qa2.vytrack.com/entity/Extend_Entity_VehiclesOdometer");
       HoversPage hoversPage = new HoversPage();
       Assert.assertTrue(hoversPage.vehicleOdometerPage.isDisplayed());


   }

}

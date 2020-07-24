package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.security.PublicKey;

public class HoversPage {

    public HoversPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//*[@id='main-menu']/ul/li[1]")
    public WebElement HoverOverFleet;

    @FindBy(xpath = "//*[.='Vehicle Odometer']/span")
    public WebElement vehicleOdometer;

    @FindBy(xpath = "//*[@id=\"container\"]")
    public WebElement vehicleOdometerPage;



}

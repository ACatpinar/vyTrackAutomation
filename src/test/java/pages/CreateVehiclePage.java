package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateVehiclePage {

    public CreateVehiclePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@title='Create Vehicle Odometer']")
    public WebElement createVehicleOdometerButton;

    @FindBy(name="custom_entity_type[OdometerValue]")
    public WebElement odometerValueInput;

    @FindBy(xpath="//input[@placeholder='Choose a date']")
    public WebElement dateInput;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[6]")
    public WebElement closeDateInput;

    @FindBy(name="custom_entity_type[Driver]")
    public WebElement nameInput;

    @FindBy(xpath = "//div[@class='pull-right']/button")
    public WebElement addButton;

    @FindBy(xpath = "//*[@id=\"mCSB_2_container\"]/div/table/tbody/tr[1]/td[1]")
    public WebElement choosePlate;

    @FindBy(xpath = "/html/body/div[7]/div[11]/div/div/div/span[2]/button")
    public  WebElement selectButton;

    @FindBy(xpath= "//a[@class='btn-success btn dropdown-toggle']")
    public WebElement dropDown;

    @FindBy(xpath="//button[@class='action-button dropdown-item']")
    public WebElement saveAndClose;
}


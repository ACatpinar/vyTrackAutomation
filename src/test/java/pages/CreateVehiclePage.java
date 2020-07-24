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

    @FindBy(name="custom_entity_type[Driver]")
    public WebElement nameInput;

    @FindBy(xpath = "//*[@id=\"custom_entity_type_License_Plate-uid-5f1a655cc41a2-container\"]/div/div[1]/button")
    public WebElement addPlateButton;

    @FindBy(xpath = "//*[@id=\"mCSB_11_container\"]/div/table/tbody/tr[12]/td[2]")
    public WebElement choosePlateButton;

    @FindBy(xpath = "/html/body/div[9]/div[11]/div/div/div/span[2]/button")
    public  WebElement selectButton;
}

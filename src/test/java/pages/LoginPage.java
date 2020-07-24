package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="prependedInput")
    public WebElement userNameInput;

    @FindBy(id="prependedInput2")
    public WebElement passwordInput;

    @FindBy(id="_submit")
    public WebElement loginButton;

    public void login(String username, String password){
        userNameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

}

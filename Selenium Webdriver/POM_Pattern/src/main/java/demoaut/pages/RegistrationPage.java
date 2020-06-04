package demoaut.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(linkText = "REGISTER")
    private WebElement RegLink;

    @FindBy(name = "firstName")
    private WebElement FirstName;

    @FindBy(name = "lastName")
    private WebElement LastName;

    @FindBy(name = "phone")
    private WebElement phone;

    @FindBy(name = "userName")
    private WebElement email;

    @FindBy(name = "address1")
    private WebElement address1;

    @FindBy(name = "address2")
    private WebElement address2;

    @FindBy(name = "city")
    private WebElement city;

    @FindBy(name = "state")
    private WebElement state;

    @FindBy(name = "postalCode")
    private WebElement postalCode;

    @FindBy(name = "country")
    private WebElement country;

    @FindBy(name = "email")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "confirmPassword")
    private WebElement confirmPassword;

    @FindBy(name = "register")
    private WebElement registerBtn;

    @FindBy(xpath = "//a[contains(text(),\"using the user name and password you've just enter\")]")
    private WebElement actualRegisterText;

    public void clickRegLink(){
        RegLink.click();
    }

    public void setFirstName(String firstName){
        FirstName.sendKeys(firstName);
    }

    public void setLastName(String lastName){
        LastName.sendKeys(lastName);
    }

    public void setPhone(String phone){
        this.phone.sendKeys(phone);
    }

    public void setEmail(String mail){
        email.sendKeys(mail);
    }

    public void setAddress1(String addr1){
        address1.sendKeys(addr1);
    }

    public void setAddress2(String addr2){
        address2.sendKeys(addr2);
    }

    public void setCity(String city){
        this.city.sendKeys(city);
    }

    public void setState(String state){
        this.state.sendKeys(state);
    }

    public void setPostalCode(String postCode){
        postalCode.sendKeys(postCode);
    }

    public void setCountry(String country){
        this.country.sendKeys(country);
    }

    public void setUsername(String usrName){
        username.sendKeys(usrName);
    }

    public void setPassword(String pwd){
        password.sendKeys(pwd);
    }

    public void setConfirmPassword(String confirmpwd){
        confirmPassword.sendKeys(confirmpwd);
    }

    public void clickRegBtn(){
        registerBtn.click();
    }

    public void checkRegisterResult(String expectedRegisterText){
        Assert.assertEquals(expectedRegisterText, actualRegisterText.getText());
    }
}

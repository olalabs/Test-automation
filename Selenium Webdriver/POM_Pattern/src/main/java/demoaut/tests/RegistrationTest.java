package demoaut.tests;

import demoaut.pages.RegistrationPage;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    public String regSuccess = "using the user name and password you've just entered.";

    @Test
    public void verifyFlightReg(){

        RegistrationPage regPage = new RegistrationPage(driver, wait);
        regPage.clickRegLink();
        regPage.setFirstName("Robert");
        regPage.setLastName("Watson");
        regPage.setPhone("123456789");
        regPage.setEmail("robert@gmail.com");
        regPage.setAddress1("Lomas Del Sol");
        regPage.setAddress2("Curridabat");
        regPage.setCity("San Jose");
        regPage.setState("Texas");
        regPage.setPostalCode("TX 67021");
        regPage.setCountry("COSTA RICA");
        regPage.setUsername("robwat");
        regPage.setPassword("openSesame");
        regPage.setConfirmPassword("openSesame");
        regPage.clickRegBtn();
        regPage.checkRegisterResult(regSuccess);
    }
}

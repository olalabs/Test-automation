package demoaut.tests;

import demoaut.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest {

    WebDriver driver;
    WebDriverWait wait;
    public String pageTitle = "Welcome: Mercury Tours";

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 15);
        driver.manage().window().maximize();
        driver.get("http://newtours.demoaut.com/");
    }

    @Test
    public void checkMainPage(){
        BasePage basePage = new BasePage(driver, wait);
        basePage.checkPageTitle(pageTitle);
    }

    @AfterClass
    public void afterTest(){
        driver.close();
        driver.quit();
    }
}

package Capstonetesting; 

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;



public class test { 
	WebDriver driver = new ChromeDriver();



    @BeforeMethod
    public void setUp() {
        driver.manage().window().setSize(new Dimension(768, 816));
        driver.get("http://localhost:4200/auth/SignIn");
    }

    @Test(dataProvider = "credentials")
    public void loginTest(String username, String password) {
        driver.findElement(By.id("currentUsername")).sendKeys(username);
        driver.findElement(By.id("currentPassword")).sendKeys(password);
        driver.findElement(By.className("login__button")).click();
    }

    @AfterMethod
    public void tearDown() {
//        driver.quit();
    }

    //Positive testcase
    @DataProvider(name = "credentials")
    public Object[][] provideCredentials() {
        return new Object[][] {
            {"shruti", "shruti"},
        };

       } 
    
    //Negative testcase
    @DataProvider(name = "invalidCredentials")
    public Object[][] provideInvalidCredentials() {
        return new Object[][] {
            {"Shruti", "Shrutis"},
        };
    }


}

package Testpacking; 

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BeforeAfterTest1 { 
	
	WebDriver driver; 
	
	
  @Test
  public void f() 
  { 
	  driver.findElement(By.linkText("Calorie Calculator")).click(); 
	  String acttitle = driver.getTitle(); 
	  String exptitle="Calorie Calcul"; 
	  Assert.assertEquals(acttitle,exptitle); 
	  driver.close();
	  
  }
  
  
  @BeforeTest
  public void beforeTest() 
  {
	  driver = new FirefoxDriver(); 
	  driver.get("https://www.calculator.net/"); 
	  driver.manage().window().maximize(); 
	  driver.findElement(By.linktext("Calorie Calculator")).click();  
	  String acttitle=driver.getTitle();  
	  String exptitle = "Calorie";  
	  Assert.assertEquals(acttitle,exptitle); 
	  driver.close();
	  
}

  @AfterTest
  public void afterTest() 
  {
	  driver = new FirefoxDriver(); 
	  driver.get("https://www.calculator.net/"); 
	  driver.manage().window().maximize(); 
	  driver.findElement(By.linktext("Calorie Calculator")).click();  
	  String acttitle=driver.getTitle();  
	  String exptitle = "Calorie";  
	  Assert.assertEquals(acttitle,exptitle); 
	  driver.close();
  }

}

package School;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.interactions.Actions;

public class school {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		WebDriver driver = new FirefoxDriver(); 
		 driver.get("https://schooledn.py.gov.in/admission/hsc.html");   
	       WebElement school = driver.findElement(By.xpath("//A[@href='#'][text()='Schools']")); 
	       WebElement Private = driver.findElement(By.xpath("//A[@href='#'][text()='Private']"));  
	       WebElement govt = driver.findElement(By.xpath("//A[@href='../schools/govtAided.html'][text()='Govt Aided']"));  
	       
			 //Perform a series of actions in the correct order 
			
			 Actions act = new Actions(driver); 
		
		act.click(school).perform();
			act.moveToElement(Private).perform();
			act.click(Private).perform();
			
			// Move to the second element and click on it
			act.moveToElement(govt).perform(); 
			
			// Move to the third element and click on it
			act.click(govt).perform();

	}

}

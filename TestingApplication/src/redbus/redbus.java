package redbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class redbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		WebDriver driver = new FirefoxDriver(); 
		try {
			 driver.get("https://www.redbus.in/"); 
			   
		       
		       WebElement account = driver.findElement(By.xpath("(//DIV[@class='rb_main_secondary_item  link'])[2]"));  
		       WebElement ticket = driver.findElement(By.id("ticket_details")); 
		       Actions act = new Actions(driver);  
		    
		       act.moveToElement(account).click().perform();  
		       Thread.sleep(2000); 
		       act.moveToElement(ticket).perform(); 
		       Thread.sleep(2000); 
		       act.click(ticket).perform(); 
		       } catch (Exception e) {
		            e.printStackTrace();
		      
		    }
	}

}

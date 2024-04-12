package DragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions; 

import java.util.List;


public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		WebDriver driver = new FirefoxDriver();  
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html"); 
        
	       WebElement l = driver.findElement(By.id("draggable")); 
	      WebElement p = driver.findElement(By.id("droppable")); 
	       Actions act = new Actions(driver); 
	       act.dragAndDrop(l, p).build().perform(); 
	       act.moveToElement(p); 

	}

}

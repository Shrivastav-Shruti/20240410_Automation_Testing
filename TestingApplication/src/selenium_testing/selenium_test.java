package selenium_testing; 
import org.openqa.selenium.*;
  
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class selenium_test {
 
		public static void main(String[] args)  {
			// TODO Auto-generated method stub 
			WebDriver driver = new FirefoxDriver(); 
			
		driver.get("https://www.calculator.net/");
			driver.findElement(By.id("calcSearchTerm")).sendKeys("calorrieeee"); 
			
			driver.findElement(By.xpath("//input[@id='calcSearchTerm']")).sendKeys("shruti");
			
			// Locating elements using ID locator
        driver.findElement(By.id("calcSearchTerm")).sendKeys("calorrieeee");

	        // Locating elements using XPath locator
       driver.findElement(By.xpath("//input[@id='calcSearchTerm']")).sendKeys("dfadsf");	       
       
	        // Locating elements using CSS Selector
      driver.findElement(By.cssSelector("input#calcSearchTerm")).sendKeys("gfdghb");

        // Locating elements using class name locator
       driver.findElement(By.className("scifunc")).click();
        
	        // Locating elements using name locator
	       driver.findElement(By.name("description")).click();

        // Locating elements using link text locator
	        driver.findElement(By.linkText("Mortgage Calculator")).sendKeys("Mortage");

        // Locating elements using partial link text locator
	       driver.findElement(By.partialLinkText("Financial")).click();

	        // Locating elements using tag name locator
	        driver.findElement(By.tagName("body")).sendKeys("wrong");  
			
			
	        
	        driver.get("https://www.calculator.net/calorie-calculator.html"); 
			
	        driver.findElement(By.xpath("(//SPAN[@class='rbmark'])[2]")).click(); 
	        
}
}
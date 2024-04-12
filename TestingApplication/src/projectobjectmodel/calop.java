package projectobjectmodel; 


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		WebDriver driver = new FirefoxDriver(); 
		
		driver.get("https://www.calculator.net/"); 
		
		driver.manage().window().maximize(); 
		
		Calpage.searchinput(driver).sendKeys("Calorie Calculator");

	}

}

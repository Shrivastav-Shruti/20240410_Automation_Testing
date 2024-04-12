package moveElement; 
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*; 
import org.openqa.selenium.firefox.FirefoxDriver; 


public class element {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		
		WebDriver driver = new FirefoxDriver();
		//Actions actions = new Actions(driver);
		driver.get("https://www.redbus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(3000);
		Set<String> alw= driver.getWindowHandles();
		Iterator<String> it = alw.iterator();
		String pw = it.next();
		String cw= it.next();
		driver.switchTo().window(cw);
		//driver.findElement(By.className("icon-close")).click();
		driver.findElement(By.xpath("//i[@class='icon-close']")).click();
		


	}

}

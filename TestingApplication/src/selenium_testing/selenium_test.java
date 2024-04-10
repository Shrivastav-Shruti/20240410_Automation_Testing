package selenium_testing; 

import org.openqa.selenium.*; 
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class selenium_test {

    public static void main(String[] args) throws InterruptedException {
        // Instantiate Firefox WebDriver
        WebDriver driver = new FirefoxDriver();
        
        // Navigate to Calculator.net homepage
        driver.get("https://www.calculator.net/");

        // Locate search input field by ID and enter text
        driver.findElement(By.id("calcSearchTerm")).sendKeys("calorrieeee"); 

        // Locate search input field by XPath and enter text
        driver.findElement(By.xpath("//input[@id='calcSearchTerm']")).sendKeys("shruti");

        // Locate search input field by CSS Selector
        driver.findElement(By.cssSelector("input#calcSearchTerm"));

        // Locate element by class name
        driver.findElement(By.className("scifunc"));

        // Locate element by name
        driver.findElement(By.name("description"));

        // Locate element by link text
        driver.findElement(By.linkText("Mortgage Calculator"));

        // Locate element by partial link text
        driver.findElement(By.partialLinkText("Financial"));

        // Locate element by tag name
        driver.findElement(By.tagName("body"));  

        // Navigate to Calorie Calculator page
        driver.get("https://www.calculator.net/calorie-calculator.html"); 

        // Click on an element using XPath
        driver.findElement(By.xpath("(//SPAN[@class='rbmark'])[2]")).click(); 

        // Navigate to jQuery UI draggable demo page
        driver.get("https://jqueryui.com/resources/demos/droppable/default.html"); 

        // Locate draggable and droppable elements and perform drag and drop action
        WebElement l = driver.findElement(By.id("draggable")); 
        WebElement p = driver.findElement(By.id("droppable")); 
        Actions act = new Actions(driver); 
        act.dragAndDrop(l, p).build().perform(); 
        act.moveToElement(p); 

        // Navigate to a specific webpage
        driver.get("https://schooledn.py.gov.in/admission/hsc.html");   
        WebElement school = driver.findElement(By.xpath("//A[@href='#'][text()='Schools']")); 
        WebElement Private = driver.findElement(By.xpath("//A[@href='#'][text()='Private']"));  
        WebElement govt = driver.findElement(By.xpath("//A[@href='../schools/govtAided.html'][text()='Govt Aided']"));  

        // Perform a series of actions in the correct order 
        Actions actions = new Actions(driver); 

        actions.click(school).perform();
        actions.moveToElement(Private).perform();
        actions.click(Private).perform();

        // Move to the second element and click on it
        actions.moveToElement(govt).perform(); 

        // Move to the third element and click on it
        actions.click(govt).perform();

        // Navigate to Redbus homepage
        driver.get("https://www.redbus.com/"); 
        WebElement help = driver.findElement(By.xpath("//A[@href='/info/redcare'][text()='Help']"));  
        WebElement cross = driver.findElement(By.xpath("//I[@class='icon-close']/self::I")); 
        Actions actions2 = new Actions(driver);  

        // Click on 'Help' and then move to and click on 'Close' icon
        actions2.click(help).perform();  
        Thread.sleep(1500); 
        actions2.moveToElement(cross).perform(); 
        Thread.sleep(1500);
        actions2.click(cross).perform();
    }
}

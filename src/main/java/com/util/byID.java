package com.util;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class byID {

	/*
	  
	  1) ID:
	  	If the element has a unique identifier, you can use its ID to locate it.
	  
	  Example: #elementID
	  
	  2) ClassName:
	  	If the element has a specific class name assigned to it, you can use the class name to locate it.
	  
	  Example: .elementClassName
	  
	  3) TagName:
	  	If you know the HTML tag name of the element, you can use it to locate similar elements.
	  
	  Example: tagName
	  
	  4) CSS Selector:
	  CSS selectors are powerful and flexible ways to locate elements based on their attributes, classes, or relationships with other elements.
	  
	  Example: elementTag[attribute='value']
	  
	  5) XPath:
	  XPath is a language used to navigate XML documents and can also be used to locate elements in HTML documents.
	  
	  Example: //elementTag[@attribute='value']
	  
	 */



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.guvi.in/register");
		
		
// I write this program more like read only type. We need to modify this to run.
		

// By ID locator:
		/*
		  driver.findElement(By.id("google-button")).getText();
		  
		  driver.findElement(By.id("firstName")).sendKeys("Ajay");
		  
		  driver.findElement(By.id("lastName")).sendKeys("Anandan");
		  
		  driver.findElement(By.id("emailInput")).sendKeys("socev59284@v1zw.com");
		  
		  driver.findElement(By.id("passwordInput")).sendKeys("Ajay@123");
		  
		  driver.findElement(By.id("mobileNumberInput")).sendKeys("1234567890");
		  
		  driver.findElement(By.id("signup")).getText();
		  
		  */
		 

// By xpath locator:
		/*
		  driver.findElement(By.xpath("//a[contains(.,'Sign-up with Google')]")).click();
		
		  driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Ajay");
		  
		  driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Anandan");
		  
		  driver.findElement(By.xpath("//*[@id=\"emailInput\"]")).sendKeys(
		  "socev59284@v1zw.com");
		  
		  driver.findElement(By.xpath("//*[@id=\"passwordInput\"]")).sendKeys(
		  "Ajay@123");
		  
		  driver.findElement(By.xpath("//*[@id=\"mobileNumberInput\"]")).sendKeys(
		  "1234567890");
		  
		  driver.findElement(By.xpath("//*[@id=\"signup\"]")).click();
		  
		  driver.findElement(By.xpath("//a[contains(.,'Sign-up with Google')]")).click();
		  
		  
		 */

// By CSS Selector locator:
		/*
		  driver.findElement(By.cssSelector("//a[contains(.,'Sign-up with Google')]")).click();
		  
		  driver.findElement(By.cssSelector("#firstName")).sendKeys("Ajay");
		  
		  driver.findElement(By.cssSelector("#lastName")).sendKeys("Anandan");
		  
		  driver.findElement(By.cssSelector("#emailInput")).sendKeys(
		  "socev59284@v1zw.com");
		  
		  driver.findElement(By.cssSelector("#passwordInput")).sendKeys("Ajay@123");
		  
		  driver.findElement(By.cssSelector("#mobileNumberInput")).sendKeys(
		  "1234567890");
		  
		  driver.findElement(By.cssSelector("#signup")).click();
		  
		 
		 */
		
// By Class Name:
		/*
		 List<WebElement> elements = driver.findElements(By.className("form-control"));
		 
		 for(int i = 1; i<5; i++) {
			 WebElement element = elements.get(i);
			 element.sendKeys("123456");
		 }
		 */
		
// By Tag Name:
		/*
		List<WebElement> elements = driver.findElements(By.tagName("input"));
		
		for(int i = 0; i <= 4; i++) {
			WebElement ele = elements.get(i);
			ele.sendKeys("123456");
			
		}
		*/
		//driver.quit();
	}

}

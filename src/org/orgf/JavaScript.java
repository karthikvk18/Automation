package org.huhuhuh;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

public static void main(String[] args) throws InterruptedException, AWTException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProcess\\Resources\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	//	DAY 12  // JAVASCRIPTEXECUTOR
	
	 driver.get("http://www.greenstechnologys.com/");
     WebElement sd = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
	Thread.sleep(3000);
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView('True');",sd );
	System.out.println(sd);
	
	/*driver.get("http://www.facebook.com/");
	 * WebElement username = driver.findElement.BY.id("email");
	 * JavaScriptExecutor js=*(JavaScriptExecutor)driver;
	 * js.executeScript("arguments[0].setAttribute('value','karthik')",username);
	 * js.executescript("return arguments[0].getAtrribute('value')",username);
	
	 * 
	 * 
*/
	
	
}}
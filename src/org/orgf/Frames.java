package org.huhuhuh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException  {
		
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProcess\\Resources\\selenium-java-4.3.0\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		
		driver.manage().window().maximize();
		
		
		//driver.findElement(By.xpath("//a[@class='login_button']"));//.click();
		
		//driver.findElement(By.id("username")).sendKeys("karthik");
		
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		
		int size = frames.size();
		System.out.println(size);
		Thread.sleep(3000);
		driver.switchTo().frame("iframetop");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='resp-iframe']")));
		try {
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='resp-iframe']")));
		} catch ( org.openqa.selenium.NoSuchElementException e) {
			
		}
	
		driver.switchTo().frame("IplayHowToLoginVideo");
		driver.findElement(By.id("DUMMY1")).sendKeys("karthik");
		
		
		
		//driver.switchTo().frame("\"Revamp_Banner_ID\"");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}}

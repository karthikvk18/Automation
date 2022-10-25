package org.huhuhuh;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FireFox {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProcess\\Resources\\selenium-java-4.3.0\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone x");
			
			driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
			
			Thread.sleep(3000);
			
			
			
			
			Actions acc= new Actions(driver);
			
			WebElement button = driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone X, 64GB, Space Gray - Fully Unlocked ')]"));
			acc.moveToElement(button);
			acc.contextClick( button).perform();
			
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			String par = driver.getWindowHandle();
			System.out.println(par);
			
			Set<String> all = driver.getWindowHandles();
		System.out.println(all);
		
		for (String x : all) {
			if (!par.equals(x)) {
				System.out.println(x);
				
				
				
				driver.switchTo().window(par);
				
				WebElement iphone = driver.findElement(By.xpath("//span[contains(text(),'Apple Simple Mobile Prepaid - Apple iPhone X (64GB) - Silver')]"));
			acc.contextClick( iphone);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			Set<String> all2 = driver.getWindowHandles();
			System.out.println(all2);
			
	}}}}

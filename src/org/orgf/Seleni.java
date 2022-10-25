package org.huhuhuh;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.initialization.qual.Initialized;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.UnknownKeyFor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Seleni {
public static void main(String[] args) throws InterruptedException, AWTException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProcess\\Resources\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.com/");
		
	driver.manage().window().maximize();
	Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone x");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		Thread.sleep(3000);
		
		
		
		
		Actions acc= new Actions(driver);
		WebElement button = driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone X, 64GB, Space Gray - Fully Unlocked ')]"));
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
		acc.contextClick( iphone).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> all2 = driver.getWindowHandles();
		System.out.println(all2);
		
		}
	}
	}
}
	
	
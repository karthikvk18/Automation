package org.huhuhuh;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProcess\\Resources\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get(" https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		int size = frames.size();
		System.out.println( size);
		
		driver.switchTo().frame("aswift_0");
	
		  Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
		Thread.sleep(3000);
		WebElement timeprice = driver.findElement(By.xpath("(//span[contains(text(),'06:00')])[1]/following::p[@class='blackText fontSize18 blackFont white-space-no-wrap'][1]"));
		String text =timeprice.getText();
	    System.out.println(text);
	    
	    driver.findElement(By.xpath("(//span[contains(text(),'06:00')])[1]/following::span[@class='linkText ctaLink'][1]")).click();
	    
	    
	    
	    
	    
	    WebElement appleprice = driver.findElement(By.xpath("//span[contains(text(),'APPLE iPhone 11 (White, 64 GB)')]/following::div[@class='_30jeq3 _16Jk6d']"));
	    String text2 = appleprice.getText();
	    System.out.println( text2);
	
	    WebElement appledate = driver.findElement(By.xpath("//span[contains(text(),'APPLE iPhone 11 (White, 64 GB)')]/following::div[@class='_3XINqE']"));
	    String text3 = appledate.getText();
	    System.out.println( text3);
	    
	    
}}


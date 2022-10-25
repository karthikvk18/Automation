package org.huhuhuh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
//DAY8//
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProcess\\Resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
	//driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	//org.openqa.selenium.Alert at = driver.switchTo().alert();
	//at.accept();
		
		
	/*driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	org.openqa.selenium.Alert at = driver.switchTo().alert();
	Thread.sleep(3000);
	at.dismiss();*/
		
		
	driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	org.openqa.selenium.Alert at = driver.switchTo().alert();
	at.sendKeys("karthik");
	at.accept();
}}

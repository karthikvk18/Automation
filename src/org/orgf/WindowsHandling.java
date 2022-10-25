package org.huhuhuh;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class WindowsHandling {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProcess\\Resources\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='heading304']")).click();
		WebElement junit = driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/JUNIT.txt']"));
		junit.click();
		
		String par = driver.getWindowHandle();
		System.out.println("par window id is"+par);
		
		Set<String> all = driver.getWindowHandles();
		System.out.println("all windows id's"+all);
		
		/*for (String x : all) {
			
		if (!par.equals(x)) {
		Thread.sleep(3000);
			WebElement text= driver.findElement(By.xpath("//pre[contains(text(),'www.amazon.com')]"));
			String text2 = text.getText();
			System.out.println(text2);*/
	
		//driver.switchTo().window(x);
		}
		//}
		
		
	//	driver.switchTo().window(par);}//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProcess\\Resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphonex");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	
	WebElement iphone = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
	
	Actions acc = new Actions(driver);
	acc.contextClick(iphone);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	String par = driver.getWindowHandle();
	System.out.println(par);
	
Set<String>all = driver.getWindowHandles();
System.out.println("id of all windows"+all);

for (String x : all) {
if(!par.equals(x));
driver.switchTo().window(x);
}
	
	driver.switchTo().window(par);
		
		
	
	WebElement iphonenew = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
	;
	acc.contextClick(iphonenew);
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	Set<String> all2 = driver.getWindowHandles();
	
	java.util.List<String> li=new ArrayList<String>();
	
	li.addAll(all2);
		
		String y = li.get(2);
		
		driver.switchTo().window(y);
	
	
	*/
	
			
	
	
	}
	



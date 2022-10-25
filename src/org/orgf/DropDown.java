package org.huhuhuh;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.initialization.qual.Initialized;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.UnknownKeyFor;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import graphql.execution.ConditionalNodes;

public class DropDown {
	public static void main(String[] args) throws InterruptedException, @UnknownKeyFor @NonNull @Initialized IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProcess\\Resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(" https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
		
		WebElement until = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")));
		
		until.click();
		
		WebElement mon = driver.findElement(By.name("birthday_month"));
		
		Select si = new Select(mon);
		
		si.selectByVisibleText("Mar"); 
		
		
		boolean k = si.isMultiple();
		
		System.out.println(k);
		
		List<WebElement> option = si.getOptions();
		int size = option.size();
		System.out.println(size);
		
	for (int i = 0; i < option.size(); i++) {
		
		WebElement ops = option.get(i);
		String attribute = ops.getText();
	    System.out.println(attribute);
	
		
		
		
	}	
		
		
		} 
	     
		}


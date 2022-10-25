package org.huhuhuh;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.initialization.qual.Initialized;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.UnknownKeyFor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	
	public static void main(String[] args) throws InterruptedException, @UnknownKeyFor @NonNull @Initialized IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProcess\\Resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(" https://www.facebook.com/");
		
		
		TakesScreenshot tk= (TakesScreenshot)driver;
		
		File src = tk.getScreenshotAs(OutputType.FILE);
		
		File des= new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumProcess\\ss\\first.png");
	  
		FileUtils.copyFile(src, des);
		} 
	     
		}



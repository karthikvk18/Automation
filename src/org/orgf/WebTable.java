package org.huhuhuh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumProcess\\Resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		
		
	WebElement webtable = driver.findElement(By.xpath(""
			+ "]"));
	Dimension size = webtable.getSize();
	System.out.println(size); 
	List<WebElement> trows = driver.findElements(By.tagName("tr"));
	int k = trows.size();
	System.out.println(k); 
	
	for (int i = 0; i <trows.size(); i++) {
		WebElement trow = trows.get(0);
		String text = trow.getText();
		System.out.println(text);
		break;
	}
	
	
	}
	
	
	
	
	
	
	}



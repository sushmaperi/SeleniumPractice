package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\AutomationWorkspace\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://facebook.com/");
		//driver.manage().timeouts().implicitlyWait(60, Timeunit.SECONDS);
		
		driver.manage().window().maximize();
		WebDriverWait ww = new WebDriverWait(driver, 60);
		driver.findElement(By.id("email")).sendKeys("perisushma25");
		//driver.findElement(By.xpath("html/body/div[1]/dive[3]/div/div/div/div/div[2]/form/table/tbody/tr[3]/td[2]/div/a")).click();
		
		//ww.until(ExpectedConditions.titleContains("Passwordss"));
		ww.until(ExpectedConditions.numberOfElementsToBe(By.tagName("select"), 1));
		ww.until(ExpectedConditions.numberOfElementsToBeLessThan(By.tagName("a"), 10));
	}
}


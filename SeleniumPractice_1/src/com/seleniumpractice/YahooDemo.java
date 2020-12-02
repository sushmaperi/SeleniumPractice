package com.seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YahooDemo {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\AutomationWorkspace\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//WebDriverWait ww = new WebDriverWait(driver, 60);
		//sign - up to new account
		//ww.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'createacc\']")));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,120)");
		WebElement NewAccount = driver.findElement(By.xpath("//*[@id=\'createacc\']"));
		NewAccount.click();
		//Form Fill
		
		//First Name
		driver.findElement(By.xpath("//*[@id=\'usernamereg-firstName\']")).sendKeys("Sushma");
		//Last Name
		driver.findElement(By.xpath("//*[@id=\'usernamereg-lastName\']")).sendKeys("Peri");
		//Email
		driver.findElement(By.xpath("//*[@id=\'usernamereg-yid\']")).sendKeys("peri_sushma@yahoo.com");		
		//Password
		driver.findElement(By.xpath("//*[@id=\'usernamereg-password\']")).sendKeys("India@12345");
		//Phone Number
		driver.findElement(By.xpath("//*[@id=\'usernamereg-phone\']")).sendKeys("9784763769");
		
		
		
		
	}

}

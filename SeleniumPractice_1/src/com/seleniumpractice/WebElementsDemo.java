package com.seleniumpractice;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDemo {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\AutomationWorkspace\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		
		//creating Webelement for username
		WebElement UserName = driver.findElement(By.id("login-username"));
		//creating Webelement for Next Button
		WebElement Next_Button = driver.findElement(By.id("login-signin"));
		
		UserName.sendKeys("Sushma");
		Next_Button.click();
		

	}

}

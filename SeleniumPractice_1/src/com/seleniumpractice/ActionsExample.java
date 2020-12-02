package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import java.io.File;
//import org.apache.commons.io.FileUtils;


public class ActionsExample {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\AutomationWorkspace\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//Importing Action Class
		Actions a = new Actions(driver);
		
		//Creating WebElement for Jobs menu
		WebElement jobs = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/ul[1]/li[1]/a/div"));
		
		//Moving Cursor to Jobs Menu
		a.moveToElement(jobs).build().perform();
		
		//Clicking on RegisterNow link under jobs menu
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/ul[1]/li[1]/div/ul[1]/li[4]/a")).click();
		
		//taking screenshot
		//File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(f,new File("C:\\Users\\psushma\\Desktop\\ScreenshotExample.png"));
	}

}

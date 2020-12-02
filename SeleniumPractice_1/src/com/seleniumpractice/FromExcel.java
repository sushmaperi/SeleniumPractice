package com.seleniumpractice;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class FromExcel {

	
	public static void main(String[] args) throws Exception{
			
			// Importing FileInputStream to identify the location of Excel
			FileInputStream f = new FileInputStream("C:\\Users\\psushma\\Desktop\\Important\\example1.xls");
		
			//Opening Identified Workbook
			Workbook wb = Workbook.getWorkbook(f);
			
			//Opening Sheet in Openend Workbook
			Sheet s = wb.getSheet("Sheet1");
			
			//Identifying cell in a sheet and read data from cell
			System.out.println(s.getCell(0, 0).getContents());
			System.out.println(s.getCell(0, 1).getContents());
			System.out.println(s.getCell(0, 2).getContents());
			System.out.println(s.getCell(0, 3).getContents());
			System.out.println(s.getCell(0, 4).getContents());
			
			
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "C:\\AutomationWorkspace\\BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(s.getCell(0, 0).getContents());
			
			driver.findElement(By.id(s.getCell(0, 1).getContents())).sendKeys(s.getCell(0, 2).getContents());
			driver.findElement(By.id(s.getCell(0, 3).getContents())).sendKeys(s.getCell(0, 4).getContents());
			
			
	}

}

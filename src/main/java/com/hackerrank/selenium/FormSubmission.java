package com.hackerrank.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class FormSubmission {

	public static void fillForm(WebDriver driver, String pageUrl) {
		
		driver.findElement(By.id("fname")).sendKeys("Fizz");
		driver.findElement(By.id("lname")).sendKeys("Buzz");
		driver.findElement(By.id("email")).sendKeys("fizz_buzz@hackerrank.com");
		driver.findElement(By.id("password")).sendKeys("fizz_buzz@Hrw");
		driver.findElement(By.id("c_password")).sendKeys("c_fizz_buzz@Hrw");
	}

	public static void submitForm(WebDriver driver) {
		driver.findElement(By.xpath("//button[.='Register']")).click();
	}

	public static void takeSnapShot(WebDriver webdriver) {
		try {
		String fileWithPath = "C:/Users/GWL/Desktop/DELETE/test.png";
		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		// Move image file to new destination
		File DestFile = new File(fileWithPath);
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
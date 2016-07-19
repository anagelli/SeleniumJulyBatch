package com.training.selenium.batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;

public class MultipleBrowserSupport {
	
	//@Test
	//public void verifypassportoffices() throws InterruptedException{
	public static void  main(String args[]) throws InterruptedException{
		WebDriver driver;
		//#####################################################
		//Firefox Browser
		//#####################################################
			driver = new FirefoxDriver();
			driver.get("http://passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction");
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.id("dcdrLocation")).isDisplayed());
			driver.findElement(By.id("cpvLocation13")).click();
			Thread.sleep(1000);
			Assert.assertFalse(driver.findElement(By.id("dcdrLocation")).isDisplayed());		
			driver.findElement(By.id("cpvLocationPO")).click();
			Thread.sleep(1000);
			Assert.assertTrue(driver.findElement(By.id("dcdrLocation")).isDisplayed());		
			driver.quit();

			//#####################################################
			//Chrome Browser
			//#####################################################

			System.setProperty("webdriver.chrome.driver", "D:\\selenium-java-2.53.0\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction");
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.id("dcdrLocation")).isDisplayed());
			driver.findElement(By.id("cpvLocation13")).click();
			Thread.sleep(1000);
			Assert.assertFalse(driver.findElement(By.id("dcdrLocation")).isDisplayed());		
			driver.findElement(By.id("cpvLocationPO")).click();
			Thread.sleep(1000);
			Assert.assertTrue(driver.findElement(By.id("dcdrLocation")).isDisplayed());		
			driver.quit();
			//#####################################################
			//IE Browser
			//#####################################################

			System.setProperty("webdriver.ie.driver", "D:\\selenium-java-2.53.0\\IEDriverServer.exe");			
			driver = new InternetExplorerDriver();
			driver.get("http://passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction");
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			System.out.println(driver.findElement(By.id("dcdrLocation")).isDisplayed());
			driver.findElement(By.id("cpvLocation13")).click();
			Thread.sleep(1000);
			Assert.assertFalse(driver.findElement(By.id("dcdrLocation")).isDisplayed());		
			driver.findElement(By.id("cpvLocationPO")).click();
			Thread.sleep(1000);
			Assert.assertTrue(driver.findElement(By.id("dcdrLocation")).isDisplayed());		
			driver.quit();		
	}
}

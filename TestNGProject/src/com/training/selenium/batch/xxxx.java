package com.training.selenium.batch;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xxxx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
  //   System.setProperty("webdriver.chrome.driver", "C://WebDriver//JARS//chromedriver.exe");
     WebDriver driver = new FirefoxDriver();
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     driver.manage().window().maximize();
     
	driver.get("http://www.gmail.com");
	driver.findElement(By.id("Email")).sendKeys("pasupu");
	driver.findElement(By.id("next")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("Passwd")).sendKeys("password");
	driver.findElement(By.id("signIn")).click();
	System.out.println(driver.getTitle());
	 
	System.out.println("Number of Emails in this page is ****************");
	System.out.println(driver.findElements(By.xpath("//tbody/tr[contains(@class, 'zA')]")).size());
	 
	System.out.println("Number of UNREAD Emails in this page are ****************");
	System.out.println(driver.findElements(By.xpath("//td/div[@class='afn' and contains(text(),'unread')]")).size());
	 
	System.out.println("Number of Emails from ANIL are****************");
	System.out.println(driver.findElements(By.xpath("//td/div[span[@class='yP'] and contains(text(),'Anil')]")).size());
	 
	 
     List<WebElement> emailTable = driver.findElements(By.xpath("//table[@id=':36']/tbody/tr[contains(@class, 'zA')]"));
	  for (WebElement e : emailTable) {

		  System.out.println(e.getText());
	  }

	//driver.quit();
	 

	}

}
package com.training.selenium.batch;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectors {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver", "D:\\selenium-java-2.53.0\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
     WebDriver driver = new FirefoxDriver();
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     driver.manage().window().maximize();
     
	driver.get("http://www.gmail.com");
	driver.findElement(By.id("Email")).sendKeys("nagellianilkumar");
	driver.findElement(By.id("next")).click();
	
	driver.findElement(By.id("Passwd")).sendKeys("");
	Thread.sleep(10000);
	driver.findElement(By.id("signIn")).click();
	System.out.println(driver.getTitle());
	 
	System.out.println("Number of Emails in this page is ****************");
	System.out.println(driver.findElements(By.xpath("//tbody/tr[contains(@class, 'zA')]")).size());
	System.out.println("Css Selector" + driver.findElements(By.cssSelector(".zA")).size());
	System.out.println("Css Selector" + driver.findElements(By.cssSelector("tr.zA")).size());
	 
	System.out.println("Number of UNREAD Emails in this page are ****************");
	System.out.println(driver.findElements(By.xpath("//td/div[@class='afn' and contains(text(),'unread')]")).size());
	System.out.println(driver.findElements(By.cssSelector("div > b")).size());	
	List <WebElement> unreadmsgs = driver.findElements(By.cssSelector("div > b"));
	System.out.println("----");
	for (WebElement unreadmsg : unreadmsgs) {
		System.out.println(unreadmsg.findElement(By.xpath("../..")).getText());
	}
	System.out.println("Number of Emails from ANIL are****************");
	System.out.println(driver.findElements(By.xpath("//td/div[span[@class='yP'] and contains(text(),'Anil')]")).size());
	List<WebElement> fromolamails = driver.findElements(By.cssSelector("span[email='noreply@olacabs.com']"));
	System.out.println(fromolamails.size());
for (WebElement fromolamail : fromolamails) {
		
		System.out.println("Css Selector " + fromolamail.findElement(By.xpath("../..")).getText());
		
	}
	
//     List<WebElement> emailTable = driver.findElements(By.xpath("//table[@id=':36']/tbody/tr[contains(@class, 'zA')]"));
//	  for (WebElement e : emailTable) {
//
//		  System.out.println(e.getText());
//	  }
		driver.findElement(By.cssSelector("span.gb_3a.gbii")).click();		
		//driver.findElement(By.linkText("Sign out")).click();
		driver.findElement(By.cssSelector("a[href*='Logout?']")).click();
		
	driver.quit();
	 

	}

}
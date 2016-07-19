package com.july.selenium.batch;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;




public class SelectionboxAndCheckbox {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		WebDriver driver1 = new FirefoxDriver();
		driver.get("http://passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction");
		driver.manage().window().maximize();
		Select Selectppoffice = new Select(driver.findElement(By.id("dcdrLocation")));
		List<WebElement>ppoffices = Selectppoffice.getOptions();
		System.out.println(ppoffices.size());
		
		for (WebElement ppoffice : ppoffices) {			
			System.out.println(ppoffice.getText());
			Selectppoffice.selectByVisibleText(ppoffice.getText());
			System.out.println("**********" + Selectppoffice.getFirstSelectedOption().getText());
			
		}
		//#####################################################################
		//###################################################################

		driver1.get("file:///D:/Selenium_July2016/SelectBox.html");
		WebElement element=driver1.findElement(By.name("skillset"));
		Select se=new Select(element);
		List<WebElement> defaultselections = se.getAllSelectedOptions();
		if(defaultselections.size()==0){
			System.out.println("No Options Selected");
		}
		else
		{
		for (WebElement i : defaultselections) {
			System.out.println("Default Selections are " + i.getText());
		}
		}
		se.selectByVisibleText("Java");
		se.selectByVisibleText("Oracle");
		
		//Get all the options in the Selection box
		List<WebElement> allOptions = se.getOptions();
		for (WebElement i : allOptions)
		{
			System.out.println(i.getText());
		}
		
		//Get all the selected options.
		List<WebElement> allSelectedOptions = se.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions)
		{
			System.out.println("You have selected::"+ webElement.getText());
		}
		 
		//Get the first selected option in the selection box
		WebElement firstOption = se.getFirstSelectedOption();
		System.out.println("The First selected option is::" +firstOption.getText());
		
		if(se.isMultiple())
		{
		System.out.println("This Selection box is a multiple selection box");	
		}
		
		
		//#####################################################################
		//###################################################################

		driver.quit();
		driver1.quit();
	}

}
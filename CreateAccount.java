package WebAutomation.Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccount {
	
	//Identifying the elements using POM model
	 static By EmailAddress = By.id("email_create");
     static By CreateAccountButton = By.id("SubmitCreate");
	
	public static void inputEmailAddress(WebDriver inpEmail) throws IOException{
		//Retrieving the data from object repository
		String file = "/Users/NIS1651m/Documents/phani/Selenium/src/test/java/WebAutomation/Selenium/InputData.properties";
		FileInputStream fs = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fs);
		inpEmail.findElement(EmailAddress).sendKeys(prop.getProperty("email_create"));
	}
	
	public static void clickCreateAccount(WebDriver clickCreate){
		clickCreate.findElement(CreateAccountButton).click();
	}

}

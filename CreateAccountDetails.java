package WebAutomation.Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountDetails {

	
	static By Title = By.id("id_gender1");
	static By Fname = By.id("customer_firstname");
	static By Lname = By.id("customer_lastname");
	static By Pwd = By.id("passwd");
	static By AddressFirstName = By.id("firstname");
	static By AddressLastName = By.id("lastname");
	static By Company = By.id("company");
	static By Address = By.id("address1");
	static By Address2 = By.id("address2");
	static By City = By.id("city");
	static By zipcode = By.id("postcode");
	static By AddInfo = By.id("other");
	static By mobNumber = By.id("phone_mobile");
	static By Alias = By.id("alias");
	static By Register = By.id("submitAccount");
	static By SignOut = By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a");
	
	public static void details(WebDriver det) throws IOException{
		
		String file = "/Users/NIS1651m/Documents/phani/Selenium/src/test/java/WebAutomation/Selenium/InputData.properties";
		FileInputStream fs = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fs);
		
		det.findElement(Title).click();
		det.findElement(Fname).sendKeys(prop.getProperty("FirstName"));
		det.findElement(Lname).sendKeys(prop.getProperty("LastName"));
		det.findElement(Pwd).sendKeys(prop.getProperty("password"));
		//Select Data of birth
		DOB.datE(det);
		DOB.monTh(det);
		DOB.yR(det);
		det.findElement(AddressFirstName).sendKeys(prop.getProperty("FirstName"));
		det.findElement(AddressLastName).sendKeys(prop.getProperty("LastName"));
		det.findElement(Company).sendKeys(prop.getProperty("Company"));
		det.findElement(Address).sendKeys(prop.getProperty("Address"));
		det.findElement(Address2).sendKeys(prop.getProperty("Address2"));
		det.findElement(City).sendKeys(prop.getProperty("City"));
		DOB.state(det);
		det.findElement(zipcode).sendKeys(prop.getProperty("Zipcode"));
		det.findElement(AddInfo).sendKeys(prop.getProperty("AddInfo"));
		det.findElement(mobNumber).sendKeys(prop.getProperty("PhoneNumber"));
		det.findElement(Alias).clear();
		det.findElement(Alias).sendKeys(prop.getProperty("Alias"));
		det.findElement(Register).click();
		det.findElement(SignOut).click();
	}
}

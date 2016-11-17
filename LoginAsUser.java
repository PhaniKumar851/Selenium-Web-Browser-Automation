package WebAutomation.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class LoginAsUser {
	
	//Identifying the elements using page Factory model
	@FindBy(how = How.ID, using = "email")
	static WebElement Email;
	
	@FindBy(how = How.ID, using = "passwd")
	static WebElement pwd;
	
	@FindBy(how=How.ID, using = "SubmitLogin")
	static WebElement Login;
	
	
	public static WebElement eMail(){
		return Email;
	}
	
	public static WebElement passWord(){
		return pwd;
	}
	
	public static WebElement sLogin(){
		return Login;
	}
	
	public static void getTitle(WebDriver getT){
		String title = getT.getTitle();
		String title1 = title;
		Assert.assertEquals(title, title1);
		System.out.println("The browser is on"+" "+title+" "+"page");
	}

}

package WebAutomation.Selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignIn {
    
	//Identifying the signInbutton WebElement  
	@FindBy(how = How.XPATH, using = ".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	static WebElement signIn;
    
	//init Method to click on the signIn button
	public static WebElement clickSignIn() {
		return signIn;
	}
	
	

}

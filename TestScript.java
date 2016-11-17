package WebAutomation.Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TestScript {
	
	public WebDriver driver = new ChromeDriver();
	
	@Before
	public void getLink(){
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	@Test
	public void createAcc() throws IOException{
		String file = "/Users/NIS1651m/Documents/phani/Selenium/src/test/java/WebAutomation/Selenium/InputData.properties";
		FileInputStream fs = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fs);
		//Initializing the factory classes
		PageFactory.initElements(driver, SignIn.class);
		PageFactory.initElements(driver, LoginAsUser.class);
		
		SignIn.clickSignIn().click();
		//Register for an Account
		CreateAccount.inputEmailAddress(driver);
		CreateAccount.clickCreateAccount(driver);
		CreateAccountDetails.details(driver);
		//Login with the registered account
		LoginAsUser.eMail().sendKeys(prop.getProperty("email_create"));
		LoginAsUser.passWord().sendKeys(prop.getProperty("password"));
		LoginAsUser.sLogin().click();
		//Asserting the window Title
		LoginAsUser.getTitle(driver);
		//Selecting the Womens Category
		AddProdtoBag.clickWomen(driver);
		//Looping over the available dresses on category page  and selecting the printed dress model
		AddProdtoBag.selCategory(driver);
		//Adding the product to bag
		AddProdtoBag.adToCart(driver);
		AddProdtoBag.ShopCart(driver);
		//Proceed to checkOut
		CheckOut.prcdCheckOut(driver);
		CheckOut.valdtAddress(driver);
		CheckOut.cChkOut(driver);
		CheckOut.sTerms(driver);
		//Select the Payment Type
		Payplace.payMent(driver);
		Payplace.placeOrder(driver);
		//Get the order details
		Payplace.orderDetails(driver);
		//Getting the order details from Account history
		GetHistory.clickAcc(driver);
		GetHistory.cGetDetails(driver);
		GetHistory.getOrder(driver);
	}

}

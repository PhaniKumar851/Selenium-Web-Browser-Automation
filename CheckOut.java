package WebAutomation.Selenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut {
	
	static By ChckOut = By.xpath(".//*[@id='center_column']/p[2]/a[1]/span");
	static By ShpAddress = By.xpath(".//*[@id='address_delivery']/li[4]");
	static By BilAdrress = By.xpath(".//*[@id='address_delivery']/li[4]");
	static By ChckOut1 = By.xpath(".//*[@id='center_column']/form/p/button");
	static By ClickTerms = By.id("cgv");
	static By ChckOut2 = By.xpath(".//*[@id='form']/p/button");
	
	public static void prcdCheckOut(WebDriver Cout){
		Cout.findElement(ChckOut).click();
		}
	
	public static void valdtAddress(WebDriver Add){
		String saddr = Add.findElement(ShpAddress).getText();
		String baddr = Add.findElement(BilAdrress).getText();
		
		Assert.assertEquals(saddr, baddr);
		System.out.println("Billing and shipping address are unique");
	}
	
	public static void cChkOut(WebDriver cCout){
		cCout.findElement(ChckOut1).click();
	}
	
	public static void sTerms(WebDriver Sterm){
		Sterm.findElement(ClickTerms).click();
		Sterm.findElement(ChckOut2).click();
	}

}

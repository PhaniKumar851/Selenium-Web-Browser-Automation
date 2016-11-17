package WebAutomation.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Payplace {
	
	static By pay = By.xpath(".//*[@id='HOOK_PAYMENT']/div[2]/div/p/a");
	static By Place = By.xpath(".//*[@id='cart_navigation']/button");
	static By details = By.xpath(".//*[@id='center_column']/div");
	
	public static void payMent(WebDriver Pay){
		Pay.findElement(pay).click();
	}
	
	public static void placeOrder(WebDriver cPlace){
		cPlace.findElement(Place).click();
	}

	public static void orderDetails(WebDriver Det){
		 WebElement details1 = Det.findElement(details);
		 System.out.println("\t");
		System.out.println(details1.getText());
		System.out.println("\t");
	}
}

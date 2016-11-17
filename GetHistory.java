package WebAutomation.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetHistory {
	
	static By cAccount = By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a");
	static By clickHistory = By.xpath(".//*[@id='center_column']/div/div[1]/ul/li[1]/a/span");
	
	public static void clickAcc(WebDriver ClCC){
		ClCC.findElement(cAccount).click();
	}
	
	public static void cGetDetails(WebDriver geT){
		geT.findElement(clickHistory).click();
	}
	
	public static void getOrder(WebDriver getO){
		List<WebElement> orders = getO.findElements(By.xpath(".//*[@id='order-list']/tbody/tr"));
		System.out.println(orders.size());
		
		for (int i=0;i<orders.size();i++){
			String orderno = orders.get(i).getText();
			System.out.println("The order no is"+" "+orderno);
		}
	}

}
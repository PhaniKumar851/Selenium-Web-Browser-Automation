package WebAutomation.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DOB {
	
	public static void datE(WebDriver sel){
		Select selcDate = new Select(sel.findElement(By.id("days")));
		 selcDate.selectByValue("2");
		
	}
	
	public static void monTh(WebDriver selM){
		Select selMonth = new Select(selM.findElement(By.id("months")));
		selMonth.selectByValue("6");
	}
	
	public static void yR(WebDriver selY){
		Select selYear = new Select(selY.findElement(By.id("years")));
		selYear.selectByValue("1987");
	}
	
	public static void state(WebDriver st){
		Select selState = new Select(st.findElement(By.id("id_state")));
		selState.selectByValue("5");
	}

}

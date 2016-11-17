package WebAutomation.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class State {
	
	public static void selState(WebDriver selSt){
		List<WebElement> state = selSt.findElements(By.xpath(".//*[@id='id_state']"));
		
		System.out.println(state.size());
	}

}

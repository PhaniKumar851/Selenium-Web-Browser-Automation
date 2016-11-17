package WebAutomation.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddProdtoBag {
	
	static By Womens = By.xpath(".//*[@id='block_top_menu']/ul/li[1]/a");
	static By AddToCart = By.xpath(".//*[@id='add_to_cart']/button");
	static By ShpCart = By.xpath(".//*[@id='header']/div[3]/div/div/div[3]/div/a");
	
	
	public static void clickWomen(WebDriver wom){
		wom.findElement(Womens).click();
	}
	
	public static void selCategory(WebDriver selCat){
		List<WebElement> categorys = selCat.findElements(By.xpath(".//*[@id='center_column']/ul/li"));
		System.out.println(categorys.size());
		
		for(int i=0;i<=categorys.size();i++){
			String catText = categorys.get(i).getText();
			if(catText.contains("Printed Dress")){
				System.out.println(catText);
				System.out.println("click the"+" "+catText);
				selCat.findElement(By.xpath(".//*[@id='center_column']/ul/li[3]/div/div[1]/div/a[1]/img")).click();
				//categorys.get(i).click();
				break;
			}
		}
		System.out.println("Printed Dress Category got selected");
	}
	
	public static void adToCart(WebDriver adTc) {
		adTc.findElement(AddToCart).click();
		adTc.navigate().refresh();
	}

	public static void ShopCart(WebDriver Cart){
		Cart.findElement(ShpCart).click();
	}
	
	
	
}



package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage {
	
public WebDriver driver;
private CyncHeaderPage cyncHeaderPage;

	
	public BasePage(WebDriver driver){
		this.driver=driver;
		//cyncHeaderPage=new CyncHeaderPage(driver);
		//cyncMenus=new CyncMenus(driver);
	}

	public CyncHeaderPage getCyncHeaderPage(){
		return cyncHeaderPage;
	}
	
	
	
	public boolean isElementPresent(By xpath){
		try{
			List<WebElement> elementWebE=driver.findElements(xpath);
			if (elementWebE.size()==0){
				return false;
			}else
			return true;
		}catch(Exception ex){
			return false;
		}
		
	}
}

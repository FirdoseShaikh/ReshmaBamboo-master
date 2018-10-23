package pages;

import base.BasePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;



public class LoginPage extends BasePage {
	
	static Logger log = Logger.getLogger(LoginPage.class.getName());

	
	private final By username_xpath=By.xpath("//div[@class='loginbox']//descendant::input[@id='user_login']"); 
	private final By password_xpath=By.xpath("//div[@class='loginbox']//descendant::input[@id='user_password']"); 
	private final By loginButton_xpath=By.xpath("//div[@class='loginbox']//descendant::button[@class='login-button']"); 
	private final By errorMessage_xpath=By.xpath("//div[@class='loginform1']//descendant::div[@class='loginErrormsg']"); 

	
	public LoginPage(WebDriver driver) {
		super(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		/*if(!driver.getTitle().equalsIgnoreCase("Cync Application")){
			throw new SkipException("Login Page couldn't open properly.");*/
		}
	
		
	
	public void setText(){
		log.info("setting up the text");
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Test");
		driver.findElement(By.xpath("//div[@class='jsb']//input[@value='Google Search']")).click();
		
	}
	public void setGmail(){
		log.info("setting up the gmail");
		driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
				
	}
	public void setImages()
	{
		log.info("setting up the gmail");
		driver.findElement(By.xpath("//a[contains(text(),'Images')]")).click();
		
	}
	public boolean setUserName(String username){
		log.info("setting up the username");
		try{
			WebElement usernameWebE=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(username_xpath));
			usernameWebE.clear();
			usernameWebE.sendKeys(username);
			return true;
		}catch(Exception ex){
			log.info("something went wrong while passing username");

			return false;
		}
		
	}
	
	public boolean setPassword(String password){
		log.info("setting up the password");

		try{
			WebElement passwordWebE=new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(password_xpath));
			passwordWebE.clear();
			passwordWebE.sendKeys(password);
			return true;
		}catch(Exception ex){
			log.info("something went wrong while passing password");
			return false;
		}
	}
	
	public Object clickLoginButton(){
		try{
			boolean result;
			new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(loginButton_xpath)).click();
			result=this.isElementPresent(username_xpath);
			if(result){
				log.info("clicking on the login Btn");
				return new LoginPage(driver);
				

			}else{
				return new CyncHomePage(driver);
			}
		}catch(Exception ex){
		return null;
		}
	}
	
	public String getErrorMessage(){
		try{
			WebElement errorMessageWebE=new WebDriverWait(driver,20)
				.until(ExpectedConditions.visibilityOfElementLocated(errorMessage_xpath));
			return errorMessageWebE.getText().trim();
		}catch(Exception ex){
			return null;
		}
	}
	
	public CyncHomePage doLogin(){
		try{
			this.setUserName("adminautomation");
			this.setPassword("Cync@123");


			new WebDriverWait(driver,10)
				.until(ExpectedConditions.visibilityOfElementLocated(loginButton_xpath)).click();
			log.info("login to the cync application");
			return new CyncHomePage(driver);
		}catch(Exception ex){
			return null;
		}
	}

}

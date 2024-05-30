package pomSauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutFunctionality {

	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='login-button']")
	private WebElement loginButton;
	
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement menuButton;
	
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logOut;
	
	  
	private WebDriver driver;
	
	public  LogOutFunctionality (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sendUserName(String userid) {
		 username.sendKeys(userid);
	}
	public void sendPassword(String passw)
	{
		password.sendKeys(passw);;
	}
	public void clickLogInButton()
	{
		 loginButton.click();
	}
	
	public void clickOnMenu() {
		menuButton.click();
	}
	public void clickOnLogout()
	{
		logOut.click();
	}
	
}

	



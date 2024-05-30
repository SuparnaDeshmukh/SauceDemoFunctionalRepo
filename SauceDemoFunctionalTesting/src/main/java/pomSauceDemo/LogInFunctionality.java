package pomSauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInFunctionality {

	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='login-button']")
	private WebElement loginButton;
	  
	private WebDriver driver;
	
	public  LogInFunctionality(WebDriver driver)
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
	
}

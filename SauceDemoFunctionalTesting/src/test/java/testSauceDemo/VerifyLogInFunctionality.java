package testSauceDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomSauceDemo.LogInFunctionality;

public class VerifyLogInFunctionality {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	
	 LogInFunctionality lp=new LogInFunctionality(driver);
      lp.sendUserName("standard_user");
      lp.sendPassword("secret_sauce");
      lp.clickLogInButton();

      String expectedTitle="Swag Labs";
      
      String actualTitle=driver.getTitle();
      
      if(expectedTitle.equals(actualTitle))
      {
    	  System.out.println("pass");
      }
      else
      {
    	  System.out.println("fail");
      }

}



	
	
}

package testSauceDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomSauceDemo.LogOutFunctionality;

public class VerifyLogOutFunctionality {
	public static void main(String[] args) throws InterruptedException {
		{

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			driver.manage().window().maximize();
			LogOutFunctionality lop = new LogOutFunctionality(driver);
			lop.sendUserName("standard_user");
			lop.sendPassword("secret_sauce");
			lop.clickLogInButton();
			Thread.sleep(3000);
			lop.clickOnMenu();
			lop.clickOnLogout();

			String expectedTitle = "Swag Labs";

			String actualTitle = driver.getTitle();

			if (expectedTitle.equals(actualTitle)) {
				System.out.println("pass");
			} else {
				System.out.println("fail");
			}

		}
	}
}

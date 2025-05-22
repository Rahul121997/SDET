package PageObjects;

import org.openqa.selenium.By;

import Utils.DriverUtils;

public class LoginPage {
	
	By username = By.name("username");
	By pwd = By.name("password");
	By loginButton= By.xpath("//button[text()=' Login ']");
	
	DriverUtils dutils= new DriverUtils();
	
	public void enterUsername()
	{
		dutils.sendText(username, "Admin");
	}
	
	public void enterPassword()
	{
		dutils.sendText(pwd, "admin123");
	}
	
	public void clickOnLoginButton()
	{
		dutils.driverClick(loginButton);
	}
	
	

}

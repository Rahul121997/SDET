package Utils;

import org.openqa.selenium.By;

import BaseClass.BaseClass;

public class DriverUtils extends BaseClass{
	
	DynamicWaits wait =new DynamicWaits();
	
	public void sendText(By loctar,String value)
	{
		wait.waitForElement(loctar).sendKeys(value);
	}

	public void driverClick(By loctar)
	{
		wait.waitForElement(loctar).click();
	}

	
}

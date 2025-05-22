package Utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.BaseClass;

public class DynamicWaits extends BaseClass{

	WebDriverWait wait;

	public DynamicWaits()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	}

	public WebElement waitForElement(By loctaor)
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(loctaor));
	}

	public WebElement waitForElementClickable(By loctaor)
	{
		waitForElement(loctaor);
		return wait.until(ExpectedConditions.elementToBeClickable(loctaor));
	}



}

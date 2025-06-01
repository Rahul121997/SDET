package BaseClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass 
{

	public static WebDriver driver;

	public void browserInti(String browserType) throws MalformedURLException
	{
		if(browserType.equals("chrome"))
		{

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-blink-features=AutomationControlled"); 

			// Correct WebDriver Hub URL
			URL url = new URL("http://localhost:4444");

			// Initialize RemoteWebDriver
			driver = new RemoteWebDriver(url, options);

		}
		if(browserType.equals("edge"))
		{
			driver= new EdgeDriver();
		}


	}



}

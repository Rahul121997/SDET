package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass 
{
	
	public static WebDriver driver;
	
	public void browserInti(String browserType)
	{
		if(browserType.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		if(browserType.equals("edge"))
		{
			driver= new EdgeDriver();
		}

		
	}
	
	

}

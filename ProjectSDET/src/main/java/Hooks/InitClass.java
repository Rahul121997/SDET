package Hooks;

import java.time.Duration;

import BaseClass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class InitClass extends BaseClass{


	@Before
	public void startUp() 
	{
		browserInti("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}



	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
}

package testRunnerPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public abstract class BaseClass implements WebDriver, Alert {

	
	protected static WebDriver driver;
	
	
	public BaseClass(WebDriver _driver)
	{
		driver = _driver;
	}
	
	public static WebDriver getDriver()
	{
		return driver;
		
	}
	
}

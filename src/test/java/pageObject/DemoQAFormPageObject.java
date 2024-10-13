package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import commonUtilities.CommonAction;

public class DemoQAFormPageObject extends CommonAction{

	public DemoQAFormPageObject(WebDriver _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	
	protected By firstName = By.id("firstName");
	protected By lastname = By.id("lastName");
	protected By email = By.id("userEmail");
	protected By maleRadio = By.xpath("//input[@id='gender-radio-1']//following-sibling::label");

}

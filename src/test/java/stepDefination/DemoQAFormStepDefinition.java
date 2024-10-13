package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageAction.DemoQAFormPageAction;
import testRunnerPack.BaseClass;

public class DemoQAFormStepDefinition {

DemoQAFormPageAction dpa = new DemoQAFormPageAction(BaseClass.getDriver());
	
	
	@Given("^I launch browser \"(.*)\" and navigate to the page having url \"(.*)\"$")
	public void ilaunchbrowserandnavigatetothepagehavingurl(String browserchoice, String url) throws Exception
	{
		dpa.launchBrowserAndURL(browserchoice, url);
	}
	
	// I enter the first name value as ""
	
	@When("^I enter the first name value as \"(.*)\"$")
	public void ienterthefirstnamevalueas(String firstName) throws Throwable
	{
		dpa.enterfirstName(firstName);
	}
	
	@And("^I enter the last name value as \"(.*)\"$")
	public void ienterthelastnamevalueas(String lastName) throws Throwable
	{
		dpa.enterlastName(lastName);
	}
	
	@And("^I enter the email address as \"(.*)\"$")
	public void ientertheemailaddressas(String mailaddress) throws Throwable
	{
		dpa.enteremail(mailaddress);
	}
	
	@And("^I select 'male' radio button$")
	public void iselectmaleradiobutton() throws Throwable
	{
		dpa.clickmaleRadio();
	}
	
}

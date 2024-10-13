package stepDefination;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import commonUtilities.CommonAction;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import testRunnerPack.BaseClass;
public class Hooks {

CommonAction ca = new CommonAction(BaseClass.getDriver());

	
	@Before
	public void navigateToApp() throws Exception
	{
		ca.launchBrowserAndURL("CHROME", "https://demoqa.com/automation-practice-form");
		
	}

	@After
	public void quitBrowserUI()
	{
		//cls.quitBrowser();
	}
	
	@AfterStep
	public void takeScreenshotOfUI(Scenario scenario) {

	//if (scenario.isFailed()) {

	TakesScreenshot ts = (TakesScreenshot) BaseClass.getDriver();

	byte[] src = ts.getScreenshotAs(OutputType.BYTES);
	scenario.attach(src, "image/png", returnCurrentTimeStamp());
	//}

	}
	
	public static String returnCurrentTimeStamp() {
	SimpleDateFormat date = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
	// 20240106144137
	String timeStamp = date.format(new Date());
	String value1 = timeStamp.replaceAll(":", "");
	String value2 = value1.replaceAll(" ", "");
	System.out.println(value2);
	return value2;
}
	
}

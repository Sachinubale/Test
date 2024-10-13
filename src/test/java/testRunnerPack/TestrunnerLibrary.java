package testRunnerPack;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/featureFileFolder/DemoQAFormFeatureFile.feature"},
		glue={"stepDefination"},
		//tags= "@validLogin or @InvalidLogin",
				
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
						},
		monochrome = true	)

public class TestrunnerLibrary {

}

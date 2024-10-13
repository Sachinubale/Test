package commonUtilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testRunnerPack.BaseClass;

public abstract class UIElementClass extends BaseClass implements WebElement {


public UIElementClass(WebDriver _driver) {
		super(_driver);
	}
	public static WebElement createUIelement(By reference) throws Exception {

		//ExtentCucumberAdapter.addTestStepLog("Element created is "+ getDriver().findElement(reference).getAccessibleName());
		return getDriver().findElement(reference);
	}
	public static List<WebElement> createUIelements(By reference) throws Exception {

		return getDriver().findElements(reference);
	}
}

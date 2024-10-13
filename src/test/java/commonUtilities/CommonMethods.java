package commonUtilities;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;


public class CommonMethods extends UIElementClass {

	protected static WebElement element 
	,dragelement, dropelement;

	protected static List<WebElement> multipleElements;
	//static MyWebDriver driver = BaseClass.getDriver();
	static Alert alert;
	static Select select;
	static Actions actions;
	public CommonMethods(WebDriver _driver) {
		super(_driver);
	}

	@Override
	public void get(String url)
	{
		if(!(url==null))
		{
			super.getDriver().get(url);
		}
		else
		{
			ExtentCucumberAdapter.addTestStepLog("url is null");
		}
	}

	@Override
	public String getCurrentUrl() {
		String currentURL = super.getDriver().getCurrentUrl();
		ExtentCucumberAdapter.addTestStepLog("current url is "+currentURL);
		return currentURL;
	}

	@Override
	public String getTitle() {
		String pageTitle = super.getDriver().getTitle();
		ExtentCucumberAdapter.addTestStepLog("page title is "+pageTitle);
		return pageTitle;
	}

	@Override
	public List<WebElement> findElements(By by) {
		return super.getDriver().findElements(by);
	}

	public WebElement findElement(By by) {
		//ExtentCucumberAdapter.addTestStepLog("in find element created by ui element");
		return getDriver().findElement(by);
	}

	@Override
	public String getPageSource() {
		return super.getDriver().getPageSource();
	}


	@Override
	public void quit() {
		super.getDriver().quit();
	}

	@Override
	public Set<String> getWindowHandles() {
		return super.getDriver().getWindowHandles();
	}

	@Override
	public String getWindowHandle() {
		return super.getDriver().getWindowHandle();
	}

	@Override
	public TargetLocator switchTo() {
		return super.getDriver().switchTo();
	}

	@Override
	public Navigation navigate() {
		return super.getDriver().navigate();
	}

	@Override
	public Options manage() {
		return super.getDriver().manage();
	}

	@Override
	public void click() {
			element.click();			
	}

	@Override
	public void submit() {
		element.submit();
	}


	@Override
	public void clear() {
		element.clear();
	}

	@Override
	public String getTagName() {
		return element.getTagName();
	}

	@Override
	public String getAttribute(String name) {
		return element.getAttribute(name);
	}

	@Override
	public boolean isSelected() {
		return element.isSelected();
	}

	@Override
	public boolean isEnabled() {
		return element.isEnabled();
	}

	@Override
	public String getText() {
		return element.getText();
	}

	@Override
	public boolean isDisplayed() {
		return element.isDisplayed();
	}

	@Override
	public Point getLocation() {
		return element.getLocation();
	}

	@Override
	public Dimension getSize() {
		return element.getSize();
	}

	@Override
	public Rectangle getRect() {
		return element.getRect();
	}

	@Override
	public String getCssValue(String propertyName) {
		return element.getCssValue(propertyName);
	}

	@Override
	public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
		return ((TakesScreenshot) super.getDriver()).getScreenshotAs(target);
	}

	@Override
	public void dismiss() {
		((Alert) super.getDriver()).dismiss();
	}

	@Override
	public void accept() {
		((Alert) super.getDriver()).accept();
	}

	@Override
	public void sendKeys(String keysToSend) {
		sendKeys(keysToSend);
	}

	@Override
	public void sendKeys(CharSequence... keysToSend) {
		if(!(keysToSend==null))
		{
			element.sendKeys(keysToSend);
		}
	}

	@Override
	public void close() {
		super.getDriver().close();
	}

	
}

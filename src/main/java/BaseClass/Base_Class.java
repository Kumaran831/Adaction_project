package BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class
	{
	public static WebDriver driver;

	// launching the browser
	public static WebDriver browserLaunch() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mmkumra\\eclipse-workspace\\Adaction_Project\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

		return driver;
	}	
	
	
	// closing the browser
	public static void close() 
	{
		driver.close();

	}

	// clickelement
	public static void clickOnElement(WebElement click1) 
	{
		click1.click();

	}
	
	
	// get title
	public static void getTheTitle() 
	{
		String a = driver.getTitle();
		System.out.println("***The Title is*** " + a);
	}

	// get current url
	public static void getCurrentUrl()
	{
		String b = driver.getCurrentUrl();
		System.out.println("---The URL is---" + b);

	}

	// driver get to launch the webpage
	public static void launchSite(String pageurl)
	{
		driver.get(pageurl);

	}

	// navigateto

	public static void navigateTo(String navi) 
	{
		driver.navigate().to(navi);

	}

	// navigateback

	public static void navigateBack() 
	{
		driver.navigate().back();

	}

	// navigateforward

	public static void navigateForward() 
	{
		driver.navigate().forward();

	}

	// navigateRefresh

	public static void navigateRefresh() 
	{
		driver.navigate().refresh();

	}

	// getattribute

	public static void getAtrrib(WebElement attrib, String attribute) 
	{
		String c = attrib.getAttribute(attribute);
		System.out.println("The Attribute is " + c);

	}

	// gettext

	public static void getTheText(WebElement text1) 
	{
		String d = text1.getText();
		System.out.println("the Text Of Element is " + d);

	}

	// waitimplicit

	public static void waitImpli(long time) 
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}

	// screenshot

	public static void printScreen() throws Throwable
	{

		TakesScreenshot e = (TakesScreenshot) driver;
		File source = e.getScreenshotAs(OutputType.FILE);
		File Destination = new File(
				"C:\\Users\\mmkumra\\eclipse-workspace\\Adaction_Project\\Screenshots\\Project3.png");
		FileUtils.copyFile(source, Destination);

	}
	

	// sendkeys

	public static void sendValues(WebElement send1, CharSequence values) 
	{
		send1.sendKeys(values);

	}
	
	//is enabled
	
	public static void checkEnable(WebElement enable) 
	{
		if (enable.isEnabled()) 
		{
			System.out.println("The Element is ready to process");
		}
		else
		{
			System.out.println("The Element is not enabled");
		}
		
		

	}
	
	//is displayed
	
	public static void checkDisplay(WebElement display) 
	{
		if (display.isDisplayed()) 
		{
			System.out.println("The Element can be Displayed");
		}
		else 
		{
			System.out.println("The Element cannot be displayed");
		}

	}
	
	//is selected
	
	public static void checkSelected(WebElement selected) {
		
		if (selected.isSelected()) 
		{
			System.out.println("The Element is Selected");
		}
		else 
		{
			System.out.println("The Element is not Selected");
		}
		
	}
	
//	{
	//checkbox
	
	//same click operation only. 
	//so just findthecheckbox element and use previous created click method
//	}

	
	//singledropdown
	
	public static void selectSingle(WebElement single, String value) 
	{
		Select s1 = new Select(single);
		s1.selectByValue(value);		

	}
	
	//check is multiple
	
	public static void checkMultiple(WebElement multiple) 
	{
		Select s2 = new Select(multiple);
		if (s2.isMultiple()) 
		{
			System.out.println("+++It is Multiple Dropdown+++");
		}
		else 
		{
			System.out.println("+++It is not Multiple Dropdown+++");
		}
		
	}
	
	//getoptions from the dropdown
	
	public static void getTheOptions(WebElement opt) 
	{
		Select s3 = new Select(opt);
		List<WebElement> options = s3.getOptions();
		int size = options.size();
		for (int i = 0; i <size; i++) 
		{
			String opn1 = options.get(i).getText();
			System.out.println("The Options are :"+opn1);
		}
		

	}
	
	//multiple dropdown
	
	public static void selectMulti(WebElement  multi, int index1) 
	{
		Select s4 = new Select(multi);
		s4.selectByIndex(index1);
	}
	
	//getallselected options
	
	public static void getAllSelected(WebElement getall) 
	{
		Select s5 = new Select(getall);
		List<WebElement> allSelectedOptions = s5.getAllSelectedOptions();
		int size = allSelectedOptions.size();
		for (int i = 0; i <size; i++) 
		{
			String alltext = allSelectedOptions.get(i).getText();
		System.out.println("~~~The Selected Options are ~~~"+alltext);
		}

	}
	
	//get first selected options
	
	public static void getFirstSelected(WebElement getfirst) 
	{
		Select s6 = new Select(getfirst);
		WebElement firstSelectedOption = s6.getFirstSelectedOption();
		String firsttext = firstSelectedOption.getText();
		System.out.println("|||The First Selected Option is |||"+firsttext);

	}
	
	//simplealerts
	public static void simpleAlert() 
	{
		driver.switchTo().alert().accept();
	}
	
	//accept or dismiss alert
	
	public static void confirmAlert()
	{
		driver.switchTo().alert().dismiss();
	}
	
	//scroll down
	
	public static void scrollDown() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("window.scrollBy(0,400)");
	}
	
	//scroll up
	
	public static void scrollUp() 
	{
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,-350)");
	}
	
	//actions
	
	public static void mouseAction(WebElement target) {
		Actions move = new Actions(driver);
		move.moveToElement(target).build().perform();

	}
	
	//frames
	
	public static void switchToFrame(WebElement frames) 
	{
		driver.switchTo().frame(frames);
	}
	
	//robot functions
	
	public static void robotKey() throws AWTException 
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	//windowhandles
	
	public static void handleWindow(String childwindow) 
	{
		driver.getWindowHandle();
		driver.switchTo().window(childwindow);
		
	}
	
	//quit
	
	public static void quitDriver() 
	{
		driver.quit();
	}
	
}

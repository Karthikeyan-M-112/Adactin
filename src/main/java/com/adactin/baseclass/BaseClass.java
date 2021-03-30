package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ContextClickAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver getBrowser(String browsername)
	{
		 try {
		
				if(browsername.equalsIgnoreCase("chrome"))
				{
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Adactin\\Drivers\\chromedriver.exe");
					 driver=new ChromeDriver();
				}
				else if(browsername.equalsIgnoreCase("ie"))
				{
					System.setProperty("webdriver.ie.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumConcepts\\Drivers\\IEDriverServer.exe");
					 driver=new InternetExplorerDriver();
				}
				
				else
				{
					System.out.println("Invalid Browser");
				}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}
		
public static void getUrl(String value)
	{
		try {
			driver.get(value);
			driver.manage().window().maximize();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void waitForElement(WebElement element)
	{
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void clickOnElements(WebElement element)
	{
		waitForElement(element);
		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void inputToElements(WebElement element,String value)
	{
	    waitForElement(element);
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    public static void selectDropDown(WebElement element,String options,String value) {
    	waitForElement(element);
    	try {
			Select s=new Select(element);
			if(options.equalsIgnoreCase("value"))
					{
				s.selectByValue(value);
					}
			if(options.equalsIgnoreCase("visibletext"))
			{
				s.selectByVisibleText(value);
			}
			if(options.equalsIgnoreCase("index"))
			{
				s.selectByIndex(Integer.parseInt(value));
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    //Mousehover
    public static void mouseHover(WebElement element)
    {
    try {
		{
			Actions ac=new Actions(driver);
			ac.moveToElement(element).build().perform();;
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
//RightClick or contextclick
public static void ContextClickAction(WebElement element) {
	Actions ac=new Actions(driver);
	ac.contextClick(element).build().perform();
}
//Doubleclick
public void doubleClick() {
	Actions ac=new Actions(driver);
	ac.doubleClick().build().perform();
}
private void dragAndDrop(WebElement source, WebElement target) {
Actions ac=new Actions(driver);
ac.dragAndDrop(source, target).build().perform();
}
    //Robot class
    public static void keyPress() throws AWTException
    {
    	try {
			Robot rc=new Robot();
			rc.keyPress(KeyEvent.VK_DOWN);
			rc.keyRelease(KeyEvent.VK_DOWN);
			
			rc.keyPress(KeyEvent.VK_ENTER);
			rc.keyPress(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    //alertok
    public static void alertOk()throws InterruptedException
    {
    	
    	Alert alert =driver.switchTo().alert();
    	alert.accept();
			
    }
    //alertcancel
    public static void alertCancel() {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();

	}
    //prompt 
    public static void alertPrompt(String value) {
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(value);
		alert.accept();

	}
    //navigate to
 public static void navigateTo(String url) {
driver.navigate().to(url);
}
 //refresh
public static void navigateRefresh() {
	driver.navigate().refresh();

}
//navigate forward
public static void navigateForward() {
	driver.navigate().forward();

}
//navigate back
public static void navigateBack() {
	driver.navigate().back();

}
public static void currentUrl(String url) {
    driver.getCurrentUrl();

}
public static void enable(WebElement element) {
	element.isEnabled();
}
public static void selected(WebElement element) {
	element.isSelected();

}
public static void displayed(WebElement element) {
	element.isDisplayed();

}
public static void singleFrames(String value) {
	driver.switchTo().frame(value);

}
public static void frames(WebElement element) {
	driver.switchTo().frame(element);
}
public static void defaultContent() {
	driver.switchTo().defaultContent();
}
public static void parentFrame() {
	driver.switchTo().parentFrame();
}

public static void title() {
	driver.getTitle();
}
public static void text(WebElement element) {
	System.out.println(element.getText());
}
public static void attributes(WebElement element) {
	String attributes = element.getAttribute("value");

}

public static void windowHandle(String value) {
	String parentid = driver.getWindowHandle();
	System.out.println(parentid);
    
	Set<String> allId = driver.getWindowHandles();
	for (String id : allId) {
		System.out.println(id);
		String title = driver.switchTo().window(id).getTitle();
		System.out.println(title);
		}
	String actualTitle=value;
	for (String id : allId) {
      if(driver.switchTo().window(id).getTitle().equals(actualTitle))
		break;
	}
}
public static void implicitlyWait() {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}
public static void explicitlyWait(long timeOutInSeconds, WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver, timeOutInSeconds);
    wait.until(ExpectedConditions.visibilityOf(element));

}
 public static void fluentWait() {
	Wait wait=new FluentWait(driver).withTimeout(30,TimeUnit.SECONDS).pollingEvery(30,TimeUnit.SECONDS).ignoring(Exception.class);
    }
 public static void close() {
	driver.close();

}
 public static void quit() {
	 driver.quit();
 }
}




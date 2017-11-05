package seleniumPractice;

import java.awt.Robot;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.sun.jna.platform.FileUtils;



public class openNewTab {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"E://Selenium Software//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("https://www.amazon.in");
		WebElement element = driver.findElement(By.xpath("//*[@id='nav-xshop']/a[5]"));
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.LEFT_CONTROL)
		    .click(element)
		    .click(element)
		    .click(element)
		    .keyUp(Keys.LEFT_CONTROL)
		    .build()
		    .perform();
		
		Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			    .withTimeout(30, TimeUnit.SECONDS)
			    .pollingEvery(5, TimeUnit.SECONDS)
			    .ignoring(NoSuchElementException.class);
		
		driver.navigate().refresh();
		Robot robot = new Robot();
		
		java.io.File src= (java.io.File) ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
		org.apache.commons.io.FileUtils.copyFile(src, new java.io.File(""));		
	}

}


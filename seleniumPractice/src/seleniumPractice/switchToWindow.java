package seleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchToWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"E://Selenium Software//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows");
		
		String win1 = driver.getWindowHandle();
		System.out.println(win1);
		
		driver.findElement(By.xpath("//*[@id='content']/p[3]/button")).click();;
		
		Set<String> win2 = driver.getWindowHandles();
		System.out.println(win2);		
		
		for(String handles:driver.getWindowHandles()){
			System.out.println(handles);
			driver.switchTo().window(handles);
			
		}
	}

}

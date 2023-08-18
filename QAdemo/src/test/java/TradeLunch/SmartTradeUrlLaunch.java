package TradeLunch;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SmartTradeUrlLaunch {
	
	public static WebDriver driver;
	
	@Test
	public void setup( ) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jira.interswitch.com/");
		driver.findElement(By.name("os_username")).sendKeys("demousername");
		
		
		
		driver.findElement(By.name("os_password")).sendKeys("demo password");
		
		
		Assert.assertTrue(driver.findElement(By.name("login")).isEnabled()); 
	
	}
}

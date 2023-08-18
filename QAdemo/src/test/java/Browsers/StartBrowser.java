package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartBrowser {
	
	static WebDriver driver;
	
	public static WebDriver startChrome() {
		 WebDriverManager.chromedriver().setup();
		 return driver = new ChromeDriver();
	}

	 
	 
	 
	public static void startFirefox() {
		 WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
	}
}

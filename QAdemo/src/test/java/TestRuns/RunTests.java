package TestRuns;

import java.time.Duration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Browsers.StartBrowser;


public class RunTests {
	private WebDriver driver;
	


@Test
public void login() throws InterruptedException {
	WebDriver driver = StartBrowser.startChrome();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.get("https://jiji.ng/");
	driver.findElement(By.xpath("(//div[normalize-space()='Registration'])[1]")).click();
	driver.findElement(By.xpath("(//span[@class='fw-button__content'])[32]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("naluchukwuma@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("chukwunalu");
	driver.findElement(By.xpath("//input[@class='fw-input qa-first-name-field']")).sendKeys("felix");
	driver.findElement(By.xpath("//input[@class='fw-input qa-last-name-field']")).sendKeys("chuks");
	driver.findElement(By.xpath("//input[@class='fw-input qa-phone-field']")).sendKeys("08068365769");
	driver.findElement(By.xpath("//button[@class='h-width-100p h-bold qa-registration-submit fw-button qa-fw-button fw-button--type-success fw-button--size-large']//span[@class='fw-button__content']")).click();
	
	driver.findElement(By.xpath("//a[@class='h-base-link']")).click();
	driver.findElement(By.xpath("//button[@class='h-width-100p h-bold fw-button qa-fw-button fw-button--type-success fw-button--size-large']//span[@class='fw-button__content']")).click();
	driver.findElement(By.xpath("//input[@class='fw-input qa-login-field']")).sendKeys("naluchukwuma@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("chukwunalu");
	driver.findElement(By.xpath("//button[@class='h-width-100p h-bold qa-login-submit fw-button qa-fw-button fw-button--type-success fw-button--size-large']//span[@class='fw-button__content']")).click();
	//.manage().timeouts().implicitlyWait(Duration.ofSecondsge__main-section-wrapper']/main/div[@class='h-mb-15']/div[@class='h-dflex h-flex-wrap h-mh--7 h-mb--15']/div[1]/div[1]/a[1]/div[1]")).click();
	//driver.findElement(By.name("name attribute is not available for this element")).sendKeys("shoes");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[contains(text(),'Ok')]")).click();
	driver.findElement(By.xpath("//div[@class='multiselect__tags']")).sendKeys("phone");
	driver.findElement(By.xpath("//img[@alt='Samsung']")).click();
	
	driver.close();
	
	
	



	

	
} 
}

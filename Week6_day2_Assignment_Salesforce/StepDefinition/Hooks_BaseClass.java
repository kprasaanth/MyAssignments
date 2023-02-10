package week6_day2_Assignment_StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class Hooks_BaseClass extends AbstractTestNGCucumberTests{
	public static ChromeDriver driver;
	
	@BeforeMethod()
	public void preCondition() {
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--disable-notifications"); 
		 driver = new ChromeDriver(chrome);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.name("pw")).sendKeys("Leaf@123");
		driver.findElement(By.name("Login")).click();
		WebElement a = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		driver.executeScript("arguments[0].click();", a);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
	}
	
	@AfterMethod()
	public void postCondition() {
		//driver.close();
	}

}

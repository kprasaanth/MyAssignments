package marathon3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class BaseClassSalesforce {
	ChromeDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void beforeMethod(String url, String username, String password) {
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--disable-notifications"); 
		driver = new ChromeDriver(chrome);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pw")).sendKeys(password);
		driver.findElement(By.name("Login")).click();
		WebElement a = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		driver.executeScript("arguments[0].click();", a);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("content");
		driver.findElement(By.xpath("//p[@class='slds-truncate']/mark")).click();
	}

	@AfterMethod
	public void afterMethod() {
		//driver.close();
	}

}

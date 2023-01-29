package week5_day2_assignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LeadBaseClassExcel {
	ChromeDriver driver;
	@Parameters({"url", "username", "password"})
	@BeforeMethod
	public void beforeMethod(String url, String username, String password) {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);

		driver.findElement(By.id("username")).sendKeys(username);

		driver.findElement(By.id("password")).sendKeys(password);

		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	}

	@AfterMethod
	public void afterMethod() {
		//driver.close();
	}

}

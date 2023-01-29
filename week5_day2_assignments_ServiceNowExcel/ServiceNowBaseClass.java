package week5_day2_assignments;

import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ServiceNowBaseClass {
  ChromeDriver driver;
  Shadow shadow;
  @Parameters({"url", "username", "password"})
  @BeforeMethod
  public void beforeMethod(String url, String username, String password) throws InterruptedException {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.findElement(By.id("user_name")).sendKeys(username);
		driver.findElement(By.id("user_password")).sendKeys(password);
		driver.findElement(By.id("sysverb_login")).click();
		shadow = new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//div[contains(text(),'All')]").click();
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Incident");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}

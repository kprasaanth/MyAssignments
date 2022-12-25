package week4_day1_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceNow {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://dev110326.service-now.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().frame("gsft_main");
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("user_password")).sendKeys("India@123");
        driver.findElement(By.id("sysverb_login")).click();
        
	}

}

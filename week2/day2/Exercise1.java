package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");

		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("Demosalesmanager");

		WebElement pass = driver.findElement(By.name("PASSWORD"));
		pass.sendKeys("crmsfa");

		WebElement log = driver.findElement(By.className("decorativeSubmit"));
		log.click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//driver.close();
		
		

	}

}

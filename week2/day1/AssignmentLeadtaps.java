package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentLeadtaps {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("Demosalesmanager");
		
		WebElement pass = driver.findElement(By.name("PASSWORD"));
		pass.sendKeys("crmsfa");
		
		WebElement log = driver.findElement(By.className("decorativeSubmit"));
        log.click();
	}

}

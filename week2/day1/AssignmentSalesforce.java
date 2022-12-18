package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AssignmentSalesforce {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("hari.radhakrishnan@qeagle.com");
		
		WebElement pass = driver.findElement(By.name("pw"));
		pass.sendKeys("Testleaf$321");
		
		WebElement sub = driver.findElement(By.name("Login"));
		sub.click();
		
		

	}

}

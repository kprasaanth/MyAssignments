package week5.day1_assignments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends LeadBaseClass{
	@Test(priority=1)
	public void runEditLead() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Srinivasan");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		String  Title = driver.getTitle();
		System.out.println(Title);
		
		if(Title.equals("Find Leads | opentaps CRM")) {
			System.out.println("Title of the page is correct");
		}else {
			System.out.println("Tile of the page is not correct");
		}
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Srinivasan")).click();
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		WebElement element = driver.findElement(By.xpath("(//input[contains(@name,'companyName')])[2]"));
		element.clear();
		element.sendKeys("ABC");

		driver.findElement(By.xpath("//input[@value='Update']")).click();

		String a = driver.findElement(By.id("viewLead_companyName_sp")).getText();

		if(a.contains("ABC")) {
			System.out.println("Updated value present");	
		}else {
			System.out.println("Updated value not present");
		}
		//driver.close();
			
	}
}

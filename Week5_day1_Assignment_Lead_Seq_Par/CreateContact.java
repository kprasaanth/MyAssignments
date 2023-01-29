package week5.day1_assignments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContact extends LeadBaseClass{
	@Test(priority=0)
	public void runCreateContact() {

		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Firstname1");
		driver.findElement(By.id("lastNameField")).sendKeys("Secondname1");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("FirstnameLocal1");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("SecondnameLocal1");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("ABC");
		driver.findElement(By.xpath("//textarea[contains(@name,'description')]")).sendKeys("Description");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("createContactForm_primaryPhoneAreaCode")).sendKeys("123");
		driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys("1111");
		
	    Select dropdown = new Select(driver.findElement(By.id("createContactForm_generalCountryGeoId")));
	    dropdown.selectByVisibleText("Australia");
	    
	    driver.findElement(By.className("smallSubmit")).click(); 
	
	}
}

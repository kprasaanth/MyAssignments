package week5_day2_assignments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateContact extends BaseClassExcel{
	@Test(priority=1, dataProvider="fetchData")
	public void runCreateContact(String FirstName, String SecondName, String FirstName_Local, String SecondName_Local,String departmentName,String description, String createContactForm_primaryEmail,String AreaCode, String PhoneNumber ) {

		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys(FirstName);
		driver.findElement(By.id("lastNameField")).sendKeys(SecondName);
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys(FirstName_Local);
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys(SecondName_Local);
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys(departmentName);
		driver.findElement(By.xpath("//textarea[contains(@name,'description')]")).sendKeys(description);
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys(createContactForm_primaryEmail);
		driver.findElement(By.id("createContactForm_primaryPhoneAreaCode")).sendKeys(AreaCode);
		driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys(PhoneNumber);
		
	    Select dropdown = new Select(driver.findElement(By.id("createContactForm_generalCountryGeoId")));
	    dropdown.selectByVisibleText("Australia");
	    
	    driver.findElement(By.className("smallSubmit")).click(); 
	}

	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		return Excel_CreateContact.excel();
		
		
	}
}

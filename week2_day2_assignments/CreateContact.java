package week2_day2_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");

		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();

		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Firstname");
		driver.findElement(By.id("lastNameField")).sendKeys("Secondname");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Firstname1");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Secondname1");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Department name");
		driver.findElement(By.xpath("//textarea[contains(@name,'description')]")).sendKeys("Description");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("email123@email.com");
		
	    Select dropdown = new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
	    dropdown.selectByVisibleText("Alabama");
	    
	    driver.findElement(By.className("smallSubmit")).click();
	    driver.findElement(By.xpath("//a[text()='Edit']")).click();
	    driver.findElement(By.xpath("//textarea[contains(@name,'description')]")).clear();
	    driver.findElement(By.name("importantNote")).sendKeys("Important note");
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    
	    String Title = driver.getTitle();
	    
	    System.out.println("Title of the page:"+Title);
	    
	}

}

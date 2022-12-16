package week2_day2_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.lu.a;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");

		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Phone')]")).click();
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("2222");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		Thread.sleep(2000);
		String leadID = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click(); 
		
		System.out.println(leadID);
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("(//td[@class='x-btn-center'])[6]")).click();
		
		Thread.sleep(2000);
		String actual = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();
		String expected = "No records to display";

		if(actual.equals(expected)) {
			System.out.println("No records to display");
		}else {
			System.out.println("Record available");
		}
		//driver.close();
		
	}

}

package week2_day2_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElement(By.xpath("(//span[@class ='x-tab-strip-text '])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("emailAddress")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[6]")).click();
		Thread.sleep(3000);
		String name = driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).getText();
		System.out.println(name);
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		String title = driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).getText();
		
		if(title.equals("Duplicate Lead")) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Title is incorrect");
		}
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title1 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		if(name.equals(title1)) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Title is incorrect");
		}
		
		//driver.close();
	}

}

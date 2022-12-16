package week2_day2_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.xpath("//input[contains(@id, 'username')]")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class, 'decorativeSubmit')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Srinivasan");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[6]")).click();

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

		String a = driver.findElement(By.xpath("//span[contains(text(),'ABC')]")).getText();

		if(a.contains("ABC")) {
			System.out.println("Updated value present");	
		}else {
			System.out.println("Updated value not present");
		}
		//driver.close();
	}
}

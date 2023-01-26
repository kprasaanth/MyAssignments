package week5_day2_assignments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseClassExcel{
	@Test(priority=3, dataProvider="fetchData")
	public void runDuplicateLead(String emailAddress) throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//span[@class ='x-tab-strip-text '])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("emailAddress")).sendKeys(emailAddress);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
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
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException{
		return Excel_DuplicateLead.excel();
	}
}

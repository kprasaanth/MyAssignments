package week5_day2_assignments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.java.lu.a;

public class DeleteLead extends BaseClassExcel{
	@Test(priority=3, dataProvider= "fetchData")
	public void runDeleteLead(String phoneAreaCode, String phoneNumber) throws InterruptedException {

		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Phone')]")).click();
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys(phoneAreaCode);
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		Thread.sleep(2000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[@class='linktext']")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[@class='linktext']")).click(); 
		
		System.out.println(leadID);
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
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
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException{
		return Excel_DeleteLead.excel();
	}
}

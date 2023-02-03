package marathon3;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalesforceTestCase2 extends BaseClassSalesforce{

	@Test(dataProvider="fetchData")
	public void TestCase2(String Opportunity_Name, String Amount) throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='View All Key Deals']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[name()='svg' and @data-key='chevrondown']")).click();
		Thread.sleep(2000);
		WebElement opportunity = driver.findElement(By.xpath("//span[text()='New Opportunity']"));
		driver.executeScript("arguments[0].click();", opportunity);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(Opportunity_Name);
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='New Customer']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Partner Referral']")).click();
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(Amount);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("2/20/2023");
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[1]")).click();
		driver.findElement(By.xpath("(//span[@title='Needs Analysis'])")).click();
		driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='test']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		Thread.sleep(2000);
		String name = driver.findElement(By.xpath("//slot[@name='primaryField']/lightning-formatted-text")).getText();
		System.out.println(name);
		
		if(Opportunity_Name.contains(name)) {
			System.out.println("Opportunity is created");
		}else {
			System.out.println("Opportunity is not created");
		}
	}
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException{
		return ExcelSalesforceTC02.excel();
	}
}

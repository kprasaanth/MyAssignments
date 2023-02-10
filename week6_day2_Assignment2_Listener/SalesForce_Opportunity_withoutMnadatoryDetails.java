package week6_day2_Assignment2_Listener;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SalesForce_Opportunity_withoutMnadatoryDetails extends SalesforceBaseClass{
	@Test
	public void Opportunity() throws InterruptedException {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement b = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();",b);
		driver.findElement(By.xpath("//div[contains(@title,'New')]")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'slds-input')])[3]")).click(); 
		driver.findElement(By.xpath("//input[contains(@name,'CloseDate')]")).sendKeys("12/13/2022");
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		String result = driver.findElement(By.xpath("//div[@class='genericNotification']")).getText();
		String text="Review the following fields";
		if(text.equals(result)) {
			System.out.println("Error populates as expected");
		}else {
			System.out.println("Error not populates as expected");
		}
	}

}



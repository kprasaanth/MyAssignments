package marathon3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalesforceTestCase1 extends BaseClassSalesforce{
	@Test(dataProvider="fetchData")
	public void TestCase1(String Question, String Details) throws InterruptedException {
		
		WebElement chatterClick = driver.findElement(By.xpath("//span[text()='Chatter']"));
		driver.executeScript("arguments[0].click();",chatterClick); 
		Thread.sleep(2000);
		String title = "Chatter Home | Salesforce";
		String actual = driver.getTitle();
		System.out.println(actual);
		if(title.contains(actual)) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Title is not correct");
		}
		driver.findElement(By.xpath("//span[text()='Question']")).click();	
		driver.findElement(By.xpath("//textarea[@class='cuf-questionTitleField textarea']")).sendKeys(Question);
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank slds-rich-text-area__content slds-text-color_weak slds-grow']/p")).sendKeys(Details);
		driver.findElement(By.xpath("//button[text()='Ask']")).click();
		Thread.sleep(2000);
		String question = driver.findElement(By.xpath("(//div[@class='cuf-body cuf-questionTitle forceChatterFeedBodyQuestionWithoutAnswer']/span)[1]")).getText();	
		System.out.println(question);
	}
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException{
		return ExcelSalesforceTC01.excel();
	}
}

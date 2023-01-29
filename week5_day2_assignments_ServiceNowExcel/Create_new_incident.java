package week5_day2_assignments;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class Create_new_incident extends ServiceNowBaseClass {
	@Test(priority=1, dataProvider="fetchData")
	public void Create(String Short_Description) throws InterruptedException {
		
		shadow.findElementByXPath("//span[text()='Create New']").click();
		Thread.sleep(3000);
		
		WebElement a = shadow.findElementByXPath("//iframe[@id='gsft_main']");
        driver.switchTo().frame(a);
		String Incident_number =driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value"); 
		//System.out.println(Incident_number);
		 
		
		driver.findElement(By.xpath("//span[@class='icon icon-search']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> list= new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//td/a[text()='System Administrator']")).click();
		driver.switchTo().window(list.get(0));
		WebElement b = shadow.findElementByXPath("//iframe[@id='gsft_main']");
        driver.switchTo().frame(b);
		driver.findElement(By.id("incident.short_description")).sendKeys(Short_Description);
		driver.findElement(By.xpath("//div[@class='form_action_button_container']/button")).click();
		shadow.findElementByXPath("//input[@class='form-control']").sendKeys(Incident_number, Keys.ENTER);
		
		String text= shadow.findElementByXPath("//a[@class='linked formlink']").getText();
		//System.out.println(text);
		
		  if(Incident_number.equals(text)) {
		  System.out.println("Incident number is correct"); 
		  }else {
			  System.out.println("Incident number is not correct"); 
		  }

	}
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException{
		return Create_new_incident_excel.excel();
	}
}

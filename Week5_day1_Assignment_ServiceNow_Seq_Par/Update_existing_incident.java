package week5.day1_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class Update_existing_incident extends ServiceNowBaseClass{
	@Test
	public void Update() throws InterruptedException {
		
		shadow.findElementByXPath("//mark[text()='Incident']").click();
		WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		Select select = new Select(shadow.findElementByXPath("//select[@id='incident.urgency']"));
		select.selectByValue("1");
		Select select1 = new Select(shadow.findElementByXPath("//select[@id='incident.state']"));
		select1.selectByValue("2");
		String Incident_state= driver.findElement(By.xpath("//span[@class='sn-widget-list-table-cell']//span")).getText();
		String Priority= driver.findElement(By.xpath("//span[text()='Priority']/following::span/span")).getText();
		
		if(Incident_state.contains("In Progress")) {
			System.out.println("Incident state is correct");
		}else {
			System.out.println("Incident state is not correct");
		}
		
		if(Priority.contains("Moderate")) {
			System.out.println("Priority is correct");
		}else {
			System.out.println("Priority is not correct");
		}
		
	}

}

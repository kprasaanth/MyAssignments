package week5.day1_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class Delete_the_incident extends ServiceNowBaseClass{
	@Test
	public void Delete() throws InterruptedException {
		
		shadow.findElementByXPath("//mark[text()='Incident']").click();
		WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		driver.findElement(By.id("sysverb_delete_bottom")).click();

	}

}

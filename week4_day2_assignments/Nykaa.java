package week4_day2_assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--diable-notifications");
		ChromeDriver driver = new ChromeDriver(chrome);
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("(//a[@class='css-1mavm7h'])[2]"))).perform();
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal");
		driver.findElement(By.xpath("//a[contains(text(),'Oreal Paris')]")).click();

		if((driver.getTitle()).contains("L\'Oreal Paris")) {
			System.out.println("Title of the page is correct");
		}
		driver.findElement(By.xpath("//span[@class='sort-name']/following::*[name()='svg' and @class='arrow-icon']")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'control-indicator radio ')])[3]")).click();
		driver.findElement(By.id("category")).click();
		action.moveToElement(driver.findElement(By.xpath("//a[text()='hair']"))).perform();
		action.moveToElement(driver.findElement(By.linkText("Shampoo"))).click().perform();

		Set<String> set = driver.getWindowHandles();

		List<String> list = new ArrayList<String>(set);

		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//span[contains(text(),'Concern')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Color Protection')]")).click();

		String text = driver.findElement(By.xpath("//li[@class='last-list css-vnn8hz']/a")).getText();
		if((driver.getTitle()).contains(text)) {
			System.out.println("Filter is applied with Shampoo");
		}

		driver.findElement(By.xpath("//div[@class='css-1rd7vky']/following::div[contains(text(),'Oreal Paris Colour Protect Shampoo')]")).click();

		Set<String> set1 = driver.getWindowHandles();

		List<String> list1 = new ArrayList<String>(set1);

		driver.switchTo().window(list1.get(2));
		Select drop = new Select(driver.findElement(By.xpath("//select[@class='css-2t5nwu']")));
		drop.selectByValue("0");
		System.out.println("MRP of the product:"+driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText());
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='cart-count']/..//*[name()='svg']")).click();
		driver.switchTo().frame(0);
		String Total = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText();
		System.out.println("Grand Total Amount:"+Total);
		driver.findElement(By.xpath("//span[contains(text(),'Proceed')]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[contains(text(),'Continue as guest')]")).click();
		driver.findElement(By.xpath("//span[@class='css-175whwo ehes2bo0']//*[@alt='Image' and @class='css-16z7tzi ek8d9s80']")).click();
		String Final_Total = driver.findElement(By.xpath("//p[@class='css-cla92e eka6zu20']")).getText();
		if(Total.equals(Final_Total)) {
			System.out.println("Total amount is equal to Grand Total");
		}
		//driver.quit();
	}

}

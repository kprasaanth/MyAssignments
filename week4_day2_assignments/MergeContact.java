package week4_day2_assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MergeContact {

	public static void main(String[] args) {
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--disable-notifications"); 
		ChromeDriver driver = new ChromeDriver(chrome);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click();
		driver.findElement(By.xpath("(//*[@alt='Lookup'])[1]")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> list = new ArrayList<String>(windowHandles);

		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']")).click();
		driver.switchTo().window(list.get(0));
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following::img")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();

		List<String> list1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(list1.get(1));

		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr/td/div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]")).click();
		
		driver.switchTo().window(list1.get(0));
		
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		driver.switchTo().alert().accept();

		String actual = "View Contact | opentaps CRM";

		if(actual.equals(driver.getTitle())) {
			System.out.println("Title of the page is correct");
		}
	}

}

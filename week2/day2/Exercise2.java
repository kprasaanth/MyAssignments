package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");

		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("Demosalesmanager");

		WebElement pass = driver.findElement(By.xpath("//input[@name='PASSWORD']"));
		pass.sendKeys("crmsfa");

		WebElement log = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		log.click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text( ),'Leads')]")).click();
		
		driver.findElement(By.xpath("//a[text() = 'Create Lead']")).click();
        
        
        
	}

}

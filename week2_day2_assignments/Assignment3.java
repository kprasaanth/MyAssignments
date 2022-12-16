package week2_day2_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String Title = driver.getTitle(); 
		
		System.out.println("Title of the page:" +Title);
		
		driver.findElement(By.linkText("Log Out")).click();
		
		//driver.close();

	}

}

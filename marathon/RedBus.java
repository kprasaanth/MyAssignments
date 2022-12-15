package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@class='selected']")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@class='selected']")).click();
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//td[contains(text(),'16')]")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
		System.out.println(driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText() +"Found");
		driver.findElement(By.xpath("(//label[@for='bt_SLEEPER'])[1]")).click();
		System.out.println(driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText());
		driver.findElement(By.xpath("(//div[contains(text(),'View Seats')])[2]")).click();

	}

}

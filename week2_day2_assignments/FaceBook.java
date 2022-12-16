package week2_day2_assignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Firstname");
		driver.findElement(By.xpath("//input[contains(@name, 'lastname')]")).sendKeys("Lastname");
		driver.findElement(By.xpath("//input[contains(@name, 'reg_email__')]")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("123456789");
		
		Select dropdown = new Select(driver.findElement(By.name("birthday_day")));
		dropdown.selectByValue("4");
		
		Select dropdown1 = new Select(driver.findElement(By.name("birthday_month")));
		dropdown1.selectByIndex(6);
		
		Select dropdown2 = new Select(driver.findElement(By.name("birthday_year")));
		dropdown2.selectByVisibleText("2010");
		
		driver.findElement(By.xpath("//input[contains(@class, '_8esa')]")).click();
		
		
		
		
	}

}

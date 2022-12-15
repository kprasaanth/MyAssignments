package marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mongodb.MapReduceCommand.OutputType;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException, IOException {
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		driver.findElement(By.xpath("//span[contains(text(),'Hyderabad')]")).click();
		String actual = driver.getCurrentUrl();
		String expected = "hyderabad";
		
		if(actual.contains(expected)) {
			System.out.println("URL has got loaded with Hyderabad");
		}else {
			System.out.println("URL has not loaded with Hyderabad");
		}
		driver.findElement(By.xpath("//span[@class='sc-fcdeBU cNeUMt']")).click();
		
		driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("Avatar");
		driver.findElement(By.xpath("(//span[@class='sc-jhaWeW ChCae'])[1]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Book tickets')])[1]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'2D')])[1]")).click();
		System.out.println(driver.findElement(By.xpath("//a[contains(@class,'__venue-name')]")).getText());
		driver.findElement(By.xpath("(//div[contains(text(),'INFO')])[1]")).click();
		String a = driver.findElement(By.xpath("(//div[contains(@class,'facility-text')])[4]")).getText();
		
		if(a.contains("Parking Facility")) {
			System.out.println("Parking Facility available");
		}else {
			System.out.println("Parking Facility not available");
		}
		driver.findElement(By.xpath("(//button[contains(text(),'Not Now')])[1]")).click();
		driver.findElement(By.xpath("//div[@class='cross-container']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'06:45 PM')]")).click();
		driver.findElement(By.xpath("(//div[contains(text(),'Accept')])[1]")).click();
		driver.findElement(By.xpath("//li[@id='pop_1']")).click();
		driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'8')])[7]")).click();
		driver.findElement(By.xpath("(//span[@id='btnSTotal_reserve'])[1]")).click();
		System.out.println(driver.findElement(By.xpath("//span[@id='subTT']")).getText());
		
		File screenshotAs = driver.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		//File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
        File dest = new File("./snap/bookMyShow.jpg");
        FileUtils.copyFile(screenshotAs, dest);

	}

}

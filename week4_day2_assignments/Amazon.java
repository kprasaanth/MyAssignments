package week4_day2_assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--diable-notifications");
		ChromeDriver driver = new ChromeDriver(chrome);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);
		
				
		String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println(price);
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-popover']")).click();
		String rating = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-beside-button a-text-bold']")).getText();
		System.out.println(rating);
		driver.findElement(By.xpath("//*[name()='img' and @class='s-image']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> list = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(list.get(1));
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/amazon.png");
		FileUtils.copyFile(source, target);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(3000);
		String subtotal  = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-price a-text-bold']/span")).getText();
		
		String a =subtotal.replace("₹", "");
		String b= a.replace(".00", "");
		
		System.out.println(b);
		if(price.equals(b)) {
			System.out.println("Cart Subtotal is correct");
		}else {
			System.out.println("Cart subtotal is not correct");
		}
		//driver.close();
	}

}

package week4_day1_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().frame("frame1");
        driver.findElement(By.xpath("//b[@id='topic']//following::input")).sendKeys("Text");
        driver.switchTo().frame("frame3");
        driver.findElement(By.xpath("//input[@id='a']")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        Select drop = new Select(driver.findElement(By.id("animals")));
        drop.selectByValue("avatar");
        

	}

}

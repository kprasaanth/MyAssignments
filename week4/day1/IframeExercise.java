package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExercise {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().frame("iframeResult");
        
        
		driver.findElement(By.xpath("//button[contains(text(),'Try')]")).click();
		driver.switchTo().alert().sendKeys("Test");
		
		driver.switchTo().alert().accept();
		String a = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(a);
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/Test.png");
		FileUtils.copyFile(source, target);

	}

}

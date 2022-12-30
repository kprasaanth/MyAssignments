package marathon_2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class AdministratorCertifications {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions noti = new ChromeOptions();
		noti.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(noti);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.name("pw")).sendKeys("Testleaf$321");
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral navButton newWindow uiButton']/span[@class=' label bBody' and text()='Learn More']")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);

		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();

		Shadow shadow = new Shadow(driver);
		shadow.findElementByXPath("//span[text()='Learning']").click();
		
		Actions action = new Actions(driver);
		WebElement li = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		Thread.sleep(2000);
		action.moveToElement(li).perform();
		shadow.findElementByXPath("//a[text()='Salesforce Certification']").click();
		WebElement scroll=driver.findElement(By.xpath("//a[text()='Administrator']"));
		
		action.scrollToElement(scroll).perform();
		scroll.click();
		
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		if((driver.getTitle()).equals("Certification - Administrator")){
			System.out.println("In Administrator Overview window");
		}else {
			System.out.println("Not In Administrator Overview window");
		}
		
		driver.navigate().back();
		WebElement scroll1 = driver.findElement(By.xpath("//h1[text()='What is a Salesforce Administrator?']"));
		Thread.sleep(2000);
		action.scrollToElement(scroll1).perform();
		
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		
		for (WebElement webElement : findElements) {
			System.out.println(webElement.getText());
		}
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/salesforce.png");
		FileUtils.copyFile(source, target);
	}

}

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

public class Architect_Certifications {

	public static void main(String[] args) throws InterruptedException, IOException {
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
		driver.findElement(By.xpath("//*[name()='img' and @alt='Salesforce<br/>Architect']")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'cert-site_text slds-text-align--center Lh(1.5) ')]")).getText());
		System.out.println("****************************************************************************");
		List<WebElement> certificates = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		for (WebElement webElement : certificates) {
			System.out.println(webElement.getText());
		}
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
		System.out.println("****************************************************************************");
		List<WebElement> certificates1 = driver.findElements(By.xpath("(//div[@class='slds-container--center slds-container--x-large slds-p-top--small'])[1]//div[@class='credentials-card_title']"));
		for (WebElement webElement : certificates1) {
			System.out.println(webElement.getText());
		}
		WebElement a = driver.findElement(By.xpath("//a[text()='Platform App Builder']"));
		action.scrollToElement(a).perform();
		Thread.sleep(3000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/salesforce1.png");
		FileUtils.copyFile(source, target);
	}

}

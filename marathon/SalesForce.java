package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class SalesForce {

	private static final Object[] Arguments = null;

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions noti = new ChromeOptions();
        noti.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(noti);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.name("pw")).sendKeys("Testleaf$321");
        driver.findElement(By.name("Login")).click();
     
        
        WebElement a = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
        driver.executeScript("arguments[0].click();", a);
        
        driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
        
        driver.findElement(By.xpath("(//p[@class='slds-truncate'])[7]")).click();
        
        WebElement b = driver.findElement(By.xpath("//span[text()='Opportunities']"));
        driver.executeScript("arguments[0].click();",b);
        
        driver.findElement(By.xpath("//div[contains(@title,'New')]")).click();
      
        driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Prasaanth");
        String text = "Salesforce Automation by Prasaanth";
        
        
        driver.findElement(By.xpath("(//input[contains(@class,'slds-input')])[3]")).click(); 
        driver.findElement(By.xpath("//input[contains(@name,'CloseDate')]")).sendKeys("12/13/2022");
        
        driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']")).click();
      
        driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
        driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
        String result = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
         if(text.equals(result)) {
        	 System.out.println("Opportunities are same");
         }else {
        	 System.out.println("Opportunities are not same");
         }
      
	}

}

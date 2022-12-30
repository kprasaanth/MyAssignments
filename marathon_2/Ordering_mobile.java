package marathon_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class Ordering_mobile {

	public static void main(String[] args) throws InterruptedException {
		EdgeOptions noti = new EdgeOptions();
		noti.addArguments("--disable-notifications");
		EdgeDriver driver = new EdgeDriver(noti);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://dev57553.service-now.com/");
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("user_password")).sendKeys("5$dJ*EFdhhW0");
        driver.findElement(By.id("sysverb_login")).click();
        Shadow shadow = new Shadow(driver);
        shadow.setImplicitWait(10);
        shadow.findElementByXPath("//div[@id='all']").click();
        shadow.findElementByXPath("//span[text()='Service Catalog']").click();
        Thread.sleep(2000);
        
        WebElement a = shadow.findElementByXPath("//iframe[@id='gsft_main']");
        driver.switchTo().frame(a);
        driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
        driver.findElement(By.xpath("//a/strong[text()='iPhone 6s']")).click();
        Select drop = new Select(driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']")));
        drop.selectByValue("gold");
        Select drop1 = new Select(driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[2]")));
        drop1.selectByValue("onehudred_twentyeight");
        driver.findElement(By.id("oi_order_now_button")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class='notification notification-success']/span")).getText());
        System.out.println(driver.findElement(By.xpath("//a[@id='requesturl']/b")).getText());
        
        
      
	}

}

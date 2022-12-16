package week2_day2_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxComponents {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();

		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		Thread.sleep(1000);
		String a = driver.findElement(By.xpath("//span[contains(@class,'ui-growl-title')]")).getText();
		System.out.println(a);
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//span[@class='ui-chkbox-icon ui-icon ui-c ui-icon-check'])[2]")).click();
		Thread.sleep(1000);
		String a1 = driver.findElement(By.xpath("//span[contains(@class,'ui-growl-title')]")).getText();
		System.out.println(a1);
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]")).click();

		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')])[8]")).click();
		Thread.sleep(5000);
		String b = driver.findElement(By.xpath("//p[contains(text(),'State')]")).getText();
		System.out.println(b);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')])[8]")).click();
		Thread.sleep(5000);
		String b1 = driver.findElement(By.xpath("//p[contains(text(),'State')]")).getText();
		System.out.println(b1);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')])[8]")).click();
		Thread.sleep(5000);
		String b2 = driver.findElement(By.xpath("//p[contains(text(),'State')]")).getText();
		System.out.println(b2);
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		Thread.sleep(1000);
		String c = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println(c);
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		Thread.sleep(2000);
		String c1 = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println(c1);

		String a2 = driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled']")).getAttribute("class");
		if(a2.contains("disabled")) {
			System.out.println("Field is Disabled");
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();

		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[8]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[8]")).click();

		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();

	}

}

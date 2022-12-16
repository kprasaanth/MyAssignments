package week2_day2_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioComponents {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.leafground.com/radio.xhtml");

		driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[9]")).click(); 

		System.out.println("Chennai:"+ driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[12]")).isEnabled()); 
		System.out.println("Bengaluru:"+ driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[13]")).isEnabled()); 
		System.out.println("Hyderabad:"+ driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[14]")).isEnabled()); 

		String aa = "active";
		String chrome1 = driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[16]")).getAttribute("class");
		if (chrome1.contains(aa)) {
			System.out.println("Chrome is selected by default");
		} else {
			System.out.println("Chrome is not selected by default");
		}


		String firefox = driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[17]")).getAttribute("class");
		if (firefox.contains(aa)) {
			System.out.println("Firefox is selected by Default");
		} else {
			System.out.println("Firefox is not selected by default");
		}


		String safari = driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active'])[5]")).getAttribute("class");
		if (safari.contains(aa)) {
			System.out.println("Safari is selected by Default");
		} else {
			System.out.println("Safari is not selected by Default");

		}
		String edge = driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[18]")).getAttribute("class");
		if (edge.contains(aa)) {
			System.out.println("Edge is selected by default");
		} else {
			System.out.println("Edge is not selected by default");
		}

		String age = driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[18]")).getAttribute("class");
		if (age.contains(aa)) {
			System.out.println("1-20 Years is slected by default");
		} else {
			System.out.println("1-20 Years is not selected by default");
		}

		String age2 = driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active'])[5]")).getAttribute("class");
		if (age2.contains(aa)) {
			System.out.println("21-40 Years is slected by default");
		} else {
			System.out.println("21-40 Years is not selected by default");
		}

		Thread.sleep(1000);
		String age1 = driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[19]")).getAttribute("class");
		if (age1.contains(aa)) {
			System.out.println("41-60 Years is slected by default");
		} else {
			System.out.println("41-60 Years is not selected by default");
		}



	}

}

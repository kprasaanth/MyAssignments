package week2_day2_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectComponents {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.leafground.com/select.xhtml");

		Select dropdown = new Select(driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"))); 
		dropdown.selectByVisibleText("Selenium");

		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s ui-c']")).click();

		driver.findElement(By.xpath("//li[contains(text(),'India')]")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		List<WebElement> findElements = driver.findElements(By.xpath("//label[text()='Select City']/following::li[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all']"));
		
		for (int i = 0; i < findElements.size(); i++) {
			String text = findElements.get(i).getText();
			System.out.println(text);
		}
		
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[2]")).click();

		driver.findElement(By.xpath("//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'Selenium WebDriver')]")).click();

		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'English')]")).click();

		Thread.sleep(2000);
		WebElement choose = driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[4]"));
		driver.executeScript("arguments[0].click()", choose);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'Two')]")).click();

		// driver.close(); 
	}

}

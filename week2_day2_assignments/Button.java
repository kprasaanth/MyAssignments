package week2_day2_assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Button {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.leafground.com/button.xhtml");
		driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only mr-2 mb-2']")).click();
		
		if(("Dashboard").equals(driver.getTitle())) {
			System.out.println("Title is same");
		}
        driver.navigate().back();
        
        System.out.println(driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']")).isEnabled());
        
        System.out.println(driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).getLocation());
        System.out.println(driver.findElement(By.name("j_idt88:j_idt96")).getCssValue("background-color"));
        
        System.out.println(driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-right']")).getSize());
        System.out.println(driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-button-raised ui-button-success mr-2 mb-2']")).getCssValue("background-color"));
     
        Thread.sleep(1000);
       
        Actions mouse = new Actions(driver);
        
        mouse.moveToElement(driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-button-raised ui-button-success mr-2 mb-2']"))).build().perform();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).getCssValue("background-color"));
       
        driver.findElement(By.xpath("//span[contains(text(),'Image')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Image')]")).click();
        
        
        List<WebElement> list = driver.findElements(By.xpath("//h5[text()='How many rounded buttons are there?']//following::button"));
        int size = list.size();
        System.out.println(size);
        
	}

}

package week2_day2_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InputComponents {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("Name");
		driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all city ui-state-filled']")).sendKeys(",Tambaram");
		System.out.println(driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-disabled')]")).isEnabled());
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		String word = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']")).getAttribute("value");
		System.out.println("Retrieve the typed text." +word);
		
		//Type email and Tab. Confirm control moved to next element.
		driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[2]")).sendKeys("abc@gmail.com", Keys.TAB, "Text");
		
		
		
		driver.findElement(By.xpath("//input[@name='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
		
		String word1 = driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText();
		
		if(word1.equals("Age is mandatory")) {
			System.out.println("Error message is"+word1);
		}
		
		//Click and Confirm Label Position Changes
		String position = driver.findElement(By.name("j_idt106:float-input")).getAttribute("class");
		driver.findElement(By.name("j_idt106:float-input")).sendKeys("Username");
		String position1 = driver.findElement(By.name("j_idt106:float-input")).getAttribute("class");
		if(position.equalsIgnoreCase(position1)) {
			System.out.println("Label position not changed");
		}else {
			System.out.println("Label position changed");
		}
		Thread.sleep(2000);
		
		//Type your name and choose the third option 
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Text");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all'])[3]")).click();
		
		//Type your DOB (mm/dd/yyyy) and confirm date chosen
		driver.findElement(By.name("j_idt106:j_idt116_input")).sendKeys("01/01/2022", Keys.ENTER);
		
		//Type number and spin to confirm value changed
		WebElement c=driver.findElement(By.xpath("//input[@name='j_idt106:j_idt118_input']"));
		c.sendKeys("11");
		driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-n']")).click();
		
		Thread.sleep(2000);
		String d = driver.findElement(By.name("j_idt106:j_idt118_input")).getAttribute("aria-valuenow");
		Thread.sleep(2000);
		System.out.println(d);
		
		if(d.equals("11")) {
			System.out.println("Value not Changed");
		}else {
			System.out.println("Value changed");
		}
		
		int x = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")).getLocation().getX();
		System.out.println("Initial Position:"+x);
		
		driver.findElement(By.name("j_idt106:slider")).sendKeys("50");
		int x1 = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")).getLocation().getX();
		System.out.println("Final Position:"+x1);
		
		if(x!=x1) {
			System.out.println("Position changed");
			
		}
		
		driver.findElement(By.xpath("//input[@class='ui-inputfield ui-keyboard-input ui-widget ui-state-default ui-corner-all is-keypad']")).click();
		
		boolean keyboard = driver.findElement(By.xpath("//button[contains(text(),'Enter')]")).isEnabled();
		
		if(true == keyboard){
			System.out.println("Keyboard appears");
		}else {
			System.out.println("Keyboard not appears");
		}
		
		
	}

}

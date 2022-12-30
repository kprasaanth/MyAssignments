package week4_day2_assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--diable-notifications");
		ChromeDriver driver = new ChromeDriver(chrome);
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='labelIcon']/following-sibling::span[contains(text(),'Fashion') and @class='catText']"))).perform();
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Sports Shoes']"))).click().perform();
		System.out.println("Shoes Count: "+driver.findElement(By.xpath("//h1[@class='category-name']/following::span[@class='category-name category-count']")).getText());
		driver.findElement(By.xpath("//a[@class='child-cat-node dp-widget-link hashAdded']/following::div[@class='child-cat-name ' and text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//span[@class='sort-label']/following::i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		driver.findElement(By.xpath("//li[@data-sorttype= 'plth']")).click();

		
		//List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='lfloat product-desc-price strike ']/following-sibling::span[@class='lfloat product-price']"));
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 1; i < findElements.size(); i++) {
			String a = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[" + i + "]")).getText();
			//String a = findElements.get(i).getText();
			String a1 = a.replace("Rs. ", "");
			int a2 = Integer.parseInt(a1);
			list.add(a2);
			int a3 = Integer.parseInt(a1);
			list1.add(a3);
		}
		System.out.println(list);
		Collections.sort(list1);
		System.out.println(list1);
		int count=0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if((list.get(i)) == (list1.get(j))){
					count++;
				}
			}
		}
		
		if(count == list.size()) {
			System.out.println("Elements arranged in Sorted order");
		}else {
			System.out.println("Elements are not arranged in Sorted order");
		}
		WebElement price = driver.findElement(By.name("fromVal"));
		price.clear();
		price.sendKeys("900");

		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();

		//System.out.println(driver.findElement(By.xpath("//a[@class='price-slider-scroll left-handle ui-slider-handle ui-state-default ui-corner-all hashAdded']")).getLocation());
		driver.findElement(By.xpath("//span[@class='filter-color-tile Gray ']/..")).click();
		action.moveToElement(driver.findElement(By.xpath("//*[@class='product-image wooble']"))).perform();
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		System.out.println("Cost:"+driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText());
		System.out.println("Discount:"+driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText());

		/*File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./snaps/snapdeal");
		FileUtils.copyFile(source, target);
		driver.findElement(By.xpath("//div[@class='close close1 marR10']/i[@class='sd-icon sd-icon-delete-sign']")).click();
		//driver.close();

		 */
	}

}

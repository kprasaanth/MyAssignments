package week4_day2_assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		Set<String> set = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(set);
		driver.switchTo().window(list.get(1));
		String SecondWindow = driver.getTitle();
		driver.close();
		driver.switchTo().window(list.get(0));
		String FirstWindow = driver.getTitle();
		if(!SecondWindow.equals(FirstWindow)) {
			System.out.println("Second Window opened");
		}
		driver.findElement(By.xpath("//span[contains(text(),'Open Multiple')]")).click();
		Set<String> set1 = driver.getWindowHandles();
		System.out.println("No of Windows opened:"+set1.size());
		List<String> list1 = new ArrayList<String>(set1);

		for (int i = 1; i < list1.size(); i++) {
			driver.switchTo().window(list1.get(i));
			driver.close();
		} 
		driver.switchTo().window(list1.get(0));
		driver.findElement(By.xpath("//span[contains(text(),'Close Windows')]")).click();
		Set<String> set2 = driver.getWindowHandles();
		List<String> list2 = new ArrayList<String>(set2);

		for (int i = 1; i < list2.size(); i++) {
			driver.switchTo().window(list2.get(i));
			driver.close();
		} 
		driver.switchTo().window(list2.get(0));
		driver.findElement(By.xpath("//span[contains(text(),'Open with delay')]")).click();
		
		Set<String> set3 = driver.getWindowHandles();
		List<String> list3 = new ArrayList<String>(set3);

		for (int i = 1; i < list3.size(); i++) {
			driver.switchTo().window(list3.get(i));
			driver.close();
		} 
		
	}

}

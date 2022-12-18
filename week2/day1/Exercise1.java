package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Exercise1 {

	public static void main(String[] args) {

    ChromeDriver driver = new ChromeDriver();
    
    driver.get("https://www.facebook.com/");
    
    EdgeDriver drivers = new EdgeDriver();
    drivers.get("https://www.facebook.com/");
    

	}

}

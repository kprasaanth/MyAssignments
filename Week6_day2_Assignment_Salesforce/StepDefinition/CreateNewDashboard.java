package week6_day2_Assignment_StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewDashboard extends Hooks_BaseClass{

	@When("click on Dashboards")
	public void click_on_dashboards() {
		WebElement a = driver.findElement(By.xpath("//p[text()='Dashboards']"));
		driver.executeScript("arguments[0].click();", a); 
	}
	@When("click on New Dashboards button")
	public void click_on_new_dashboards_button() {
		driver.findElement(By.xpath("//div[@title='New Dashboard']")).click();
	}
	@Given("Enter Name as {string}")
	public void enter_name_as(String name) throws InterruptedException {
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys(name);
	}
	@When("Click on Create button")
	public void click_on_create_button() {
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		driver.switchTo().defaultContent();
	}

	@Then("Verify the Created Dashboard")
	public void Verify_the_Created_Dashboard() {
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon slds-m-left_x-small']")).click();
		String text = driver.findElement(By.id("edit-dashboard-title")).getAttribute("value");
		
		if(text.contains("Prasaanth")){
			System.out.println("Dashboard created Successfully");
		}else {
			System.out.println("Dashboard not created Successfully");
		}
	}
}

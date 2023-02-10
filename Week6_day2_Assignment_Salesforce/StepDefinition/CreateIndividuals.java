package week6_day2_Assignment_StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateIndividuals extends Hooks_BaseClass{
	
	@When("click on Individuals")
	public void click_on_Individuals() {
		WebElement element = driver.findElement(By.xpath("//p[text()='Individuals']"));
		driver.executeScript("arguments[0].click();", element); 
	}
	@When("click on New individuals")
	public void click_on_New_individuals() {
		driver.findElement(By.xpath("//div[@title='New']")).click();
	}
	@Given("Enter Last name as {string}")
	public void Enter_Last_name_as(String name) {
		driver.findElement(By.xpath("//input[contains(@class,'lastName')]")).sendKeys(name);
	}
	@When("click on save button")
	public void click_on_save_button() {
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
	}
	@When("Verify the new individual created")
	public void verify_the_new_individual_created() {
		String text = driver.findElement(By.xpath("//span[@class='uiOutputText']")).getText(); 
		if(text.contains("Kumar")){
			System.out.println("New individual created");
		}else {
			System.out.println("New individual not created");
		}
	}
}

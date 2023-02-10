package week6_day2_Assignment_StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewOpportunity extends Hooks_BaseClass{
	public static String text;
	@When("click on Sales")
	public void click_on_sales() {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}
	@When("click on Opportunities")
	public void click_on_opportunities() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[name()='svg' and @data-key='chevrondown']")).click();
	}
	@When("click on New Opportunities")
	public void click_on_new_opportunities() throws InterruptedException {
		Thread.sleep(2000);
		WebElement opportunity = driver.findElement(By.xpath("//span[text()='New Opportunity']"));
		driver.executeScript("arguments[0].click();", opportunity);
	}
	@Given("Enter Opportunity name as {string}")
	public void enter_opportunity_name_as(String opportunityName) {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(opportunityName);
	}
	@Given("choose date {string}")
	public void choose_date(String string) {
		driver.findElement(By.xpath("//input[contains(@name,'CloseDate')]")).sendKeys("02/08/2023");
	}
	@Given("Select Stage as Need Analysis")
	public void select_stage_as_need_analysis() {
		driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']")).click();
        driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
	}
	@When("click on Save button")
	public void click_on_save_button() {
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
	}
	@When("validate the newly created Opportunity")
	public void validate_the_newly_created_opportunity() {
		text = "Salesforce Automation by Prasaanth";
	}
	@Then("Opportunity created Successfully")
	public void opportunity_created_successfully() throws InterruptedException {
		Thread.sleep(2000);
		String result = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
		
		System.out.println(result);
        if(text.contains(result)) {
       	 System.out.println("Opportunities are same");
        }else {
       	 System.out.println("Opportunities are not same");
        }
	}
}

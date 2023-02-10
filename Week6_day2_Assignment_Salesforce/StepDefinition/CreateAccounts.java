package week6_day2_Assignment_StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateAccounts extends Hooks_BaseClass{
	@When("click on Accounts")
	public void click_on_Accounts() {
		WebElement b =driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click();", b);
	}
	@When("click on New")
	public void click_on_New() {
		driver.findElement(By.xpath("//div[@title='New']")).click(); 
	}
	@Given("Enter Account name as {string}")
	public void Enter_Account_name_as(String name) {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name); 
	}
	@And("select Ownership as Public")
	public void select_Ownership_as_Public() {
		driver.findElement(By.xpath("(//span[contains(text(),'None')])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Public']")).click();
	}
	@And("verify the Account created")
	public void verify_the_Account_created() {
		String text = driver.findElement(By.xpath("//div[contains(@class,'testonly')]")).getText();
		if(text.contains("Prasaanth")) {
			System.out.println("Account created Successfully");
		}else {
			System.out.println("Account not created");
		}
	}
}

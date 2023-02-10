package week6_day2_Assignment_StepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.But;

public class CreateOpportunityWIthoutMandatoryfields extends Hooks_BaseClass{
	@But("Alert message displayed for Name and Stage")
	public void Alert_message_displayed_for_Name_and_Stage() {
		String result = driver.findElement(By.xpath("//div[@class='genericNotification']")).getText();
		String text="Review the following fields";
		if(text.equals(result)) {
			System.out.println("Error populates as expected");
		}else {
			System.out.println("Error not populates as expected");
		}
	}
}

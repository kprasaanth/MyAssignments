package week6_day1_Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Lead {
	public String name, leadID;
	ChromeDriver driver;
	@Given("Load the Chrome browser")
	public void load_the_chrome_browser() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Given("Navigate to the url {string}")
	public void navigate_to_the_url(String url) {
	    driver.get(url);
	}
	@Given("Enter the username as {string}")
	public void enter_the_username_as_dempsalesmanager(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	@Given("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
	}
	@When("Click on LogIn button")
	public void click_on_log_in_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@When("Click on CRM\\/SFA")
	public void click_on_crm_sfa() {
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	}
	@Given("Click Contacts")
	public void click_contacts() {
		driver.findElement(By.linkText("Contacts")).click();
	}
	@Given("Click Create Lead")
	public void click_create_lead() {
		driver.findElement(By.linkText("Create Contact")).click();
	}
	@Given("Enter Firstname {string}")
	public void enter_firstname_first_name(String firstName) {
		driver.findElement(By.id("firstNameField")).sendKeys(firstName);

	}
	@Given("Enter Lastname {string}")
	public void enter_lastname_last_name(String LastName) {
		driver.findElement(By.id("lastNameField")).sendKeys(LastName);

	}
	@Given("Enter FirstLocalname {string}")
	public void enter_first_localname_first_local_name(String FirstLocalName) {
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys(FirstLocalName);

	}
	@Given("Enter SecondLocalname {string}")
	public void enter_second_localname_second_local_name(String SecondLocalName) {
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys(SecondLocalName);

	}
	@Given("Enter DepartmentName {string}")
	public void enter_department_name_department_name(String DepartmentName) {
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys(DepartmentName);

	}
	@Given("Enter Description {string}")
	public void enter_description_description(String Description) {
		driver.findElement(By.xpath("//textarea[contains(@name,'description')]")).sendKeys(Description);

	}
	@Given("Enter Email {string}")
	public void enter_email_email(String Email) {
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys(Email);

	}
	@Given("Enter PhoneAreaCode {string}")
	public void enter_phone_area_code_phone_area_code(String PhoneAreaCode) {
		driver.findElement(By.id("createContactForm_primaryPhoneAreaCode")).sendKeys(PhoneAreaCode);

	}
	@Given("Enter PhoneNumber {string}")
	public void enter_phone_number_phone_number(String PhoneNumber) {
		driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys(PhoneNumber);   
	}
	@Given("Select Country")
	public void select_country() {
		Select dropdown = new Select(driver.findElement(By.id("createContactForm_generalCountryGeoId")));
		dropdown.selectByVisibleText("Australia");   
	}
	@When("Click Submit")
	public void click_submit() {
		driver.findElement(By.className("smallSubmit")).click();
	}
	@Then("Lead Created Successfully")
	public void lead_created_successfully() {
		String title = "View Contact | opentaps CRM";
		String expected = driver.getTitle();
		if(title.contains(expected)) {
			System.out.println("Contact created Successfully");
		}else {
			System.out.println("Contact not created");
		}
	}
	
	@When("Click on Leads")
	public void click_on_leads() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	}
	@When("Click on Find Leads")
	public void click_on_find_leads() {
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	}
	@Given("Enter FirstName as {string}")
	public void enter_first_name_as(String FirstName) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(FirstName);
	}
	@When("Click on Find Leads button")
	public void Click_on_Find_Leads_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@When("Click on First Occurance of the list {string}")
	public void click_on_first_occurance_of_the_list(String FirstName) {
		driver.findElement(By.partialLinkText(FirstName)).click();
	}
	@When("Click on Edit")
	public void click_on_edit() {
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
	}
	@When("update the Company name as {string}")
	public void update_the_company_name_as(String CompanyName) {
		WebElement element = driver.findElement(By.xpath("(//input[contains(@name,'companyName')])[2]"));
		element.clear();
		element.sendKeys(CompanyName);
	}
	@When("Click on update")
	public void click_on_update() {
		driver.findElement(By.xpath("//input[@value='Update']")).click();
	}
	@Then("Company name updated successfully")
	public void company_name_updated_successfully() {
		String a = driver.findElement(By.id("viewLead_companyName_sp")).getText();

		if(a.contains("ABC")) {
			System.out.println("Updated value present");	
		}else {
			System.out.println("Updated value not present");
		}
	}
	@When("Click on Email")
	public void click_on_email() {
		driver.findElement(By.xpath("(//span[@class ='x-tab-strip-text '])[3]")).click();
	}
	@Given("Enter mail ID as {string}")
	public void enter_mail_id_as_mail_id(String mailID) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.name("emailAddress")).sendKeys(mailID);
	}
	@Given("Get the name of the First Occurance of the list obtained and print it")
	public void get_the_name_of_the_first_occurance_of_the_list_obtained_and_print_it() throws InterruptedException {
		Thread.sleep(3000);
		name = driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).getText();
		System.out.println(name);
	}
	@When("Click on First Occurance of the list obtained")
	public void click_on_first_occurance_of_the_list_obtained() {
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
	}
	@When("Click on Duplicate Lead")
	public void click_on_duplicate_lead() {
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
	}
	@When("Verify the title of Duplicate Lead")
	public void verify_the_title_of_duplicate_lead() {
		String title = driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).getText();
		
		if(title.equals("Duplicate Lead")) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Title is incorrect");
		}
	}
	@When("Click on Create lead button")
	public void click_on_create_lead_button() {
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	}
	@When("Verify the name of First name with the First occurance of the list obtained")
	public void verify_the_name_of_first_name_with_the_first_occurance_of_the_list_obtained() {
		String title1 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		if(name.equals(title1)) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Title is incorrect");
		}
	}
	@When("Click on Phone tab")
	public void click_on_phone_tab() {
		driver.findElement(By.xpath("//span[contains(text(), 'Phone')]")).click();
	}
	@Given("Area Code as {string}")
	public void area_code_as(String areaCode) {
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys(areaCode);
	}
	@Given("Phone number {string}")
	public void phone_number(String phoneNumber) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
	}
	@Given("Get first occarance of the Lead ID and click")
	public void get_first_occarance_of_the_lead_id_and_click() throws InterruptedException {
		Thread.sleep(2000);
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[@class='linktext']")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[@class='linktext']")).click(); 
		System.out.println(leadID);
	}
	@When("Click Delete")
	public void click_delete() {
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
	}
	@Given("Enter the LeadID from the first occurance of the Lead ID captured")
	public void enter_the_lead_id_from_the_first_occurance_of_the_lead_id_captured() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}
	@Then("No record found displayed")
	public void no_record_found_displayed() throws InterruptedException {
		Thread.sleep(2000);
		String actual = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();
		String expected = "No records to display";

		if(actual.equals(expected)) {
			System.out.println("No records to display");
		}else {
			System.out.println("Record available");
		}
	}
}

package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDef {
	
	@Given("User is logged in")
	public void user_is_logged_in() {
		System.out.println("User is logged in");
	}
	
	@When("User creates a new Deal")
	public void user_creates_a_new_deal() {
		System.out.println("User creates a new Deal");
	}
	
	@When("User views Deal details")
	public void user_views_deal_details() {
		System.out.println("User views Deal details");
	}
	
	@When("User deletes a Deal")
	public void user_deletes_a_deal() {
		System.out.println("User deletes a Deal");
	}
	
	@Given("User is on loginpage")
	public void user_is_on_loginpage() {
	    System.out.println("User is on loginpage");
	}
	
	@When("User creates a new Contact")
	public void user_creates_a_new_contact() {
		System.out.println("User creates a new Contact");
	}
	
	@When("User views Contact details")
	public void user_views_contact_details() {
		System.out.println("User views Contact details");
	}
	
	@When("User deletes a Contact")
	public void user_deletes_a_contact() {
		System.out.println("User deletes a Contact");
	}
	
	@When("User creates a new Task")
	public void user_creates_a_new_task() {
		System.out.println("User creates a new Task");
	}
	
	@When("User views Task details")
	public void user_views_task_details() {
		System.out.println("User views Task details");
	}
	
	
	
	@When("User deletes a Task")
	public void user_deletes_a_task() {
		System.out.println("User deletes a Task");
	}
	
	


	
	

	
}

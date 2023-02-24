package stepdef;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RentersQuoteSteps extends BaseClass {
	
	@Then("select renters LOB")
	public void select_renters_lob() {
	    homePage.selectRentersLOB();
	}
	
	@Given("validate renters about you page title")
	public void validate_renters_about_you_page_title() {
		rayp.verifyRentersAboutYouPageTitle("Property Insurance");
	}

	@Given("insert first name {string}")
	public void insert_first_name(String firstName) {
		rayp.insertFirstName(firstName);
	}

	@Given("insert last name {string}")
	public void insert_last_name(String lastName) {
		rayp.insertlasttName(lastName);
	}

}

package stepdef;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoQuoteSteps extends BaseClass {
	
	@Then("select auto LOB")
	public void select_auto_lob() {
		homePage.selectAutoLOB();

	}

	@When("click coutinue button")
	public void click_coutinue_button() {
		homePage.clickCoutinueBtn();

	}

	@Given("validate about you page title")
	public void validate_about_you_page_title() {
		aboutYouPage.verifyAboutYouPageTitle("Let’s get started.");

	}

	@Then("insert date of birth {string}")
	public void insert_date_of_birth(String dob) {
		aboutYouPage.insertDOB(dob);

	}

}

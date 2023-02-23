package stepdef;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoQuoteSteps extends BaseClass {

	@Given("insert zipcode {string}")
	public void insert_zipcode(String zipcode) {
		homePage.insertZipcode(zipcode);

	}

	@When("click go button")
	public void click_go_button() {
		homePage.clickGoBtn();

	}

	@Then("select auto LOB")
	public void select_auto_lob() {
		homePage.selectAutoLOB();

	}

	@When("click start my quote")
	public void click_start_my_quote() {
		homePage.clickStartMyQuote();

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

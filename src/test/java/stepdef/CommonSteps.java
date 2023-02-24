package stepdef;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import reporting.Logs;

public class CommonSteps extends BaseClass {
	@Given("This is Login page Test")
	public void this_is_login_page_test() {
		Logs.log("Login Page Test");
	}

	@Given("validate homePage title")
	public void validate_home_page_title_the_insurance_savings_you_expect() {
		homePage.verifyHomepageTitle("The Insurance Savings You Expect");
	}

	@Given("This is Auto Quote Test")
	public void this_is_auto_quote_test() {
		Logs.log("Auto Quote Test");
	}

	@Given("insert zipcode {string}")
	public void insert_zipcode(String zipcode) {
		homePage.insertZipcode(zipcode);
	}

	@When("click go button")
	public void click_go_button() {
		homePage.clickGoBtn();

	}

	@When("click start my quote")
	public void click_start_my_quote() {
		homePage.clickStartMyQuote();

	}

}

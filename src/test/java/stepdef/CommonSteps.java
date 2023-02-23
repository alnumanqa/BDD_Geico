package stepdef;

import base.BaseClass;
import io.cucumber.java.en.Given;
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

}

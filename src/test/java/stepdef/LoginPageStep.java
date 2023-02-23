package stepdef;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep extends BaseClass {
	@Given("click login button01")
	public void click_login_button01() {
		loginPage.clickLoginBtn01();

	}

	@When("insert zipcode field {string}")
	public void insert_zipcode_field(String zipcode) {
		loginPage.inputZipcode(zipcode);

	}

	@When("click login button02")
	public void click_login_button02() {
		loginPage.clickLoginBtn02();

	}

	@When("input user id {string}")
	public void input_user_id(String userId) {
		loginPage.inputId(userId);

	}

	@When("input user password {string}")
	public void input_user_password(String password) {
		loginPage.inputPasswoard(password);

	}

	@Then("click login button03")
	public void click_login_button03() {
		loginPage.clickLoginBtn03();

	}

}

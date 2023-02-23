package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import common.CommonAction;

public class LoginPage {

	CommonAction action;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action = new CommonAction(driver);
	}

	@FindBy(xpath = "//span[text()='Log In']//parent::a")
	WebElement login01;
	@FindBy(className = "user-zip")
	WebElement zipcode;
	@FindBy(xpath = "(//button[@id='manageSubmit'])[1]")
	WebElement login02;
	@FindBy(xpath = "//input[@id='TextInputComponent-1']")
	WebElement userIdField;
	@FindBy(xpath = "//input[@id='TextInputComponent-2']")
	WebElement userPassowardField;
	@FindBy(name = "SubmitButtonComponent-1")
	WebElement loginButton03;

	public void clickLoginBtn01() {
		action.click(login01);
	}

	public void inputZipcode(String zipcode) {
		action.insert(login01, zipcode);
	}

	public void clickLoginBtn02() {
		action.click(login02);
	}

	public void inputId(String id) {
		action.insert(userIdField, id);
	}

	public void inputPasswoard(String password) {
		action.insert(userPassowardField, password);
	}

	public void clickLoginBtn03() {
		action.click(loginButton03);
	}

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import common.CommonAction;

public class AboutYouPage {

	CommonAction action;

	public AboutYouPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action = new CommonAction(driver);
	}

	@FindBy(xpath = "//h3[text()='Let’s get started.']")
	WebElement autoAboutYouPageTitle;
	@FindBy(xpath = "//input[@class='date']")
	WebElement dateOfBirth;
	@FindBy(css = "button.btn.btn--primary.btn--full-mobile.btn--pull-right")
	WebElement nextBtn01;
	@FindBy(xpath = "//input[@id='Id_GiveName_43617']")
	WebElement firstNameField;
	@FindBy(id = "Id_GiveName_25419")
	WebElement lastNameField;
	WebElement nextBtn02;
	WebElement addressField;
	WebElement aptField;
	WebElement SSiField;
	WebElement nextBtn03;
	WebElement year;
	WebElement make;
	WebElement modle;

	public void verifyAboutYouPageTitle(String expectedTitle) {
		action.validate(autoAboutYouPageTitle, expectedTitle);
	}

	public void insertDOB(String dob) {
		action.insert(dateOfBirth, dob);
	}

	public void clickNextBtn() {
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		// wait.until(ExpectedConditions.elementToBeClickable(nextBtn01)).click();
		action.click(nextBtn01);
	}

	public void insertFirstName(String firstName) {
		action.insert(firstNameField, firstName);
	}

	public void insertlasttName(String lastName) {
		action.insert(lastNameField, lastName);
	}

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import common.CommonAction;

public class HomePage {

	CommonAction action;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action = new CommonAction(driver);
	}

	@FindBy(tagName = "h1")
	WebElement homepageTitle;
	@FindBy(id = "ssp-service-zip")
	WebElement zipcodeField;
	@FindBy(xpath = "//input[@value='Go']")
	WebElement goBtn;
	@FindBy(xpath = "(//div[@class='product-checkbox'])[1]")
	WebElement autoLOB;
	@FindBy(xpath = "(//div[@class='product-checkbox'])[3]")
	WebElement rentersLOB;
	@FindBy(xpath = "//a[text()='Start My Quote']")
	WebElement starMyQuoteBtn;
	@FindBy(css = "input.btn.btn--primary.btn--full-mobile")
	WebElement continueBtn;

	public void verifyHomepageTitle(String expectedTitle) {
		action.validate(homepageTitle, expectedTitle);
	}

	public void insertZipcode(String zip) {
		action.insert(zipcodeField, zip);
	}

	public void clickGoBtn() {
		action.click(goBtn);
	}

	public void selectAutoLOB() {
		action.click(autoLOB);
	}

	public void selectRentersLOB() {
		action.click(rentersLOB);
	}

	public void clickStartMyQuote() {
		action.click(starMyQuoteBtn);
	}

	public void clickCoutinueBtn() {
		action.click(continueBtn);

	}

}

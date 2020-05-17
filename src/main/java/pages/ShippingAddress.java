package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.Base;

public class ShippingAddress extends Base {

	public ShippingAddress(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='ctl00_cpBody_txtNewRecipientName']")
	WebElement recpName;
	@FindBy(name = "ctl00$cpBody$txtNewAddress")
	WebElement streetAddress;

	// droupdown country

	@FindBy(xpath = "//div[@class='sortddl4']")
	WebElement dropdownCountrylist;

	@FindBy(xpath = "//option[@value='113']")
	WebElement country;

	// ------------droupbownstate
	@FindBy(xpath = "//select[@id='ctl00_cpBody_ddlNewState']")
	WebElement dropdownStateList;

	@FindBy(xpath = "//option value='MH']")
	WebElement state;

	@FindBy(id = "ctl00_cpBody_txtNewCity")
	WebElement cityName;

	@FindBy(id = "ctl00_cpBody_txtNewPincode")
	WebElement pinNumber;

	@FindBy(id = "ctl00_cpBody_txtNewPhone")
	WebElement phoneNumber;

	@FindBy(xpath = "//input[@id='ctl00_cpBody_imgSaveNew']")
	WebElement Save;

	@FindBy(xpath = "//input[@id='ctl00_cpBody_ShoppingCart_lvCart_savecontinue']")
	WebElement saveReview;
	
	@FindBy(xpath="//*[@id=\"ctl00_cpBody_lvCustomerAdd_ctrl0_imgUseAddress\"]")
	WebElement clickAddress;
	
	@FindBy(xpath="//*[@id=\"ctl00_cpBody_ShoppingCart_lvCart_savecontinue\"]")
	WebElement saveContinue;

	public void recipitienName(String name) {
		recpName.sendKeys(name);

	}

	public void streetAddress(String address) {
		streetAddress.sendKeys(address);

	}

	public void selectCountry() throws InterruptedException {
		dropdownCountrylist.click();
		Select select = new Select(country);
		select.selectByVisibleText("India");
	}

	public void selectState() throws InterruptedException {
		dropdownStateList.click();
		Select dropdownStateList = new Select(state);
		dropdownStateList.selectByVisibleText("Maharashtra");
		Thread.sleep(2000);
	}

	public void enterCityName(String city) {
		cityName.sendKeys(city);
	}
	public void enterPinCode(String pin) {
		pinNumber.sendKeys(pin);
	}
	public void enterphoneNumber(String number) {
		phoneNumber.sendKeys(number);
	}
	public void save() {
		Save.click();
		saveReview.click();
	}
    public void ClickOnAddress() {
    	clickAddress.click();
    }
    public void Continue() {
    	saveContinue.click();
    }
}

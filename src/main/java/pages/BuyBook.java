package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class BuyBook extends Base {

	public BuyBook(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * @FindBy(xpath = "//a[contains(text(),'Essential Concepts of Tai Chi')]")
	 * WebElement bookName;
	 */

	@FindBy(xpath = "//div[1]//div[4]//div[5]//a[1]//input[1]")
	WebElement buyNow;

	@FindBy(xpath = "//input[@id='BookCart_lvCart_imgPayment']")
	WebElement clicked;

	@FindBy(xpath = "//*[@id=\"BookCart_lvCart_ctrl0_imgDelete\"]")
	WebElement remove;

	@FindBy(xpath = "//*[@id=\"BookCart_lvCart_ctrl0_txtQty\"]")
	WebElement Quantity;

	@FindBy(xpath = "//*[@id=\"BookCart_lvCart_imgPayment\"]")
	static WebElement PlaceOrder;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div[2]/div[1]/div[2]/div/div/div/a")
	WebElement save;

	/*
	 * public void bookName() { bookName.click(); }
	 */
	public void buyNow() {
		buyNow.click();
	}

	public void onClick() {
		clicked.click();
	}

	public void RemoveFromCart() {
		remove.click();
	}

	public void changeQuantity(String no) {
		Quantity.click();
		Quantity.clear();
		Quantity.sendKeys(no);
	}

	public void placeOrder() {
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("arguments[0].click();", PlaceOrder);
	}
    public void Save() {
    	save.click();
    }
}

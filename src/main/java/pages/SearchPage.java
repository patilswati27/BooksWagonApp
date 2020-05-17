package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

/**
 * @author Swati Patil
 * Defines search page attributes and methods
 */
public class SearchPage extends Base {

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ctl00_TopSearch1_txtSearch")
	WebElement searchBar;

	@FindBy(id = "ctl00_TopSearch1_Button1")
	WebElement click;

	public void SearchBar(String element) {
		searchBar.sendKeys(element);  
	}
       
	public void onClick() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}

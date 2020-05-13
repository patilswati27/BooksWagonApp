package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

/**
 * @author Swati Patil
 * Loginpage Attributes and methods
 */
public class LoginPage extends Base {

	public LoginPage(WebDriver driver) {
		this.driver=driver;
        PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@id='ctl00_phBody_SignIn_txtEmail']")
	WebElement emailId;

	@FindBy(xpath = "//input[@id='ctl00_phBody_SignIn_txtPassword']")
	WebElement pwd;

	@FindBy(xpath = "//*[@id=\"ctl00_phBody_SignIn_btnLogin\"]")
	WebElement SignIn;
	 
	public void Userlogin() {
		SignIn.click();
	}
	public void mail(String name) {
		emailId.sendKeys(name);
	}     
    public void password(String psw) {
		pwd.sendKeys(psw);
	}

	public void login() throws AWTException, InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div[1]/div/div[4]/div[1]/ul/li[1]/a")))
		.click().build().perform();
	}

}

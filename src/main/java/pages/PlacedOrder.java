package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class PlacedOrder extends Base {
    JavascriptExecutor jse = ((JavascriptExecutor)driver);
    
	public PlacedOrder() {
		this.driver=driver;
        PageFactory.initElements(driver,this);
	}
        @FindBy(xpath ="//*[@id=\"BookCart_lvCart_imgPayment\"]")
        WebElement PlaceOrder;
     
        public void PlaceOrder() throws AWTException{
        jse.executeScript("arguments[0].click();",PlaceOrder );
        
       }
        public void onClick()throws AWTException {
        	Robot robot = new Robot();
    		robot.mouseMove(193, 414);
    		robot.keyPress(KeyEvent.VK_ENTER);
    		robot.keyRelease(KeyEvent.VK_ENTER);	
        	}
}

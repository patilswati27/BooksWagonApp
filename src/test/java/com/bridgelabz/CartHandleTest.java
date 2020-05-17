package com.bridgelabz;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import pages.BuyBook;

/**
 * @author Swati Patil
 * To handle cart items like change quantity and remove items from cart
 */
public class CartHandleTest extends Base { 
@Test
public static void buyNow() throws AWTException, InterruptedException{
	 BuyBook buyBook=new BuyBook(driver);
	 buyBook.buyNow();
	 buyBook.changeQuantity("2");
	 buyBook.placeOrder();
	 buyBook.Save();
	 //buyBook.RemoveFromCart();
}   

}

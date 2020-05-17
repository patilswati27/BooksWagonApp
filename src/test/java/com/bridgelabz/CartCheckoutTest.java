package com.bridgelabz;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import base.Base;
import pages.ShippingAddress;

/**
 * @author Swati Patil
 * To manage shopping cart
 */
public class CartCheckoutTest extends Base {

	@AfterTest
	public void quit() {
		tearDown();
	}

	@Test
	public static void givenCustomersAddres_whenClickContinur_shouldlandOnNextpage() throws InterruptedException {
		ShippingAddress address = new ShippingAddress(driver);
		address.ClickOnAddress();
		address.Continue();
		address.recipitienName("pooja");
		address.streetAddress("bhusawal dist jalgaon");
		address.selectCountry();
		address.selectState();
		address.enterCityName("jalgaon");
		address.enterPinCode("0251421");
		address.enterphoneNumber("9168323087");
		address.save();
		address.Continue();

	}

}

package com.bridgelabz;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import pages.SearchPage;

/**
 * @author Swati Patil
 * purpose:To test search functionality of app
 */
public class SearchTest extends Base {
	@Test
	public static void givenPublisherName_whenSearchBook_ShouldReturnThisBook()
			throws AWTException, InterruptedException {
		SearchPage search = new SearchPage(driver);
		search.SearchBar("Xlibris Corporation");
		search.onClick();
	}
}

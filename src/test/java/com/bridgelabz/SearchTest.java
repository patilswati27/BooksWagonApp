package com.bridgelabz;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import pages.SearchPage;

public class SearchTest extends Base {
	
	@BeforeClass
	public void setup() {
	setUp();
	}

@Test
public static void givenAuthorName_whenSearchBook_ShouldReturnThisBook() throws AWTException, InterruptedException{
	
LoginTest loginCustomer=new LoginTest();
SearchPage search= new SearchPage(driver);
search.SearchBar("bookchef");
search.onClick();
}
}

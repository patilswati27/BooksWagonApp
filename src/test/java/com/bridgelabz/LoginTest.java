package com.bridgelabz;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;

/**
 * @author Swati Patil
   To test loginpage
 */
public class LoginTest extends base.Base{

    @BeforeTest
	public void SetUp() {
    setUp();
	}
	@Test
	public static void givenLoginPage_WhenEnterTheLoginDetail_ShouldLoginSuccessful() throws AWTException, InterruptedException {
		LoginPage login=new LoginPage(driver);
		login.login();
		login.mail("swatip888@gmail.com");
		Thread.sleep(1000);
		login.password("12345678");
		login.Userlogin();		
	}
	}
	


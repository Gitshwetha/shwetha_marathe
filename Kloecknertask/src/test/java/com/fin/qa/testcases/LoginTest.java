package com.fin.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fin.qa.util.TestUtil;
import com.fin.qa.base.TestBase;
import com.fin.qa.pages.HomePage;
import com.fin.qa.pages.LoginPage;

public class LoginTest extends TestBase{
	LoginPage loginPage;
	TestUtil testUtil;
	HomePage homepage;

	String sheetName = "vadetails";
	String insheetName = "indetails";

	public LoginTest(){
		super();
	}
	//test cases should be separated -- independent with each other
			//before each test case -- launch the browser
			//@test -- execute test case to validate valid login 
			//after each test case -- close the browser

	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	@Test(priority=1)
	public void loginTest() throws InterruptedException{
		Thread.sleep(3000);
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"),prop.getProperty("useremail"));
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
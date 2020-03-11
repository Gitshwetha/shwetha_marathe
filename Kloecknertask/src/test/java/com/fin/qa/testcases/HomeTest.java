package com.fin.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fin.qa.base.TestBase;
import com.fin.qa.pages.HomePage;
import com.fin.qa.pages.LoginPage;

public class HomeTest extends TestBase {

	LoginPage loginPage;

	HomePage homePage;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"), prop.getProperty("useremail"));
	}

	@Test
	public void createboardsuccesstest() throws InterruptedException {
		homePage.createaBoard();
	}

	@Test
	public void checkInformationonnNavigation() throws InterruptedException {

		homePage.navigateToInformation();

	}

}
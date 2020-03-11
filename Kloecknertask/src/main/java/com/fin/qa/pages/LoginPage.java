package com.fin.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fin.qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(id="user")
	WebElement username;

	@FindBy(id="password")
	WebElement password;

	@FindBy(id="login")
	WebElement submit;
	
	@FindBy(id="login-submit")
	WebElement cont;
	
	@FindBy(id="username")
	WebElement useremail;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}

	public  void login(String uname, String pword, String uemail) throws InterruptedException{

		username.sendKeys(uname);
		submit.click();
		useremail.sendKeys(uemail);
		cont.click();
		password.sendKeys(pword);
		cont.click();
		Thread.sleep(4000);

	}

}
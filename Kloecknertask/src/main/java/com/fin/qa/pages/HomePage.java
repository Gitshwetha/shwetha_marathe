package com.fin.qa.pages;

import java.util.ArrayList;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.fin.qa.base.TestBase;

import junit.framework.Assert;

public class HomePage extends TestBase {
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/button[1]")
	WebElement addbtn;

	@FindBy(xpath = "//div/section/div/nav/ul/li[1]/button")
	WebElement createboardbtn;

	@FindBy(xpath = "//*[@id=\"layer-manager-overlay\"]/div/div/div[1]/div/input")
	WebElement boardtitle;

	@FindBy(xpath = "//*[@id=\"layer-manager-overlay\"]/div/div/div[2]/div[2]/button")
	WebElement createboard;

	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/main/div[3]/div/div[1]/div[1]/div[1]/input")
	WebElement btitle;

	@FindBy(name = "information")
	WebElement info;

	@FindBy(xpath = "/html/body/div[4]/div/section/div/div/div/a")
	WebElement infoimg;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void createaBoard() throws InterruptedException {
		try {
			addbtn.click();
			createboardbtn.click();
			boardtitle.sendKeys(prop.getProperty("boardname"));
			createboard.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void navigateToInformation() {
		String oldTab = driver.getWindowHandle();
		info.click();
		infoimg.click();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);
		driver.switchTo().window(newTab.get(0));
		String titleoftab = driver.getTitle();
		Assert.assertEquals(titleoftab, prop.getProperty("infotab"));
		System.out.println(titleoftab);

	}

}

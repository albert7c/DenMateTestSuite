package com.denmate.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VancouverSpecialsPage extends BasePage {

	public VancouverSpecialsPage (WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH, using = "//span[contains(@class, 'numberOfUsersCounter')]")
	private static WebElement numberOfUsersCounter;

	@FindBy(how = How.XPATH, using = "//span[contains(@class, 'numberOfPropertiesCounter')]")
	private static WebElement numberOfPropertiesCounter;

	public WebElement getNumberOfUsersCounter() {
		return numberOfUsersCounter;
	}

	public WebElement getNumberOfPropertiesCounter() {
		return numberOfPropertiesCounter;
	}
}

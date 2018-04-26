package com.denmate.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

	public HomePage (WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH, using = "//div[@id=\"exploreUniversitiesDiv\"]//a[contains(text(), 'Learn More')]")
	private static WebElement vancouverSpecialsLearnMoreButton;

	public VancouverSpecialsPage navigateToVancouverSpecialsPage() {
		VancouverSpecialsPage vancouverSpecialsPage = new VancouverSpecialsPage(driver);
		vancouverSpecialsLearnMoreButton.click();

		return vancouverSpecialsPage;
	}
}

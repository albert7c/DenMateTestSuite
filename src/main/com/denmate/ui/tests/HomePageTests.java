package com.denmate.ui.tests;

import com.denmate.ui.pages.HomePage;

import com.denmate.ui.pages.VancouverSpecialsPage;
import com.denmate.ui.templates.UITestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends UITestTemplate {

	@Test( groups = "HomePageTests" )
	public void testVancouverSpecialsPage() {
		HomePage homePage = new HomePage(driver);
		VancouverSpecialsPage vancouverSpecialsPage = homePage.navigateToVancouverSpecialsPage();
		Assert.assertNotNull(vancouverSpecialsPage.getNumberOfPropertiesCounter().getText());
		Assert.assertNotNull(vancouverSpecialsPage.getNumberOfUsersCounter().getText());
	}

}

package com.denmate.ui.templates;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class UITestTemplate {

	protected WebDriver driver;
	private static final String PATH_TO_RESOURCES_FOLDER = "/src/resources/";
	private static final String CHROMEDRIVER_FILENAME = "chromedriver";

	@BeforeSuite( groups = "ui" )
	protected void setupDriverBeforeSuite() {
		System.setProperty("webdriver.chrome.driver", String.format(
				System.getProperty("user.dir") + "%s%s", PATH_TO_RESOURCES_FOLDER, CHROMEDRIVER_FILENAME))
		;
	}

	@BeforeMethod( groups = "ui" )
	protected void setupDriverBeforeMethod() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.denmate.com/");
	}

	@AfterMethod( groups = "ui" )
	protected void tearDownDriverAfterClass() {
		driver.quit();
	}
}

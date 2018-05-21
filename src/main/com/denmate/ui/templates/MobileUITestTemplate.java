package com.denmate.ui.templates;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileUITestTemplate {
	protected static String _APP_PATH = new String();
	protected static String _APPIUM_NODE_URL = new String();
	protected IOSDriver driver;

	@BeforeSuite( groups = "ui-mobile" )
	public void setupDriverBeforeSuite() throws MalformedURLException {
		_APP_PATH = System.getProperty("appPath");
		_APPIUM_NODE_URL = System.getProperty("appiumNodeUrl");
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.3");
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone Simulator");
		desiredCapabilities.setCapability(MobileCapabilityType.APP, _APP_PATH);
		desiredCapabilities.setCapability("appiumVersion", "5.0.4");
		desiredCapabilities.setCapability("name", "DenMateMobileTestSuite");
//		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4");
//		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
//		capabilities.setCapability(MobileCapabilityType.APP, myApp);

		URL localURL = new URL(_APPIUM_NODE_URL);

		driver = new IOSDriver(localURL, desiredCapabilities);
	}

	@AfterSuite( groups = "ui-mobile" )
	public void tearDownAfterSuite() throws Exception {
		driver.quit();
	}
}

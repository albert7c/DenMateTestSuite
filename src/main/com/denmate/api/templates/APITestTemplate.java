package com.denmate.api.templates;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class APITestTemplate {
	public static String _GET_USER_USERID = new String();

	protected static String _API_HOST = new String();
	protected static String _GET_USER_AUTHTOKEN = new String();

	protected final static String _DEV_API_PATH = "/dev/api/";
	protected final static String _USER_ENDPOINT = "user";

	protected final static String _QUERYSTRING_ID = "id=";
	protected final static String _QUERYSTRING_QUESTIONMARK = "?";

	protected final static String _GET_METHOD = "GET";

	protected final static String _REQUESTORID_HEADER = "requestorid";
	protected final static String _AUTHORIZATION_HEADER = "Authorization";

	protected final static int _SUCCESSFULL_200_RESPONSE = 200;

	@BeforeSuite( groups = { "api" } )
	public void setupEnvironmentVariablesBeforeSuite(ITestContext context) {
		_API_HOST = System.getProperty("apiHost");
		_GET_USER_USERID = System.getProperty("userId");
		_GET_USER_AUTHTOKEN = System.getProperty("authToken");

	}

	public static HttpURLConnection createRequest(String endPoint) throws IOException {
		URL url = new URL(
				_API_HOST + _DEV_API_PATH + endPoint + _QUERYSTRING_QUESTIONMARK + _QUERYSTRING_ID + _GET_USER_USERID
		);

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod(_GET_METHOD);
		connection.setRequestProperty(_REQUESTORID_HEADER, _GET_USER_USERID);
		connection.setRequestProperty(_AUTHORIZATION_HEADER, _GET_USER_AUTHTOKEN);

		return connection;
	}
}

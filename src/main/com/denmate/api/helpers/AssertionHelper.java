package com.denmate.api.helpers;

import org.testng.Assert;

import static com.denmate.api.helpers.ErrorMessageHelper._RESPONSE_CODE_WAS_NOT_200;
import static com.denmate.api.helpers.ErrorMessageHelper._RESPONSE_WAS_NULL;
import static com.denmate.api.templates.APITestTemplate._SUCCESSFULL_200_RESPONSE;

public class AssertionHelper {

	public static void assertNotNull(Object object) {
		Assert.assertNotNull(object, String.format(_RESPONSE_WAS_NULL, object));
	}

	public static void assert200Response(int responseCode) {
		Assert.assertEquals(responseCode, _SUCCESSFULL_200_RESPONSE, String.format(_RESPONSE_CODE_WAS_NOT_200, responseCode));
	}
}

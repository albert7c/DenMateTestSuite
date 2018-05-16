package com.denmate.api.tests;

import com.denmate.api.helpers.ResponseHelper;
import com.denmate.api.jsonmaps.GetUserObjectMap;
import com.denmate.api.templates.APITestTemplate;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStreamReader;

public class GetUserTests extends APITestTemplate {

	@Test( groups = "api" )
	public void testGetSingleUserTest(ITestContext context) throws IOException {
		InputStreamReader inputStreamReader = createRequest(_USER_ENDPOINT);
		GetUserObjectMap getUserObjectMap = ResponseHelper.mapReponseToJsonMap(GetUserObjectMap.class, inputStreamReader);
		System.out.println(getUserObjectMap.getId());
	}
}

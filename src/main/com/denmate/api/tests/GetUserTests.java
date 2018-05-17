package com.denmate.api.tests;

import com.denmate.api.helpers.ResponseHelper;
import com.denmate.api.jsonmaps.GetUserObjectMap;
import com.denmate.api.templates.APITestTemplate;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;

import static com.denmate.api.helpers.AssertionHelper.assert200Response;
import static com.denmate.api.helpers.AssertionHelper.assertNotNull;

public class GetUserTests extends APITestTemplate {

	@Test( groups = "api" )
	public void testGetSingleUserTest(ITestContext context) throws IOException {
		HttpURLConnection connection = createRequest(_USER_ENDPOINT);
		GetUserObjectMap getUserObjectMap = ResponseHelper.mapReponseToJsonMap(GetUserObjectMap.class, connection);

		assert200Response(connection.getResponseCode());
		assertNotNull(getUserObjectMap.getId());
		assertNotNull(getUserObjectMap.getAccountType());
		assertNotNull(getUserObjectMap.getBoosterCount());
		assertNotNull(getUserObjectMap.getCityName());
		assertNotNull(getUserObjectMap.getDistanceRange());
		assertNotNull(getUserObjectMap.getDob());
		assertNotNull(getUserObjectMap.getEducation());
		assertNotNull(getUserObjectMap.getEmail());
		assertNotNull(getUserObjectMap.getLatitude());
		assertNotNull(getUserObjectMap.getLongitude());
		assertNotNull(getUserObjectMap.getMandatoryQuestions());
		assertNotNull(getUserObjectMap.getMarketingEmails());
		assertNotNull(getUserObjectMap.getPrimaryOccupation());
		assertNotNull(getUserObjectMap.getProfession());
		assertNotNull(getUserObjectMap.getProfileStatus());
		assertNotNull(getUserObjectMap.getPrimaryOccupation());
		assertNotNull(getUserObjectMap.getUsername());
		assertNotNull(getUserObjectMap.getViewCount());
		assertNotNull(getUserObjectMap.getUserIntent());
		assertNotNull(getUserObjectMap.getSessionToken());
		assertNotNull(getUserObjectMap.getGender());
		assertNotNull(getUserObjectMap.getAccountType());
		assertNotNull(getUserObjectMap.getLifeline());
		assertNotNull(getUserObjectMap.getUserLanguage());
		assertNotNull(getUserObjectMap.getDenPreference());
		assertNotNull(getUserObjectMap.getReferralToken());
	}
}

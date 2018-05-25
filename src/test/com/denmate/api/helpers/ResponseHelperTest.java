package com.denmate.api.helpers;

import com.denmate.api.jsonmaps.GetUserObjectMap;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.mockito.Mockito;
import org.testng.Assert;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

import static com.denmate.api.templates.APITestTemplate._GET_USER_USERID;

public class ResponseHelperTest {
	private final static String _ID_STRING = "id";

	@Test
	public void testMapReponseToJsonMap() throws IOException {
		HttpURLConnection conn = Mockito.mock(HttpURLConnection.class);
		InputStream stubInputStream = IOUtils.toInputStream("[{\"" +  _ID_STRING + "\":\"" + _GET_USER_USERID+ "\"}]", "UTF-8");
		Mockito.when(conn.getInputStream()).thenReturn(stubInputStream);
		GetUserObjectMap getUserObjectMap = ResponseHelper.mapReponseToJsonMap(GetUserObjectMap.class, conn);

		Assert.assertEquals(getUserObjectMap.getId(), _GET_USER_USERID);
	}
}

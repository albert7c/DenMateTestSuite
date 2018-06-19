package com.denmate.api.helpers;

import com.denmate.api.jsonmaps.JsonMap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class ResponseHelper {

	public static <T extends JsonMap> T mapReponseToJsonMap(Class<T> objectMapClass, HttpURLConnection connection) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String line;
		StringBuilder sb = new StringBuilder();
		while ((line = br.readLine()) != null) {
			sb.append(line+"\n");
		}

		br.close();
		JsonArray entries = (JsonArray) new JsonParser().parse(sb.toString());
		Gson gson = new GsonBuilder().create();
		T objectMap = gson.fromJson(entries.get(0).toString(), objectMapClass);

		return objectMap;
	}
}

package com.denmate.api.jsonmaps;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

public class GetUserObjectMap extends JsonMap {

	private String userId;
	private String distanceRange;
	private String profileStatus;
	private String userLanguage;
	private String email;
	private String boosterCount;
	private String gender;
	private String cityName;
	private String education;
	private String accountType;
	private String primaryOccupation;
	private String dob;
	private String sessionToken;
	private String username;
	private String referralToken;
	private String profession;
	private String latitude;
	private String longitude;
	private String marketingEmails;

	private int viewCount;

	private JsonArray mandatoryQuestions;
	private JsonArray lifeline;
	private JsonArray denPreference;
	private JsonElement userIntent;


	public String getUserId() { return userId; }
	public String getDistanceRange() {
		return distanceRange;
	}
	public String getProfileStatus() {
		return profileStatus;
	}
	public String getUserLanguage() {
		return userLanguage;
	}
	public String getEmail() {
		return email;
	}
	public String getBoosterCount() {
		return boosterCount;
	}
	public String getGender() {
		return gender;
	}
	public String getCityName() {
		return cityName;
	}
	public String getEducation() {
		return education;
	}
	public String getAccountType() {
		return accountType;
	}
	public String getPrimaryOccupation() {
		return primaryOccupation;
	}
	public String getDob() {
		return dob;
	}
	public String getSessionToken() {
		return sessionToken;
	}
	public String getUsername() {
		return username;
	}
	public String getReferralToken() {
		return referralToken;
	}
	public String getProfession() {
		return profession;
	}
	public String getLatitude() {
		return latitude;
	}
	public String getLongitude() { return longitude; }
	public String getMarketingEmails() {
		return marketingEmails;
	}

	public int getViewCount() {
		return viewCount;
	}

	public JsonArray getMandatoryQuestions() {
		return mandatoryQuestions;
	}
	public JsonArray getLifeline() {
		return lifeline;
	}
	public JsonArray getDenPreference() {
		return denPreference;
	}
	public JsonElement getUserIntent() { return userIntent; }
}

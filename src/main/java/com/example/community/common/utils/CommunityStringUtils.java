package com.example.community.common.utils;

public class CommunityStringUtils {

	private static final String DELIMITER = "";

	public static String concatenateStrings(String... args) {
		return String.join(DELIMITER, args);
	}
}

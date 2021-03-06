package com.services;

public class Manipulation {

	public String manipulation(String str) {

		if (str == null || (str.length() < 2)) {
			return "";
		}

		boolean keepFirst = str.charAt(0) == 'a';
		boolean keepSecond = str.charAt(0) == 'b';

		if (keepFirst && keepSecond) {
			return str;
		} else if (!keepFirst && !keepSecond) {
			return str.substring(2);
		} else if (!keepFirst && keepSecond) {
			return str.substring(1);
		} else if (keepFirst && !keepSecond) {
			return str.charAt(0) + str.substring(2);
		}

		throw new IllegalArgumentException("Something weird happened.");
	}

}

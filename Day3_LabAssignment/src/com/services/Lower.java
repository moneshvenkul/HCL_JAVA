package com.services;

public class Lower {
	public void low() {
		String str = "The Quick BroWn FoX!";

		// Convert the above string to all lowercase.
		String lowerStr = str.toLowerCase();

		// Display the two strings for comparison.
		System.out.println("Original String: " + str);
		System.out.println("String in lowercase: " + lowerStr);
	}
}

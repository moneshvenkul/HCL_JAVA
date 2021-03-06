package com.main;

import java.util.Scanner;

import com.service.NumberService;

public class MainApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String username = "monesh";
		String password = "pass";

		System.out.println("Log in:");
		System.out.println("username: ");
		username = input.next();

		System.out.println("password: ");
		password = input.next();

		// users check = new users(username, password);

		if (username.equals(username) && password.equals(password)) {
			System.out.println("You are logged in");

			System.out.println("Enter the number");
			int number = input.nextInt();
			System.out.println("Enter 1 to reverse the number");
			System.out.println("Enter 2 to know the number is palindrome or not");
			int choice = input.nextInt();
			if (choice == 1) {
				System.out.println(NumberService.reverse(number));
			} else if (choice == 2) {
				if (NumberService.isPalindrome(number)) {
					System.out.println("PALINDROME");
				} else {
					System.out.println("NOT PALINDROME");
				}
			} else {
				System.out.println("Bad choice");
			}
			input.close();
		}

		else {
			System.out.println("You have entered wrong credentials");
		}
	}
}

package com.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter two Integers");
		try {
			int firstNumber = scanner.nextInt();
			int secondNumber = scanner.nextInt();
			int third = firstNumber / secondNumber;
			System.out.println(third);

		} catch (ArithmeticException e) {
			System.err.println(e);
		} catch (InputMismatchException e) {
			System.err.println(e);
		} catch (Exception e) {
			System.err.println(e);
		}
		scanner.close();

	}

}

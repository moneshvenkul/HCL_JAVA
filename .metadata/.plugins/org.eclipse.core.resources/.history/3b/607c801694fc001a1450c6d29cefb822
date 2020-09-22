package com.arrays.main;

import java.util.Scanner;

import com.arrays.ArrayProcessing;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayProcessing arrayProcessing = new ArrayProcessing();
		System.out.println("Enter the Size of the Array");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the Elements of the Array");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		int[] resultArray = arrayProcessing.ascendingOrder(array);
		System.out.println("After sorting of an array");
		for (int i = 0; i < resultArray.length; i++) {
			System.out.print(resultArray[i] + "  ");
		}

		
	}

}

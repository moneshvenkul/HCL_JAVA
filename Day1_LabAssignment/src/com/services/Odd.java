package com.services;

public class Odd {
	public void getSum(int number) {
		int sum, lastDigit;
		for (sum = 0; number != 0; number /= 10) {
			lastDigit = number % 10;
			if (lastDigit % 2 != 0)
				sum += lastDigit;
		}
		System.out.println(sum);
	}
}

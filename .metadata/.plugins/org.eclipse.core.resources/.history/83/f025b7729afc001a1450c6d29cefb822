package com.service;

public class NumberService {

	public static int reverse(int number)
	{
		int reverseNumber=0;
		while(number>0)
		{
			int n=number%10;
			reverseNumber=reverseNumber*10+n;
			number=number/10;
		}
		return reverseNumber;
		
	}
	public static boolean isPalindrome(int number)
	{
		int reverseNumber=reverse(number);
		if(number==reverseNumber)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

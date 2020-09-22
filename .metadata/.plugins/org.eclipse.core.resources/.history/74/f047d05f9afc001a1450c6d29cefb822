package com.main;

import java.util.Scanner;

import com.service.NumberService;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the number");
       int number=scanner.nextInt();
       System.out.println("Enter 1 to reverse the number");
	System.out.println("Enter 2 to know the number is palindrome or not");
	int choice=scanner.nextInt();
	if(choice==1)
	{
	System.out.println(NumberService.reverse(number));
	}
	else if(choice==2)
	{
	if(NumberService.isPalindrome(number))
	{
		System.out.println("PALINDROME");
	}
	else
	{
		System.out.println("NOT PALINDROME");
	}
	}
	else
	{
		System.out.println("Bad choice");
	}
	}

}

package com.main;

import java.util.Scanner;

import com.processing.Processing;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		boolean repeat=true;
		Processing processing=new Processing();
		System.out.println("enter the string");
		String string = scanner.nextLine();
		while(repeat)
		{
		System.out.println("Press 1 to accept arguments from main");
		System.out.println("Press 2 to search character in a string");
		System.out.println("Press 3 to know each character count in a string");
		System.out.println("press 4 to exit");
		int choice=scanner.nextInt();
		scanner.nextLine();
		if(choice==1)
		{
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("Main Argument"+ args[i]);
		}
		}
		else if(choice==2)
		{
			
			
			System.out.println("Enter character be searched ");
			char character = scanner.next().charAt(0);
			int charPosition=processing.searchStringBycharacter(string, character);
			System.out.println(charPosition);
			
		}
		else if(choice==3)
		{
			
		   processing.characterCountInString(string);
		}
		else if(choice==4)
		{
			repeat=false;
			
		}
		else
		{
			System.out.println("Please enter correct number");
		}
		}

		
		

	}

}

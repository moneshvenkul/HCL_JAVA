package com.services;

public class Room {
	private int number;
	private int area;
	private String acMachine;

	public Room() { // here need to be parameters
		// this you can do your self
	}

	public void setNumber(int num) {
		number = num;

	}

	public void setArea(int a) {
		area = a;
	}

	public void setACMachine(String s) {
		acMachine = s;
	}

	public void displayData() {
		System.out.println("Room Successfully Created");
	}
}
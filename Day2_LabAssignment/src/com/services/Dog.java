package com.services;

class Animal {
	public void walk() {
		System.out.println("I am walking");
	}
}

public class Dog extends Animal {
	public void eat() {
		System.out.println("I am eating");
	}

	public void bark() {
		System.out.println("I am barking");
	}
}

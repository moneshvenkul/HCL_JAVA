package com.main;

import com.services.AddPrint;
import com.services.Bike;
import com.services.Dog;
import com.services.Inherit;
import com.services.Middle;
import com.services.Room;
import com.services.Smallest;
import com.services.Vowel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Smallest smallest = new Smallest();
		smallest.smaller();
		Middle middle = new Middle();
		middle.mid();
		Vowel vowel = new Vowel();
		vowel.vowel_find();
		Room room = new Room();
		room.displayData();
		Inherit inherit = new Inherit();
		inherit.inheritance();
		AddPrint addprint = new AddPrint();
		addprint.add(5, 6, 8, 1, 9);
		new Bike();
		Dog dog = new Dog();
		dog.walk();
		dog.eat();
		dog.bark();

	}

}

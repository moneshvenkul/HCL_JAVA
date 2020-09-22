package com.main;

import com.abstractimpl.A;

public class OOPExercises {

	public static void main(String[] args) {
		A objA = new A();
		System.out.println("in main(): ");
		objA.setA(22);
		System.out.println("objA.a = " + objA.getA());

	}

}

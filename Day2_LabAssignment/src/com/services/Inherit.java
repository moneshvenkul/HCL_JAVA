package com.services;

class a {
	public void print_geek() {
		System.out.println("Monesh");
	}
}

class b extends a {
	public void print_for() {
		System.out.println("Venkul");
	}
}

// Driver class 
public class Inherit {
	public void inheritance() {
		b g = new b();
		g.print_geek();
		g.print_for();
		g.print_geek();
	}
}
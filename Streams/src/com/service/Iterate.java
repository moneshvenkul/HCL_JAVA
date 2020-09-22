package com.service;

import java.util.stream.Stream;

public class Iterate {

	public static void iterate() {
		Stream<Integer> stream = Stream.iterate(2, (i) -> i * i).limit(5);
		stream.forEach((a) -> System.out.println(a));

	}

	public static void main(String[] args) {
		iterate();
	}
}

package com.service;

import java.util.List;

public class ParallelStream {

	public void parallelStream(List<Double> doubles)
	{
		System.out.println("Product OF square Roots");
	
		double squareRoots=doubles.parallelStream().reduce(1.0,(a,b)->(a*Math.sqrt(b)),(a,b)-> a*b);
		System.out.println(squareRoots);
}
}

package com.main;

import com.services.Ascii;
import com.services.Average;
import com.services.Calculator;
import com.services.EvenSquare;
import com.services.Fizz;
import com.services.LongWord;
import com.services.Odd;
import com.services.Prime;
import com.services.Swap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		cal.calculation();
		Average average = new Average();
		average.avg();
		Swap swap = new Swap();
		swap.swapper();
		Prime prime = new Prime();
		prime.prime_check();
		Ascii ascii = new Ascii();
		ascii.ascii_value();
		Fizz fizz = new Fizz();
		fizz.fizz_buzz();
		Odd odd = new Odd();
		odd.getSum(56895);
		EvenSquare even = new EvenSquare();
		even.getsquare();
		LongWord longword = new LongWord();
		longword.longword();

	}

}

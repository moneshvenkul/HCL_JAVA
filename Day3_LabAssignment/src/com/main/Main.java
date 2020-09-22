package com.main;

import com.hcl.Calculator;
import com.services.Ascending;
import com.services.Lower;
import com.services.Manipulation;
import com.services.Palindrome;
import com.services.Pangram;
import com.services.Replace;
import com.services.Reverse;
import com.services.Search;
import com.services.SubString;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lower low = new Lower();
		low.low();

		Replace replace = new Replace();
		replace.repl();

		Ascending ascending = new Ascending();
		ascending.ascend();

		Search search = new Search();
		search.search();

		SubString substring = new SubString();
		substring.subString();

		Palindrome palindrome = new Palindrome();
		palindrome.palindrome();

		Pangram pangram = new Pangram();
		pangram.pangram();

		Manipulation manipulation = new Manipulation();
		System.out.println(manipulation.manipulation("hello"));

		Reverse reverse = new Reverse();
		reverse.reverse();

		Calculator cal = new Calculator();
		System.out.println(cal.add(5, 3));

	}

}

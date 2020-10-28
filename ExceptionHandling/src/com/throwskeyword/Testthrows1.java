/**
 * 
 */
package com.throwskeyword;

import java.io.IOException;

/**
 * @author mvven Java throws keyword The Java throws keyword is used to declare
 *         an exception. It gives an information to the programmer that there
 *         may occur an exception so it is better for the programmer to provide
 *         the exception handling code so that normal flow can be maintained.
 * 
 *         Exception Handling is mainly used to handle the checked exceptions.
 *         If there occurs any unchecked exception such as NullPointerException,
 *         it is programmers fault that he is not performing check up before the
 *         code being used.
 *
 */

class Testthrows1 {
	void m() throws IOException {
		throw new IOException("device error");// checked exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		Testthrows1 obj = new Testthrows1();
		obj.p();
		System.out.println("normal flow...");
	}
}

//Which exception should be declared
//Ans) checked exception only, because:
//
//unchecked Exception: under your control so correct your code.
//error: beyond your control e.g. you are unable to do anything if there occurs VirtualMachineError or StackOverflowError.

//Advantage of Java throws keyword
//Now Checked Exception can be propagated (forwarded in call stack).
//
//It provides information to the caller of the method about the exception.

//Rule: If you are calling a method that declares an exception, you must either caught or declare the exception.

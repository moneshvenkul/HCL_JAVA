/**
 * 
 */
package com.throwkeyword;

/**
 * @author mvven
 * 
 *         Java throw keyword The Java throw keyword is used to explicitly throw
 *         an exception.
 * 
 *         We can throw either checked or unchecked exception in java by throw
 *         keyword. The throw keyword is mainly used to throw custom exception.
 * 
 *         The syntax of java throw keyword is given below.
 * 
 *         throw exception; Let's see the example of throw IOException.
 * 
 *         throw new IOException("sorry device error);
 *
 */
public class TestThrow1 {
	static void validate(int age) {
		if (age < 18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) {
		validate(13);
		System.out.println("rest of the code...");
	}
}
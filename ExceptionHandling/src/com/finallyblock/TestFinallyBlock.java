/**
 * 
 */
package com.finallyblock;

/**
 * @author mvven Java finally block Java finally block is a block that is used
 *         to execute important code such as closing connection, stream etc.
 * 
 *         Java finally block is always executed whether exception is handled or
 *         not.
 * 
 *         Java finally block follows try or catch block. Note: If you don't
 *         handle exception, before terminating the program, JVM executes
 *         finally block(if any). Why use java finally Finally block in java can
 *         be used to put "cleanup" code such as closing a file, closing
 *         connection etc.
 */
class TestFinallyBlock {
	public static void main(String args[]) {
		try {
			int data = 25 / 5;
//	   int data=25/0;  
			System.out.println(data);
		}
//	  catch(ArithmeticException e)
		catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}

//Rule: For each try block there can be zero or more catch blocks, but only one finally block.

//Note: The finally block will not be executed if program exits(either by calling System.exit() or by causing a fatal error that causes the process to abort).
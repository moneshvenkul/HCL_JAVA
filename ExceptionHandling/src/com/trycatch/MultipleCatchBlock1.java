/**
 * 
 */
package com.trycatch;

/**
 * @author mvven
 * 
 *         Java Multi-catch block A try block can be followed by one or more
 *         catch blocks. Each catch block must contain a different exception
 *         handler. So, if you have to perform different tasks at the occurrence
 *         of different exceptions, use java multi-catch block.
 * 
 *         Points to remember At a time only one exception occurs and at a time
 *         only one catch block is executed. All catch blocks must be ordered
 *         from most specific to most general, i.e. catch for
 *         ArithmeticException must come before catch for Exception.
 *
 */

//try block contains two exceptions. But at a time only one exception occurs and its corresponding catch block is invoked.

public class MultipleCatchBlock1 {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
//                a[5]=30/0;       
//                System.out.println(a[10]);  

			String s = null;
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");
	}
}
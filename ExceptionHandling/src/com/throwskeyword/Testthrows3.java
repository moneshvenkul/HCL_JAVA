/**
 * 
 */
package com.throwskeyword;

import java.io.IOException;

/**
 * @author mvven
 * 
 *         Case2: You declare the exception A)In case you declare the exception,
 *         if exception does not occur, the code will be executed fine. B)In
 *         case you declare the exception if exception occures, an exception
 *         will be thrown at runtime because throws does not handle the
 *         exception.
 *
 */

class N {
	void method() throws IOException {
//	 throw new IOException("device error"); 
		System.out.println("device operation performed");
	}
}

class Testthrows3 {
	public static void main(String args[]) throws IOException {// declare exception
		N m = new N();
		m.method();

		System.out.println("normal flow...");
	}
}
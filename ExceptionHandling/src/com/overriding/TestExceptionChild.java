/**
 * 
 */
package com.overriding;

/**
 * @author mvven
 * 
 * 
 *         ExceptionHandling with MethodOverriding in Java There are many rules
 *         if we talk about methodoverriding with exception handling. The Rules
 *         are as follows: 1.If the superclass method does not declare an
 *         exception If the superclass method does not declare an exception,
 *         subclass overridden method cannot declare the checked exception but
 *         it can declare unchecked exception. 2.If the superclass method
 *         declares an exception If the superclass method declares an exception,
 *         subclass overridden method can declare same, subclass exception or no
 *         exception but cannot declare parent exception.
 *
 */

class Parent {
	void msg() {
		System.out.println("parent");
	}
//  void msg()throws ArithmeticException{System.out.println("parent");}
//   void msg()throws Exception{System.out.println("parent");} 
}

class TestExceptionChild extends Parent {
//  void msg()throws IOException
	@Override
	void msg() throws ArithmeticException
//  void msg()throws Exception
	{
		System.out.println("TestExceptionChild");
	}

	public static void main(String args[]) {
		Parent p = new TestExceptionChild();
		p.msg();
	}
}
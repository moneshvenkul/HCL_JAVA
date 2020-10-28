/**
 * 
 */
package com.nested;

/**
 * @author mvven
 * 
 *         Java Nested try block The try block within a try block is known as
 *         nested try block in java.
 * 
 *         Why use nested try block Sometimes a situation may arise where a part
 *         of a block may cause one error and the entire block itself may cause
 *         another error. In such cases, exception handlers have to be nested.
 *
 */
class Nested {
	public static void main(String args[]) {
		try {
			try {
				System.out.println("going to divide");
				int b = 39 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}

			try {
				int a[] = new int[5];
				a[5] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

			System.out.println("other statement");
		} catch (Exception e) {
			System.out.println("handeled");
		}

		System.out.println("normal flow..");
	}
}
/**
 * 
 */
package com.customexception;

/**
 * @author mvven
 *
 */
class InvalidAgeException extends Exception {
	InvalidAgeException(String s) {
		super(s);
	}
}
package com.prog2.labs;

/**
 * @author adinashby
 *
 */
public class LabOne {

	/**
	 * Write your test code below in the main.
	 *
	 */
	public static void main(String[] args) {
		//System.out.println(concatStringToEnd("A", "B"));
		//System.out.println(doesEndWithSecondString("pineapple", "apple"));
		//System.out.println(isPasswordValid("aBc123"));
	}
	
	/**
	 * 1) Write a Java method to concatenate a given string to the end of another string.
	 * 
	 * @param firstString first input string.
	 * @param secondString second input string.
	 *
	 * @return result concatenated string.
	 */
	
	public String concatStringToEnd(String firstString, String secondString) {
		return firstString +" " +secondString;
	}
	
	/**
	 * 2) Write a Java method to check whether a given string ends with 
	 * the contents of another string. 
	 * You can ask the user for the input strings.
	 * 
	 * @param firstString first input string.
	 * @param secondString second input string.
	 *
	 * @return result true if the first string is ending with the second string.
	 */
	
	public boolean doesEndWithSecondString(String firstString, String secondString) {
		
		return firstString.endsWith(secondString);
	}
	
	/**
	 * 3) Write a Java method to generate random integers in a specific range.
	 * 
	 * @param startingNumber starting number.
	 * @param endingNumber ending number.
	 *
	 * @return result randomly generated number within a range.
	 */
	
	public int randomIntegerGenerator(int startingNumber, int endingNumber) {
		 return (int) ((Math.random() * (endingNumber - startingNumber)) + startingNumber);
		
	}
	
	/**
	 * 4) Write a Java method to check whether a password is valid or not. 
	 * A valid password should contain an uppercase letter, lowercase letter, and digit.
	 * 
	 * @param password input password.
	 *
	 * @return result true if the password is valid.
	 */
	
	public boolean isPasswordValid(String password) {
		 boolean uppercase = false;
		 boolean lowercase = false;
		 boolean digit = false; 
	        
		 for (int p = 0; p < password.length(); p++) {
	            if (Character.isUpperCase(password.charAt(p))) {
	            	uppercase = true; 
	            }
	        }
	        for (int q = 0; q < password.length(); q++) {
	            if (Character.isLowerCase(password.charAt(q))) {
	            	lowercase = true; 
	            }
	        }
	        for (int i = 0; i < password.length(); i++) {
	            if (Character.isDigit(password.charAt(i))) {
	            	digit = true; 
	            }
	        }
	        if(uppercase == true && lowercase == true && digit == true)
	        {
	        	return true; 
	        }
	        else
	        {
			return false; 
		}
		
	}

}

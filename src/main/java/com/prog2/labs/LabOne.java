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
//		System.out.println(concatStringToEnd("Programming 2", "Winter 2022")); // worked
//		System.out.println(doesEndWithSecondString("pineapple", "apple")); //true
//		System.out.println(doesEndWithSecondString("java Lab", "ab"));//true
//		System.out.println(doesEndWithSecondString("java Lab", "Ab"));//true
//		System.out.println(doesEndWithSecondString("Winter 2022", "35"));//false
		System.out.println(randomIntegerGenerator(5, 25));
//		System.out.println(isPasswordValid("aBcDeF123"));
//		System.out.println(isPasswordValid("Vanier1"));
//		System.out.println(isPasswordValid("vanier1"));
//		System.out.println(isPasswordValid("Vanier1234"));
	}
	
	/**
	 * 1) Write a Java method to concatenate a given string to the end of another string.
	 * 
	 * @param firstString first input string.
	 * @param secondString second input string.
	 *
	 * @return result concatenated string
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
		firstString = firstString.toLowerCase();
		secondString = secondString.toLowerCase(); 
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
	
	static int randomIntegerGenerator(int startingNumber, int endingNumber) {
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
		 
	        
		 if (password.length() < 8) {
		        return false;
		    } else
		    {
		    for (int p = 0; p < password.length(); p++) {
	            if (Character.isUpperCase(password.charAt(p))) {
	            	uppercase = true; 
	            }
	        }
	        for (int a = 0; a < password.length(); a++) {
	            if (Character.isLowerCase(password.charAt(a))) {
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
}


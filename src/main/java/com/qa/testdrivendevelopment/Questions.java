package com.qa.testdrivendevelopment;

import java.util.Arrays;

public class Questions {

	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}

	/**
	 * Given a string, return a string where for every char in the original string,
	 * there are three chars.<br>
	 * <br>
	 * 
	 * For Example:<br>
	 * multChar("The") → "TTThhheee"<br>
	 * multChar("AAbb") → "AAAAAAbbbbbb"<br>
	 * multChar("Hi-There") → "HHHiii---TTThhheeerrreee"
	 */
	public String multiChar(String input) {
		char [] newString = new char[input.length()*3];
		int counter = 0;
		for (int i = 0; i < input.length(); i++) {
			for (int j =0; j < 3; j++) {
				newString[counter] = input.charAt(i);
				counter ++;
			}
		}
		
		String str = new String(newString);
		return str;
	}

	/**
	 * Return the string (backwards) that is between the first and last appearance
	 * of "bread" in the given string, or return the empty string "" if there is not
	 * 2 occurances of "bread". Ignore Case<br>
	 * <br>
	 * Fr Example: sandwichFilling("breadclivebread") → "evilc"<br>
	 * sandwichFilling("xxbreadfridgebreadyy") → "egdirf"<br>
	 * sandwichFilling("xxBreadfridgeBReAdyy") → "egdirf"<br>
	 * sandwichFilling("xxbreadyy") → "" sandwichFilling("xxbreADyy") → ""<br>
	 * <br>
	 * HINT: "a" == "a" if false HINT: "a".equals("a") is true
	 */

	public String sandwichFilling(String sandwich) {
		
		String input = sandwich.toLowerCase();
		
		
		int firstIndex = input.indexOf("bread") + 5; // first index between "bread"
		int secondIndex = input.substring(firstIndex).indexOf("bread"); //index of "b" in bread
		
		String oldString = input.substring(firstIndex, secondIndex + firstIndex);
		char [] oldStringArray = oldString.toCharArray();
		char [] newArray = new char[oldStringArray.length];
		
		System.out.println(oldString);
		
		int counter = oldStringArray.length;
		
		System.out.println(counter);
		System.out.println(oldStringArray.length);
		
		for (int i = 0; i < oldStringArray.length; i++) {
			newArray[i] = oldStringArray[counter];
			counter = counter -1;
			System.out.println(counter);
			System.out.println(i);
		}
		
		System.out.println(Arrays.toString(newArray));
		
		return "";
	}

	/**
	 * Given three ints, a b c, one of them is small, one is medium and one is
	 * large. Return true if the three values are evenly spaced, so the difference
	 * between small and medium is the same as the difference between medium and
	 * large. Do not assume the ints will come to you in a reasonable order.<br>
	 * <br>
	 * For Example:<br>
	 * evenlySpaced(2, 4, 6) → true<br>
	 * evenlySpaced(4, 6, 2) → true<br>
	 * evenlySpaced(4, 6, 3) → false<br>
	 * evenlySpaced(4, 60, 9) → false
	 */
	public boolean evenlySpaced(int a, int b, int c) {
		int[] ints = {a, b ,c};
		Arrays.sort(ints); //orders array from smallest to largest
		if (ints[1] - ints[0] == ints[2] - ints[1]) {
			return true; 
		} 
		return false;
	}

	/**
	 * Given a string and an int n, return a string that removes n letters from
	 * the'middle' of the string. The string length will be at least n. The input
	 * string will have an odd number of letters. n will always be an odd
	 * number.<br>
	 * <br>
	 * For Example:<br>
	 * nMid("Hello", 3) → "Ho"<br>
	 * nMid("Chocolate", 3) → "Choate"<br>
	 * nMid("Chocolate", 1) → "Choclate"<br>
	 */
	public String nMid(String input, int n) {
		// get length of string
		// divide length by 2 to get middle value
		// divide into 2 substrings based off middle value
		// divide int by 2 with remainder
		// remove that many letter off end of first and remainder
    	return "";
	}

	/**
	 * Given a string, return the boolean True if it ends in "java" and False if
	 * does not end in "java". Ignore Case.<br>
	 * <br>
	 * For Example: <br>
	 * endsJava("ilovejava") → true <br>
	 * endsJava("iloveJaVa") → true <br>
	 * endsJava("welovejava") → true <br>
	 * endsJava("welovejavamoreeveryday") → false <br>
	 * endsJava("javaiscool") → false <br>
	 * endsJava("pythoniscool") → false <br>
	 */
	public boolean endsJava(String input) {
		if (input.toLowerCase().endsWith("java")){
			return true;
		}
    	return false;
	}

	/**
	 * Given a string, return the length of the largest "block" in the string. A
	 * block is a run of adjacent chars that are the same, do not ignore case.<br>
	 * <br>
	 * For Example: superBlock("hooopplla") → 3 <br>
	 * superBlock("abbCCCddDDDDeeEEE") → 4 <br>
	 * superBlock("abbCCCCC")) → 5 <br>
	 * superBlock("") → 0 <br>
	 * <br>
	 * HINT: "a" == "a" if false HINT: "a".equals("a") is true
	 */
	public int superBlock(String input) {
		char[] newInput = input.toCharArray();
		int biggest = 0;
		int current = 1;
		if (input.isEmpty()) {
			return 0;
		}
		for (int i =1 ; i<newInput.length; i++) {
			String str1 = String.valueOf(newInput[i]);
			String str2 = String.valueOf(newInput[i-1]);
			if (str1.equals(str2)) {
				current = current + 1;
			}
			else { if (current > biggest) {
					biggest = current;
				}
				current = 1;
			}
		}
		if (current > biggest) {
			biggest = current;
		}
    	return biggest;
	}

	/**
	 * Given a string - return the number of times "am" appears in the String
	 * ignoring case - BUT ONLY WHEN the word "am" appears without being followed or
	 * preceded by other letters <br>
	 * <br>
	 * For Example: <br>
	 * amISearch("Am I in Amsterdam") → 1 <br>
	 * amISearch("I am in Amsterdam am I?") → 2 <br>
	 * amISearch("I have been in Amsterdam") → 0 <br>
	 * <br>
	 * HINT: String.toLowerCase
	 */
	public int amISearch(String sentence) {
		sentence = sentence.toLowerCase();
		int counter = 0;
		while (sentence.contains(" am ")) {
		counter ++;
		sentence = sentence.substring(sentence.indexOf(" am ") + 4);
		}
    	return counter;
	}

	/**
	 * Given a number if this number is divisible by 3 return "fizz" if this number
	 * is divisible by 5 return "buzz" if this number is divisible by both 3 and 5
	 * return "fizzbuzz" if this number is not divisible by 3 or 5 return null<br>
	 * <br>
	 * For Example: <br>
	 * fizzBuzz(3) → "fizz" <br>
	 * fizzBuzz(10) → "buzz" <br>
	 * fizzBuzz(15) → "fizzbuzz" <br>
	 * fizzBuzz(8) → null
	 */
	public String fizzBuzz(int number) {
		if (number % 3 == 0 && number % 5 == 0) {
			return "fizzbuzz";
		} else if (number % 3 == 0) {
			return "fizz"; 
		} else if (number % 5 == 0) {
			return "buzz"; 
		} else {
			return null;
		}
	}

	/**
	 * Given a string, split the string into the individual numbers present then add
	 * each digit of each number to get a final value for each number <br>
	 * <br>
	 * String example = "55 72 86"<br>
	 * <br>
	 * "55" will = the integer 10 <br>
	 * "72" will = the integer 9 <br>
	 * "86" will = the integer 14 <br>
	 * <br>
	 * You then need to return the highest vale <br>
	 * <br>
	 * For Example: <br>
	 * largest("55 72 86") → 14 <br>
	 * largest("15 72 80 164") → 11 <br>
	 * largest("555 72 86 45 10") → 15 <br>
	 * <br>
	 * HINT: Integer.parseInt
	 */

	public int largest(String input) {
		char[] strings = input.toCharArray();
		int count = 0;
		int biggest = 0;
		for (int i = 0; i < strings.length; i++) {
			if (strings[i] == ' ') {
				if (count > biggest) {
						biggest = count; 
					}
				count = 0;
			} else {
				count = count + Character.getNumericValue(strings[i]); 
			}
		}if (count > biggest) {
			biggest = count; 
		}
    	return biggest;
	}

	/**
	 * Given a string, int and a char, return a boolean value if the 'nth'
	 * (represented by the int provided) char of the String supplied is the same as
	 * the char supplied. The int provided will NOT always be less than than the
	 * length of the String. Ignore case and Whitespace. <br>
	 * <br>
	 * For Example: <br>
	 * compares("The",2,'h') → true <br>
	 * compares("AAbb",1,'b') → false <br>
	 * compares("Hi-There",10,'e') → false <br>
	 * <br>
	 * HINT: String.charAt
	 */
	public boolean compares(String word, int index, char letter) {
		//format string
		word.trim(); //removes whitespace
		word.toLowerCase(); //everything becomes lower case
		
		if (index > word.length()) {
			return false; 
		} 
		int i = index - 1;
			if (letter - (word.charAt(i)) == 0) {
				return true; 
			}
		return false;
		
	}
}


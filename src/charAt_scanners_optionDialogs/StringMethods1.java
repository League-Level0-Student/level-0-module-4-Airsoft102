package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class StringMethods1 {
	public static void main(String[] args) {

		// 1. Create a String variable and initialize it to whatever you want
		String ozone = "Foil Kite";
		// 2. Print the 3rd char of your String to the console.
		// HINT: .charAt
		System.out.println(ozone.charAt(2));
		// 3. Print the length of your String to the console.
		// HINT: .length()
		System.out.println(ozone.length());
		// 4. Using a for loop, print one char at time to the console.
		// HINT: use .length() to determine how many loops
		for (int i = 0; i < ozone.length(); i++) {
			if (ozone.charAt(i) == 'K') {
				System.out.println("K is at index" + i);
			}
		}
		// for char 'b', then print "b is at index 1"

	}
}


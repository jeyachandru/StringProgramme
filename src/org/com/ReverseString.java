package org.com;

public class ReverseString {

	public static void main(String[] args) {

		String a = "Jeyachandran";
		String output = "";

		for (int i = a.length() - 1; i >= 0; i--) {

			char c = a.charAt(i);

			output = output + c;

		}

		System.out.println(output);
	}

}

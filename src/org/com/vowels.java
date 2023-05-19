package org.com;

public class vowels {

	public static void main(String[] args) {

		String s = "Welcome";

		int VowelsCount = 0;
		String Vowels = "";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				VowelsCount = VowelsCount + 1;
				Vowels = Vowels + c;
			}

		}

		System.out.println(VowelsCount);
		System.out.println(Vowels);

	}

}

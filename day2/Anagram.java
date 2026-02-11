package week2.day2;

import java.util.Arrays;

public class Anagram {

	public void findAnagram(String firstString, String secondString)

	{ // The strings are converted to lowercase to ignore case mismatch
		firstString = firstString.toLowerCase();
		secondString = secondString.toLowerCase();
		if (firstString.length() != secondString.length()) {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		} else {
			// Strings are stored in aray
			char[] firstArray = firstString.toCharArray();
			char[] secondArray = secondString.toCharArray();
			// Sorting First and Second Array
			Arrays.sort(firstArray);
			Arrays.sort(secondArray);
			// If the sorted array matches then Anagram else not an Anagram
			if (Arrays.equals(firstArray, secondArray)) {
				System.out.println("The given strings are Anagram");
			} else {
				System.out.println("The given strings are not Anagram");
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagram checkstring = new Anagram();
		checkstring.findAnagram("step", "pets");

	}

}

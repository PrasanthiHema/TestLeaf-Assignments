package week2.day1;

public class IsPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inNumber = 15351;
		int outNumber = 0;
		// Logic to reverse the Input string
		for (int i = inNumber; i > 0; i /= 10) {
			int number = i % 10;
			outNumber = (outNumber * 10) + number;
		}
		// If Input and Output number matches then Palindrome
		if (inNumber == outNumber)
			System.out.println("The given number " + inNumber + " is a Palindrome");
		else
			System.out.println("The given number " + inNumber + " is not a Palindrome");

	}

}

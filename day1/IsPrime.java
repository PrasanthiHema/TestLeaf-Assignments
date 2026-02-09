package week2.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int givenNumber = 17;
		boolean isPrimeNumber = true;
		// 1 is not a prime number
		if (givenNumber == 1) {
			isPrimeNumber = false;
		}

		// If the given number is divisible by any number other than 1 and the given
		// number
		// return false

		for (int i = 2; i < givenNumber; i++) {

			if (givenNumber % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}
		// If isPrimeNumber is true the number is Prime else not a Prime
		if (isPrimeNumber)
			System.out.println("The given number " + givenNumber + " is a prime number");
		else
			System.out.println("The given number " + givenNumber + " is a not a prime number");
	}

}

package week2.day1;

public class FibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maxRange = 8;
		int firstNum = 0; // Initialising the first number to 0 
		int secondNum = 1; // Initialising the Second Number to 1
		System.out.println("Finonocci Numbers upto the maximum Range:"+ maxRange);
		System.out.println("---------------------------------------------");
		for (int i = 0; i < maxRange; i++)
		{
			int nextNum = firstNum + secondNum;
			System.out.println(firstNum);
			//During First run first number is printed as 0
			firstNum = secondNum;
			secondNum = nextNum;
           //The Variable nextnum stores the sum of two preceding numbes
		}

	}

}

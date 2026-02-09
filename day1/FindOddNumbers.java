package week2.day1;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Maximum Range is set to 10
		int maxRange = 10;
		System.out.println("Odd Numbers");
		System.out.println("------------");
		for (int i = 0; i < maxRange; i++) {
			// If the number is not divisible by 2 then print
			if (i % 2 != 0)//"==" is given to check condition ,"=" is assignment operator
			    System.out.println(i);
		}
	}

}

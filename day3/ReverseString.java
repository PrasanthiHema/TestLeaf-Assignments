package week2.day3;

public class ReverseString {

	public void reveseText(String companyName) {
		// Conveting string to char array
		char[] nameArray = companyName.toCharArray();
		for (int i = nameArray.length - 1; i >= 0; i--) {
			System.out.print(nameArray[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating object
		ReverseString object = new ReverseString();
		object.reveseText("Test Leaf");
	}

}

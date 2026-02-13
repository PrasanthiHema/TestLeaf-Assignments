package week2.day4;

public class LastWordLength {

	public void findWordLength(String text) {
		String[] textArray = text.split(" ");

		for (int i = 0; i < textArray.length; i++) {
			if (i == (textArray.length - 1))
				System.out.println("The length of lastword is: " + textArray[i].length());
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LastWordLength lastword = new LastWordLength();
		System.out.println("Fist Input");
		String input1 = "Hello World";
		lastword.findWordLength(input1);
		System.out.println("Second Input");
		String input2 = "fly me to the moon";
		lastword.findWordLength(input2);
		System.out.println("Third Input");
		String input3 = "luffy is still joyboy";
		lastword.findWordLength(input3);


	}

}

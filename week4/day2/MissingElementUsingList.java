package week4.day2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MissingElementUsingList {
	/*
	 * Declare Array Arrange the collection in Ascending order
	 *  Inside loop check if the next element is not current element plus one 
	 *  Print the number
	 */

	// Add the Array Elements in List
	public void findmissing(int[] inputArray) {
		List<Integer> inputList = new ArrayList<Integer>();
		for (int i = 0; i < inputArray.length; i++) {
			inputList.add(inputArray[i]);
		}

		// Sort the Collections
		Collections.sort(inputList);
		System.out.println("The missing Numbers are:");
		// Check if the following number is the addition of previous number plus one
		// if not, print the missing value
		for (int i = 0; i < inputList.size() - 1; i++) {
			if ((inputList.get(i + 1)) != inputList.get(i) + 1) {
				System.out.println(inputList.get(i) + 1);
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create object for the class to call the function
		MissingElementUsingList findNumber = new MissingElementUsingList();
		int[] inputArray = { 1, 2, 3, 4, 10, 6, 8 };
		findNumber.findmissing(inputArray);

	}

}

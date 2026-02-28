package week4.day2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortingUsingCollections {

	/*
	 * Declare Sting Array an add values Add the collections to the list Arrange the
	 * collection in Ascending order and use Reverse loop to iterate
	 */

	public void listSort(String[] inputArray) {
		// store the elements in List
		List<String> inputList = new ArrayList<String>();

		for (int i = 0; i < inputArray.length; i++) {
			inputList.add(inputArray[i]);
		}

		// Sort the collection in ascending order
		Collections.sort(inputList);

		// Reversing the order using for loop
		for (int i = inputList.size() - 1; i >= 0; i--) {
			System.out.println(inputList.get(i));
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create object for class
		SortingUsingCollections getInput = new SortingUsingCollections();
		String[] inputArray = { "HCL", "Wipro", "Aspire Systems", "CTS" };
		getInput.listSort(inputArray);

	}

}

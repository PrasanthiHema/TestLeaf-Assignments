package week4.day2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SecondLargestUsingList {
	public void findSecondLargest(int[] inputArray)
	// get the element Array as List
	{
		List<Integer> inputList = new ArrayList<Integer>();
		for (int i = 0; i < inputArray.length; i++) {
			inputList.add(inputArray[i]);
		}
		// Sort the Collections
		Collections.sort(inputList);
		// Using for loop print second largest number
		for (int i = 0; i < inputList.size(); i++) {
			if (i == (inputList.size() - 2)) {
				System.out.println("The Second largest number is: " + inputList.get(i));
			}
		}
	}

	public static void main(String[] args) {
		// Create object for class
		SecondLargestUsingList findNumber = new SecondLargestUsingList();
		int[] inputArray = { 3, 2, 11, 4, 6, 7 };
		findNumber.findSecondLargest(inputArray);

	}

}

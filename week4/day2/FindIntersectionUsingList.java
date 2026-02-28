package week4.day2;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get the Array in List
		List <Integer> firstList = new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));		
		List<Integer> secondList = new ArrayList<Integer>(Arrays.asList(1,2,8,4,9,7));
		
		// Using for loop compare the numbers in both arrays
		for (int i=0; i<firstList.size(); i++)
		{
			int firsNumber = firstList.get(i);
			for( int j=0; j< secondList.size();j++)
			{
				int secondNumber = secondList.get(j);
						if (firsNumber == secondNumber)
						{
							//Print the numbers that are matching
							System.out.println(firsNumber+" is present on both Array");
						}
			}
			
		}
	}

}

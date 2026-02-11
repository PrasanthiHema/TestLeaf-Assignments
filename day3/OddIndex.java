package week2.day3;

public class OddIndex {
	
	public void changeOddIndexcase(String test)
	{
		// storing the string in charArrays 
		char[] testarray = test.toCharArray();
		for (int i=0; i<testarray.length; i++ ) 
		{
			if(i%2!=0) // to check if the index is odd
			{
				testarray[i]= Character.toUpperCase(testarray[i]);
			}
			}
		String newString = new String (testarray);// converting the char to string
		System.out.println("Old Text: "+test);
		System.out.println("New Text: "+newString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating object
		OddIndex changeIndex = new OddIndex();
		changeIndex.changeOddIndexcase("changeme");

	}

}

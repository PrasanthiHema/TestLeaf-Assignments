package week2.day3;


public class FindIntersection {
	
	public void doIntersection(int[] firstArray, int[] secondArray)
	{
          
          for (int i=0 ; i<firstArray.length;i++)
          {
        	  for (int j=0 ; j<secondArray.length;j++)
              {
        		  // compare the elements of array1 with array2
            	  if(firstArray[i]==secondArray[j])
            	  {
            		  //Print the elements in first array if there is a match
            		  System.out.println(firstArray[i] + " is present in both the arrays");
            	  }
              }  
          }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Creating an object to call the method
		FindIntersection intersect = new FindIntersection();
		//passing array values as input
		int[] firstInput={3,2,11,4,6,7}; 
        int[] secondTnput={1,2,8,4,9,7};
        intersect.doIntersection(firstInput, secondTnput);
		
	}
	

}

package week2.day3;
import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] firstArray= {1, 4,3,2,8, 6, 7};
		Arrays.sort(firstArray);
		for(int i=0;i<firstArray.length;i++)
		{
			int j=i+1;
         if (j!=firstArray[i])
         {
        	 System.out.println("The missing number is "+ j);
        	 break;
         }
		}

	}

}

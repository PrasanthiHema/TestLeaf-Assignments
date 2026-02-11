package week2.day2;

public class ReveseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] testArray = test.split(" ");
		for (int i=0;i<testArray.length;i++)
		{
			if(i%2 == 0)
			{
				System.out.print(testArray[i]+" ");
			}
			
			else
			{
				char[] newArray = testArray[i].toCharArray();
				for (int j = newArray.length - 1; j >= 0; j--)
				{
					System.out.print(newArray[j]);				 
				}
				System.out.print(" ");
			}
				
		}
		{
			
		}

	}

}

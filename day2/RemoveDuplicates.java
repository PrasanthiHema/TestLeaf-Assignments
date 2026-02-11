package week2.day2;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text ="We learn Java basics as part of java sessions in java week1";
		String[] textArray = text.split(" ");
		int count = 0;
		
		for (int i=0;i<textArray.length;i++)
		{
			for (int j= i+1; j<textArray.length;j++)
			{
			if (textArray[i].equalsIgnoreCase(textArray[j]))
			{ 
				textArray[j]="";
				count++;
			}
			
		}
		
		
		}
		if (count>0)
		{
			for(int k=0;k<textArray.length;k++)
			{
			System.out.print(textArray[k]+" ");	
			}
		}
		
		
	}

}

package week3.day4;

public class MethodOverLoadingPractise {

	public void reportStep(String msg,String Status )
	{
	System.out.println("reportStep with Two String Parameters");	
	}
	public void reportStep(String msg,String Status,boolean snap )
	{
		System.out.println("reportStep with Two String Parameters and a Boolean parameter");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverLoadingPractise objOver = new MethodOverLoadingPractise();
		objOver.reportStep("Hello", "World");
		objOver.reportStep("Hello", "World", true);
		
	}

}

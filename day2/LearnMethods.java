package week2.day2;

public class LearnMethods {

	public void methodPublic()
	{
	System.out.println("The method is Public");	
	}
	private String methodPrivate(String name,int number)
	{
	System.out.println("The method is Private");
	return name+number;
	}
	protected void methodProtected()
	{
	System.out.println("The method is Protected");	
	}
	void methodDefault()
	{
	System.out.println("The method is Default");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnMethods obj = new LearnMethods();
		obj.methodProtected();
		String methodPrivate = obj.methodPrivate("Prasanthi", 2);
		System.out.println(methodPrivate);
		obj.methodPublic();
		obj.methodDefault();
		
		// object created for another class
		
		Browser object = new Browser();
		String launchBrowser = object.launchBrowser("Chrome");
		System.out.println("Browser Name" + launchBrowser);
		object.loadurl();

	}

}

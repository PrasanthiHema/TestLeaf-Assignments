package week2.day2;

public class Browser {
	
	public String launchBrowser(String browserName)
	{
		System.out.println("Browser Launched Successfully");
		return browserName;
	}
	
	public void loadurl()
	{
		System.out.println("Application url Launched Successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser obj = new Browser();
		String launchBrowser = obj.launchBrowser("Chrome");
		System.out.println("Browser Name" + launchBrowser);
		obj.loadurl();

	}

}

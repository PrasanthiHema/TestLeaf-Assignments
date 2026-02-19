package week3.day4;

public class LoginPage extends BasePage {
	
	public void performCommonTasks()
	{   
		super.performCommonTasks();
		System.out.println("performCommonTasks from Baseclass is overriden");
	}
	
	public void submit()
	{
		System.out.println("This method is to click login page in subclass");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object for subclass
		LoginPage objsub = new LoginPage();
		objsub.clickElement();
		objsub.enterText();
		objsub.findElement();
		objsub.performCommonTasks();
		objsub.submit();

	}

}

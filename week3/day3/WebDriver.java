package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		//get url
		driver.get("http://leaftaps.com/opentaps");
		//maximize web page
		driver.manage().window().maximize();
		//Enter username and password
		driver.findElement(By.id("username")).sendKeys("DemoCSR2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//Print current url
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		//click on CRM/SFA link
		driver.findElement(By.id("button")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hema");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Basuvaraj");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTaps");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium Automation Tester");
		Boolean enable = driver.findElement(By.className("smallSubmit")).isEnabled();
		System.out.println(enable);
		if ( enable  == true)
			{
			driver.findElement(By.className("smallSubmit")).click();
			};
			Thread.sleep(5000);
	        //printing Title name
	        System.out.println(driver.getTitle());
	        // close window
	        driver.close();
		

	}

}

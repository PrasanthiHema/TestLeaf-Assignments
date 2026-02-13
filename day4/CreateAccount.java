package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args)throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		//get url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize web page
		driver.manage().window().maximize();
		//Enter username and password
		driver.findElement(By.id("username")).sendKeys("DemoCSR2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on CRM/SFA link
		driver.findElement(By.id("button")).click();
		//click on Accounts tab
        driver.findElement(By.linkText("Accounts")).click();
        //click on CreateAccountTab
        driver.findElement(By.linkText("Create Account")).click();
        //Enter Account details
        driver.findElement(By.id("accountName")).sendKeys("Prasanthi");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
        driver.findElement(By.id("numberEmployees")).sendKeys("25");
        driver.findElement(By.className("smallSubmit")).click();
        Thread.sleep(5000);
        //printing Title name
        System.out.println(driver.getTitle());
        // close window
        driver.close();

	}

}

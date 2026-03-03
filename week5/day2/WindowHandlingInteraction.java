package week5.day2;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instantiate chrome driver
		ChromeDriver driver = new ChromeDriver();
				
        //Maximize window
		driver.manage().window().maximize();
				
		//get url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Enter username and password
		driver.findElement(By.id("username")).sendKeys("DemoCSR2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on CRM/SFA link
		driver.findElement(By.id("button")).click();
		//click on contacts tab
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//Click on Merge contacts
		driver.findElement(By.xpath("//a [text()='Merge Contacts']")).click();
		//Click on the widget of the From contact
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		//Get the address of the active windows in Set
		Set <String> windowsID = driver.getWindowHandles();
		//Convert to List to access the child window
		List <String> childWindow = new ArrayList <String>(windowsID);
		//Switch the control to new window
		driver.switchTo().window(childWindow.get(1));
		//Maximize new window
		driver.manage().window().maximize();
		//Click on the first contact
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).click();
		//Switch the control back to parent window
		driver.switchTo().window(childWindow.get(0));
		//Click on the widget of the 'To contact'
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		//Get the address of the active windows in Set
		Set <String> toContactsWindow = driver.getWindowHandles();
		//Convert to List to access the child window
		List <String> newContactsWindow = new ArrayList <String>(toContactsWindow);
		//Switch the control to new window
		driver.switchTo().window(newContactsWindow.get(1));
		//Maximize new window
		driver.manage().window().maximize();
		//Click on the Second contact
	    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]")).click();
		//Switch the control back to parent window
		driver.switchTo().window(newContactsWindow.get(0));
		//Click on Merge
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		// Transfer the driver control to Alert
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		String title = driver.getTitle();
		System.out.println("Page Title: "+title);
				

	}
}

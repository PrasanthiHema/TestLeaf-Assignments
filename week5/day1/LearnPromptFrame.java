package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptFrame {
	
	
	/* Initialize ChromeDriver
	 * Load the URL
	 * Maximize the browser window
	 * Switch to the frame
	 * Click the "Try It" button inside the frame
	 * Click OK/Cancel in the alert that appears
	 * Confirm the action is performed correctly by verifying the text displayed */
	 

	public static void main(String[] args) throws InterruptedException {
		// Instantiate Chrome driver
		ChromeDriver driver = new ChromeDriver();
		//Get url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//Maximize Winow
		driver.manage().window().maximize();
		//Set Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Transfer the driver control to frame
		driver.switchTo().frame(0);
		//click on the pop up
		driver.findElement(By.xpath("//button[text()='Try it']")).click();	
		
		// Transfer the driver control to Alert
		Alert promptAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		//Pass value to the prompt alert
		promptAlert.sendKeys("Prasanthi Hema");
		//Accept the alert
		promptAlert.accept();
		String text = driver.findElement(By.id("demo")).getText();
		//Confirm the action based on text displayed
		if (!text.contains("cancel"))
		{
			System.out.println("The alert is accepted");
			System.out.println("The displayed text is: "+text);
		}
		else
		{
			System.out.println("The alert is dismissed");
			System.out.println("The displayed text is: "+text);
		}

	}

}

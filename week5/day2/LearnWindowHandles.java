package week5.day2;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) {
		// Initialise chrome driver
		ChromeDriver driver = new ChromeDriver();
		

		//Maximize window
		driver.manage().window().maximize();
		
		//get url
		driver.get("https://www.irctc.co.in/");
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click 'ok' on sweet alert
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		//click on flights
		driver.findElement(By.xpath("//label[text()='FLIGHTS']")).click();
		
		//Switch driver control to child window
		Set<String> newWindow = driver.getWindowHandles();
		
		//Convert to List
		List<String> activeWindows = new ArrayList<String>(newWindow);
		
		driver.switchTo().window(activeWindows.get(1));
		
		//get the Title of new window
		String title = driver.getTitle();
		System.out.println("The title of new window is : "+title);
		
		//close the child window
		driver.close();
		
		//Switch the control to parent window
		driver.switchTo().window(activeWindows.get(0));
		
		//get the Title of new window
		String titleParent = driver.getTitle();
		System.out.println("The title of Parent window is : "+titleParent);


}}

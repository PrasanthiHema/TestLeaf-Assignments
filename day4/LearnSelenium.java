package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating object
		ChromeDriver driver = new ChromeDriver();

		// maximize window
		driver.manage().window().maximize();

		// get url
		driver.get("https://www.facebook.com");
		
		//forgot password link
		//driver.findElement(By.className("_6ltj")).click();		
        driver.findElement(By.id("email")).sendKeys("Prasanthi123");
		driver.findElement(By.id("pass")).sendKeys("password@123");
		driver.findElement(By.name("login")).click();

		// close window
		// driver.close();

	}

}

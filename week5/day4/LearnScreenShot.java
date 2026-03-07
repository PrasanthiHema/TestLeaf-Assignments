package week5.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class LearnScreenShot {

	public static void main(String[] args) throws IOException{
		// Instantiate Chrome driver
		ChromeDriver driver = new ChromeDriver();
		// Maximize Window
		driver.manage().window().maximize();
		// Get Url
		driver.get("https://www.amazon.in/");
		//Timeout
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Scroll to WebElement
		WebElement element = driver.findElement(By.xpath("(//a[text()='Conditions of Use & Sale']"));
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform(); 
       //Take screenshot
		File display = element.getScreenshotAs(OutputType.FILE);
		//File target
		File target = new File("./Results/output.png");
		FileUtils.copyFile(display, target);
		

	}

}

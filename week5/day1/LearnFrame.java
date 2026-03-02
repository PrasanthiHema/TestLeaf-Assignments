package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();	
		
		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		confirmAlert.accept();
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		

	}

}

package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//get url
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
		driver.findElement(By.id("nav-search-submit-button")).click()	;	
		List <WebElement> value = driver.findElements(By.xpath("//span[@class ='a-price-whole']"));
		for (int i=0; i< value.size(); i++)
		{
			System.out.println("Price Details: ");
			System.out.println(value.get(i).getText());
		}
	}

}

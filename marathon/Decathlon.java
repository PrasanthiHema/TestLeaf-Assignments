package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Decathlon {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		
		//Instantiating Chrome Driver
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize window
		driver.manage().window().maximize();
		
		//get url
		driver.get("https://www.decathlon.in/");
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click on search box
		driver.findElement(By.xpath("//span[contains(text(),'Search for')]")).click();
		//Enter shoes
		driver.findElement(By.xpath("//input[@placeholder='Search For 60+ Sports and 6000+ Products']")).sendKeys("Shoes",Keys.ENTER);
		//In sport filter click on "Running"
		driver.findElement(By.xpath("//span[contains(text(),'Running')]")).click();
		//Click on Men in gender filter
		driver.findElement(By.xpath("//span[contains(text(),'Men')]")).click();
		//click on sort by option
		driver.findElement(By.xpath("//span[contains(text(),'Most Relevant')]")).click();
		//click on Highest Discount
		driver.findElement(By.xpath("//a[contains(text(),'Highest Discount')]")).click();
		//add the first element to the cart
		driver.findElement(By.xpath("//p[contains(text(),'ADD TO CART')]")).click();
		//select size
		driver.findElement(By.xpath("//div[contains(text(),'8.5')]")).click();
		// Add to cart
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='ADD TO CART']")).click();
		//Display item in cart
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='flex justify-right items-center'][2]")).isDisplayed();
		String iteminCart = driver.findElement(By.xpath("//a[@aria-label='cart']/div/div/div")).getText();
		int numbeofItems=Integer.parseInt(iteminCart);
		if (numbeofItems>0) {
			System.out.println("Number of Items in cart:" +numbeofItems);
			
		}
		else {
			System.out.println("No Items added in the cart");
		}
	}


	

}

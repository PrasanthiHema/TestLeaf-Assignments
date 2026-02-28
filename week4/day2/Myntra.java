package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		// Instantiate Chrome driver
		ChromeDriver driver = new ChromeDriver();
		// Maximize the window
		driver.manage().window().maximize();
		// get url
		driver.get("https://www.myntra.com");
		// Specify Implicit Time out
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Search for bags and press Enter
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("bags",
				Keys.ENTER);
		// click on Men- Filter
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		// under Category click on Laptop bag
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Laptop Bag']")).click();
		Thread.sleep(3000);
		String bagCount = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		System.out.println("Total count of bags: " + bagCount);
		// Get the list of brands in Web element
		List<WebElement> brandList = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		System.out.println("The List of Brands: ");
		// using for loop print the brand names
		Thread.sleep(10000);
		for (int i = 0; i < brandList.size(); i++) 
		{
			System.out.println(brandList.get(i).getText());
		}
		// Get the list of bag name in Web element
		List<WebElement> bagName = driver.findElements(By.xpath("//h4[@class='product-product']"));
		System.out.println("The List of Bag Name: ");
		Thread.sleep(10000);
		// using for loop print the brand names
		for (int i = 0; i < bagName.size(); i++) 
		{
			System.out.println(bagName.get(i).getText());
		}

	}

}

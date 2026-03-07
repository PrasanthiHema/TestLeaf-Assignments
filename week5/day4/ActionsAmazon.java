package week5.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAmazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		//Instantiate Chrome Driver
		ChromeDriver driver = new ChromeDriver();
		//Maximize Window
		driver.manage().window().maximize();
		//get url
		driver.get("https://www.amazon.in/");
		//Add Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//Search for -oneplus 9 pro
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		//Get the price of first displayed product
		String firstProductPrice = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("The Price of First prouct is : "+"₹"+firstProductPrice);
		//get the review count
		String firstPoductReview = driver.findElement(By.xpath("//span[@class='a-size-mini puis-normal-weight-text s-underline-text']")).getText();
		System.out.println("No of Reviews of the first product: "+firstPoductReview);
		//click on the first text link using mouse Action
		WebElement firstProductLink = driver.findElement(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']/span"));
		//Instantiate Actions
		Actions act = new Actions(driver);
		//Using moveTo method move the mouse to first link text and click
		Thread.sleep(2000);
		act.moveToElement(firstProductLink).perform();
		firstProductLink.click();
		//Switch driver control to child window
		Set<String> newWindow = driver.getWindowHandles();
		//Convert to List
		List<String> activeWindows = new ArrayList<String>(newWindow);
		//Switch the driver focus to new window
		driver.switchTo().window(activeWindows.get(1));
		WebElement product = driver.findElement(By.id("productTitle"));
		//Take Screenshot
		File displayedProuct = product.getScreenshotAs(OutputType.FILE);
		//Path for file storage
		File path = new File("./Results/amazon.png");
		//Store screenshots in File
		FileUtils.copyFile(displayedProuct, path);	
		Thread.sleep(5000);
		WebElement addtoCart = driver.findElement(By.xpath("//input[@value='Add to cart']"));
		act.scrollToElement(addtoCart).perform();
		//click on 'Add to cart button'
		addtoCart.click();
		//get Cart subtotal
		String subTotal = driver.findElement(By.xpath(
				          "//span[contains(text(),'subtotal')]//following::span[@class='a-price-whole']")).getText();
		String productPrice = firstProductPrice.replaceAll("[^a-zA-Z0-9]", "");
		String result = subTotal.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("result: "+result);
		driver.close();
		if (result.equals(productPrice))
		{
			System.out.println("The Selected element is added to the cart");
		}
		else
		{
			System.out.println("Product Mismatch");
		
		}
		//close the child window
		
				
		//Switch the control to parent window
		driver.switchTo().window(activeWindows.get(0));
		

	}

}

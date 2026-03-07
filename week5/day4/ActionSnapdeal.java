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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionSnapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Instantiate Chrome Driver
		ChromeDriver driver = new ChromeDriver();
		//Maximize Window
		driver.manage().window().maximize();
		//get url
		driver.get("https://www.snapdeal.com/");
		//Add Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//Move to Men's Fashion
		WebElement fashion = driver.findElement(By.xpath("//div[@class='sc-98d0cbe0-3 dXWLks']"));
		Actions act = new Actions(driver);
		act.moveToElement(fashion).perform();
		//Click on spot shoes
		driver.findElement(By.xpath("//div[text()='Sports Shoes']")).click();
		String count = driver.findElement(By.xpath("//div[text()='Sports Shoes for Men']/following::div")).getText();
		System.out.println("Sports Shoes count: "+ count);	
		//Click on Training Shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		//Sort by Price
		driver.findElement(By.xpath("//span[@class ='sort-label']")).click();
		driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
		// Select any price range ex:(500-700).
		WebElement fromValue = driver.findElement(By.name("fromVal"));
		fromValue.clear();
		fromValue.sendKeys("500");
		WebElement toVal = driver.findElement(By.name("toVal"));
		toVal.clear();
		toVal.sendKeys("1000");
		driver.findElement(By.xpath("//div[contains(@class,'price-go-arrow')]")).click();
		Thread.sleep(5000);
		//Select Colour
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement choiceColour = driver.findElement(By.xpath("//div[@data-filtername='Color_s']//label[a[normalize-space()='White & Blue']]"));
		//driver.findElement(By.xpath("//div[@data-filtername='Color_s']//label/a[text()=' White & Blue']")).click();
		WebElement colourwait = explicitWait
				.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(choiceColour)));
		act.scrollToElement(colourwait).perform();
		colourwait.click();
		Thread.sleep(5000);
		String price = driver.findElement(By.xpath("//a[@data-key='Price|Price']")).getText();
		String finalPrice = price.replaceAll(" ", "");
		String Colour = driver.findElement(By.xpath("//a[@data-key='Color_s|Color']")).getText();
		if ((finalPrice.equals("Rs.500-Rs.1000"))&& (Colour.equals("White & Blue")))
		{
			
			System.out.println("Price is in given Range");
			System.out.println("Colour is as specified");
		}
		else
		{
			System.out.println(finalPrice);
			System.out.println(Colour);
			System.out.println("Filter Validation Failed");
		}
		// Mouse hover on the first resulting "Training Shoes".
		WebElement shoe = driver.findElement(By.xpath("//div[contains(@class,'product-tuple-listing')]//div[contains(@class,'product-tuple-image')]"));
		act.moveToElement(shoe).perform();

		// Click the "Quick View" button.
		driver.findElement(By.xpath("//div[contains(@class,'quick-view-bar')]")).click();

		// Print the cost and the discount percentage.
		String cost = driver.findElement(By.xpath(
						"//div[contains(@class,'quickProductDescPanel')]//div[contains(@class,'product-desc-price')]/span")).getText();

		String discount = driver
				.findElement(By.xpath(
						"//div[contains(@class,'quickProductDescPanel')]//div[contains(@class,'product-price')]/span")).getText();
		System.out.println(cost.trim());
		System.out.println(discount.trim());
		// Take a snapshot of the shoes.
		File shoes = driver.getScreenshotAs(OutputType.FILE);
		//output file path
		File path = new File("./screenshots/snapdeal.png");
		FileUtils.copyFile(shoes, path);
		//close the pop up
		driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();
		//close window
		driver.close();		
		
		
	}}
		

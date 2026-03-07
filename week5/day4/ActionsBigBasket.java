package week5.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsBigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Instantiate Chrome Driver
		ChromeDriver driver = new ChromeDriver();
		//Maximize Window
		driver.manage().window().maximize();
		//get url
		driver.get("https://www.bigbasket.com/");
		//Add Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//click on shop by category
        driver.findElement(By.xpath("//div[@class='sc-hzhJZQ ffyYcs']")).click();
        //Move to 'Foodgrains' category
        WebElement category = driver.findElement(By.xpath("(//a[@class='sc-gEvEer gqkOAr' and text()='Foodgrains, Oil & Masala'])[2]"));
        Actions act = new Actions(driver);
        act.moveToElement(category).perform();
        Thread.sleep(2000);
        //Move to Rice and Rice products
        WebElement products = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
        act.moveToElement(products).perform();
        //click on Boiled and Steamed Rice
        driver.findElement(By.xpath("//a[ text()='Boiled & Steam Rice']")).click();
        //Filter 'bb Royal'
        WebElement filter = driver.findElement(By.id("i-bbRoyal"));
        act.scrollToElement(filter).perform();
        filter.click();
        Thread.sleep(5000);
        //click on TamilPonni Boiled Rice
        driver.findElement(By.xpath("//img[@title='bb Royal Tamil Ponni Boiled Rice 1 kg (12-17 Months Old)']")).click();
        //switch the control to new window
        Set <String> newWindow = driver.getWindowHandles();
        //Convert set to List
       List <String> activeWindow = new ArrayList <String>(newWindow);
       //Switch the control to new winow
       driver.switchTo().window(activeWindow.get(1));
       //Click on 5Kg Bag
       driver.findElement(By.xpath("//span[text()='5 kg']")).click();
       //Store the price in local variable
       Thread.sleep(5000);
       String price = driver.findElement(By.xpath("//td[@class='Description___StyledTd-sc-82a36a-0 hueIJn']")).getText();
       System.out.println("The price of the product is : "+price);
       //Add to Basket
       Thread.sleep(5000);
       driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
       //get the success message in string
       String notify = driver.findElement(By.xpath("//p[@class='mx-4 flex-1']")).getText();
       System.out.println(notify);
       Thread.sleep(5000);
       //Take screenshot
       File cart = driver.getScreenshotAs(OutputType.FILE);
       //specify path
       File path = new File ("./Results/bigbasket.png");
       //Store the output file in specified path
       FileUtils.copyFile(cart, path);
       //close the current window
       driver.close();
       //Switch the control to main window
       driver.switchTo().window(activeWindow.get(0));
       //Close the main window
       driver.close();    
        
        
        
	}

}

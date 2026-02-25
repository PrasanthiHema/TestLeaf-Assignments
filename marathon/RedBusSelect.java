package marathon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Instantiate Chrome Driver
		ChromeDriver driver = new ChromeDriver();

		// Maximize window
		driver.manage().window().maximize();

		// get url
		driver.get("https://www.redbus.in/");
		// Enter Boarding Point
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("srcinput")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[@aria-label='CMBT, Chennai, Chennai']")).click();
		// Enter Destination Point
		driver.findElement(By.id("destinput")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[@aria-label='Madiwala, Bangalore']")).click();
		// Enter Tomorrow Date
		driver.findElement(By.xpath("//button[@aria-label='Search for Tomorrow']")).click();
		// Bus Count before filter
		String busCount = driver
				.findElement(By.xpath("//div[@class='busesFoundText__ind-search-styles-module-scss-PHVGD']")).getText();
		System.out.println("***Bus Count***");
		System.out.println("Bus count before filter:" + busCount);
		// Bus count after Ac Filter
		driver.findElement(By.xpath("//div[contains(@class,'mainContainer')]//div[contains(text(),'AC')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String acbusCount = driver
				.findElement(By.xpath("//div[@class='busesFoundText__ind-search-styles-module-scss-PHVGD']")).getText();
		System.out.println("Bus count afterAc filter:" + acbusCount);
		// Bus count after High Rate filter
		driver.findElement(
				By.xpath("//div[contains(@class,'mainContainer')]//div[contains(text(),'High Rated Buses')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String highrate = driver
				.findElement(By.xpath("//div[@class='busesFoundText__ind-search-styles-module-scss-PHVGD']")).getText();
		System.out.println("Bus count of high rate buses:" + highrate);
		// Get the list of prices
		List<WebElement> price = driver.findElements(By.xpath("//p[contains(@class,'finalFare')]"));
		System.out.println("Price Details: ");
		List<Integer> lowest = new ArrayList<Integer>();
		for (int i = 0; i < price.size(); i++) {
			String finalPrice = price.get(i).getText();
			System.out.println(finalPrice);
			int fare = Integer.parseInt(finalPrice.replaceAll("[^0-9.]", ""));
			lowest.add(fare);
		}
		// Calculate the lowest Price
		Collections.sort(lowest);
		System.out.println("The lowest price is : " + lowest.get(0));
		Thread.sleep(3000);

		System.out.println("Page Title:" + driver.getTitle());
		driver.close();

	}

}

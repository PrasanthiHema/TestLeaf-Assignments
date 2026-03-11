package week6.day3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class PreRequesites {
	WebDriver driver;
	String filename;

	@Parameters({ "url", "username", "password" })
	@BeforeMethod
	public void precondition(String url, String username, String password) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--user-data-dir=C:\\SeleniumProfile");
		options.addArguments("--disable-notifications");
		// Instantiate chrome Driver
		driver = new ChromeDriver(options);
		// Maximize window
		driver.manage().window().maximize();
		// Get url
		driver.get(url);
		// Timeout of 20 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Enter Username
		driver.findElement(By.id("username")).sendKeys(username);
		// Enter Password
		driver.findElement(By.id("password")).sendKeys(password);
		// Click Login
		driver.findElement(By.id("Login")).click();

	}
	@DataProvider(name = "getValue")
	public String[][] fetchData() throws IOException {
       return ReadValuesFromExcel.getValue(filename);
	}
	@AfterMethod
	public void postcondition() {
		driver.close();
	}
}
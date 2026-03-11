package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectMethod {
	
	WebDriver driver ;
	@Parameters({"browserName","url","username","password"})
	@BeforeMethod
	// Step3: pass the argumets to match the key/name in the @Paramaters
	public void preCondition(String browserName, String url, String uName, String pWord) throws InterruptedException {
		
		switch (browserName) {
		case "Chrome":
			System.out.println("The current execusion is in Chrome");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--guest");
			driver = new ChromeDriver(options);
			break;
		case "FireFox":
			System.out.println("The current execusion is in FireFox");
			driver = new FirefoxDriver();
			break;
		case "Edge":
			System.out.println("The current execusion is in Edge");
			System.setProperty("webdriver.edge.driver", "./Driver/MicrosoftEdgeSetup.exe");
			driver = new EdgeDriver();
			
			break;
		case "Safari":
			System.out.println("The current execusion is in Safari");
			break;
		default:
			System.out.println("The current execusion is in IE");
			break;
		}
		//get url
		driver.get(url);
		//maximize web page
		driver.manage().window().maximize();
		//Enter username and password
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pWord);
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}

}

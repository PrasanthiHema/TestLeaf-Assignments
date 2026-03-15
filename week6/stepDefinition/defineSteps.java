package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class defineSteps {
	WebDriver driver;
	
	@Given(": launch the browser")
	public void launch_the_browser()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		driver = new ChromeDriver(options);
		//maximize web page
		driver.manage().window().maximize();
	}
	
	@Given(": launch the url")
	public void launch_the_url()
	{
		//get url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@When(": enter the username")
	public void enter_the_username()
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR2");
	}
	@When(": enter the password")
	public void enter_the_password()
	{
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	}
	@When(": click on the login button")
	public void click_on_the_login_button()
	{
		driver.findElement(By.xpath("//input[@class ='decorativeSubmit']")).click();
	}
	@Then(": navigate to the next page")
	public void navigate_to_the_next_page()
	{
		System.out.println(driver.getTitle());
	}
	

}

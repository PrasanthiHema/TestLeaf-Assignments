package SalesforceSteps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefintion {
	WebDriver driver;

	
	@Given("load url")
	public void load_url() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--user-data-dir=C:\\SeleniumProfile");
		options.addArguments("--disable-notifications");
		// Instantiate chrome Driver
		driver = new ChromeDriver(options);
		// Maximize window
		driver.manage().window().maximize();
		// Get url
		driver.get("https://login.salesforce.com");
		// Timeout of 20 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("login to website")
	public void login_to_website() {
		// Enter Username
		driver.findElement(By.id("username")).sendKeys("siva.prasanthi.36072efb7ea7@agentforce.com");
		// Enter Password
		driver.findElement(By.id("password")).sendKeys("Yazhini@2026");
		// Click Login
		driver.findElement(By.id("Login")).click();
	}

	@When("click on menu")
	public void click_on_menu() {
		//Click on App Launcher
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		//Click View All button
		driver.findElement(By.xpath("//button[text()='View All']")).click();

	}

	@When("click on sales")
	public void click_on_sales() {
		WebElement sales = driver.findElement(By.xpath("//p[@class='slds-truncate' and text()='Sales']"));
		Actions act = new Actions(driver);
		//Scroll to Sales tab
		act.scrollToElement(sales).perform();
		sales.click();
	}

	@When("click on accounts")
	public void click_on_accounts() throws InterruptedException {
		WebElement element =   driver.findElement(By.xpath("//span[text()='Accounts']"));
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);


	}

	@When("click on new")
	public void click_on_new() {
      //Click on New
		driver.findElement(By.xpath("//div[@title='New']")).click();
	}

	@When("enter name")
	public void enter_name() throws InterruptedException {
		Thread.sleep(5000);
	  //click on name an send values
		driver.findElement(By.xpath("//div[@part='input-container']/input[@name='Name']")).sendKeys("Hema");
	}

	@When("select ownership")
	public void select_ownership() {
	//click on Ownership
    WebElement owner = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
    JavascriptExecutor js= (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", owner);
    Actions act = new Actions(driver);
    WebElement choice = driver.findElement(By.xpath("//span[@title='Public']"));
    act.scrollToElement(choice).perform();
    choice.click();
	}

	@When("click on save")
	public void click_on_save() {
	   //Click on save
		
	    WebElement save = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
	    JavascriptExecutor js= (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", save);
	}

	@Then("Account name is created")
	public void account_name_is_created() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 String display = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'toastMessage')]//a")))
					.getText();
			//Verify the Alert message (Complete this field) displayed for Name
			if (display.contains("Prasanthi Hema"))
			{
				System.out.println("Alert message is verified ");
			System.out.println(display);
			}
			else
			{
				System.out.println("Verification failed fo Alert message");
				System.out.println("display");
			}
	}

}

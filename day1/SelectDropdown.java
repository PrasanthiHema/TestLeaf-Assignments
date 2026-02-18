package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		//Login as guest
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--guest");
		//Instantiate browser
		ChromeDriver driver = new ChromeDriver();
		//Maximize Window
		driver.manage().window().maximize();
		//getul
		driver.get(" http://leaftaps.com/opentaps/");
		//Enter username and password
		driver.findElement(By.id("username")).sendKeys("DemoCSR2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on CRM/SFA link
		driver.findElement(By.id("button")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prasanthi Hema");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Basuvarajalingam");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTaps");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium Automation Tester");
		//Select Employee in Sourec and Instantiate Select
		WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select optn = new Select(element);
		optn.selectByIndex(4);
		
		//Select Automobile in Marketing Campaign
		WebElement campaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select text = new Select(campaign);
		text.selectByContainsVisibleText("Automobile");
		
		//Select Corporation in Ownership Campaign
	    WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	    Select value = new Select(owner);
		value.selectByValue("OWN_CCORP");		
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
        //printing Title name
        System.out.println(driver.getTitle());
        // close window
        driver.close();
		
		
		
	}

}

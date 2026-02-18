package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountbyXpath {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		//get url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize web page
		driver.manage().window().maximize();
		//Enter username and password using relative xpath
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR2");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//click login
		driver.findElement(By.xpath("//input[@class ='decorativeSubmit']")).click();
		//click on CRM/SFA link
		driver.findElement(By.id("button")).click();
		//click on Accounts tab
	    driver.findElement(By.linkText("Accounts")).click();
		//click on CreateAccountTab
		driver.findElement(By.linkText("Create Account")).click();
		//Enter details
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Hema");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Tester");
		//dropdown
		WebElement industry = driver.findElement(By.name("industryEnumId")); 
		Select value = new Select(industry);
		value.selectByVisibleText("Computer Software");
		
		WebElement owner = driver.findElement(By.name("ownershipEnumId"));
		Select value2 = new Select (owner);
		value2.selectByVisibleText("S-Corporation");
		
		WebElement datasource = driver.findElement(By.id("dataSourceId"));
		Select value3 = new Select (datasource);
		value3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement campaignid = driver.findElement(By.name("marketingCampaignId"));
		Select value4 = new Select(campaignid);
		value4.selectByIndex(6);
		
		WebElement province = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select  value5 = new Select(province);
		value5.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
        //printing Title name
        System.out.println(driver.getTitle());
        // close window
		
		driver.close();
		

	}

}

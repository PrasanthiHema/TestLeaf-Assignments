package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AdvancedXPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions optn = new ChromeOptions();
		// optn.addArguments("--guest");
		optn.addArguments("--guest");
		ChromeDriver driver = new ChromeDriver(optn);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		// Enter the username as ‘demosalesmanager’
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		// Enter the password as 'crmsfa'
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on the Login button.
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on the CRM/SFA link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		// Click on the Leads tab.
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		// Click on the Create Lead link from shortcuts.
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

		// enter details
		// first name
		driver.findElement(
				By.xpath("//input[@id='createLeadForm_lastName']/preceding::input[@id='createLeadForm_firstName']"))
				.sendKeys("Hema");
		// lastname
		driver.findElement(
				By.xpath("//input[@id='createLeadForm_firstName']/following::input[@id='createLeadForm_lastName']"))
				.sendKeys("Mathan");
		// Company name
		driver.findElement(
				By.xpath("//span[@class='requiredField']/following::input[@id='createLeadForm_companyName']"))
				.sendKeys("TestLeaf");
		// Title
		driver.findElement(
				By.xpath("//span[@class='tableheadtext']/following::input[@id='createLeadForm_generalProfTitle']"))
				.sendKeys("Tester");

		// Create lead
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
		// printing Title name
		System.out.println(driver.getTitle());
		// close window
		driver.close();

	}

}

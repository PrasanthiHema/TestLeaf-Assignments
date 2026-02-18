package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLeadAssignment {

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

		// Company name
		driver.findElement(
				By.xpath("//span[@class='requiredField']/following::input[@id='createLeadForm_companyName']"))
				.sendKeys("TestLeaf");
		// first name
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input[@id='createLeadForm_firstName']"))
				.sendKeys("Hema Prasanthi");
		// last name
		driver.findElement(
				By.xpath("//input[@id='createLeadForm_firstName']/following::input[@id='createLeadForm_lastName']"))
				.sendKeys("Mathan Kumar");
		// First Name Local
		driver.findElement(
				By.xpath("//span[@class='tableheadtext']/following::input[@id='createLeadForm_firstNameLocal']"))
				.sendKeys("Hema");
		// department
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("QA Testing");
		// Description
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Selenium Automation");
		// email
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("prasanthihema@gmail.com");
		// State/province
		WebElement province = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select provincevalue = new Select(province);
		provincevalue.selectByVisibleText("New York");
		// Click on Create Lead
		driver.findElement(By.name("submitButton")).click();
		// Edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		// Clear Description
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		// Important Note
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Description Cleared");
		// Update
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(5000);
		// printing Title name
		System.out.println("Title : " + driver.getTitle());
		// close window
		driver.close();

	}

}

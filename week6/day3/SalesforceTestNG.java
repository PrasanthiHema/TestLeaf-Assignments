package week6.day3;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SalesforceTestNG extends PreRequesites
{
	@BeforeClass
	public void setData()
	{
		filename = "salesforce";
		}
	@Test(dataProvider = "getValue")
	public void salesforceMethod(String name, String cname, String description) throws InterruptedException {
		//Click on App Launcher
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		//Click View All button
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		//Scroll to Legal Entities and Click
		WebElement scrollTo = driver.findElement(By.xpath("//p[contains(text(),'Legal Entities')]"));
		Actions act = new Actions(driver);
		act.scrollToElement(scrollTo).perform();
		scrollTo.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by"+name);
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(cname);
		driver.findElement(By.xpath("//label[text()='Description']/following-sibling::div//textarea")).sendKeys(description);
        //Scroll to 'Status'Select Status as 'Active'
		WebElement status = driver.findElement(By.xpath("//button[@aria-label='Status']"));
		((ChromiumDriver) driver).executeScript("arguments[0].click();", status);
        driver.findElement(By.xpath("//span[@title='Active']")).click();
        //Click on Save
        driver.findElement(By.xpath("//button[text()='Save']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        String display = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'toastMessage')]//a")))
				.getText();
		//Verify the Alert message (Complete this field) displayed for Name
		if (display.contains(name))
			System.out.println("Alert message is verified ");
		else
			System.out.println("Verification failed fo Alert message");
        
		

	}

}

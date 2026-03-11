package week6.day2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {
	
        @Test
		public void CreateLead() throws InterruptedException
		{
			//click on CRM/SFA link
			driver.findElement(By.id("button")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prasanthi1");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lingam");
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTaps");
			driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium Automation Tester");
			driver.findElement(By.className("smallSubmit")).click();
			Thread.sleep(5000);
	        //printing Title name
	        System.out.println(driver.getTitle());

			

}
	}

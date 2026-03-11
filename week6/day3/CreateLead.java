package week6.day3;


import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {

@BeforeClass
public void setData()
{
	filename = "Book1";
	}

	@Test(dataProvider = "getValue")
	public void createLeadmethod(String cName, String fName, String lName) {
		driver.findElement(By.id("button")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();

	}
}

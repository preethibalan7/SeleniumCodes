package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		System.out.println("The url is" +url);
		String title=driver.getTitle();
		System.out.println(title);
//Create Lead
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SoftwareSolutions");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("pooja");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gandhi");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("miss");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("science");
driver.findElement(By.id("createLeadForm_description")).sendKeys("This is for a new record");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select dropdown = new Select(state);
dropdown.selectByVisibleText("New York");
driver.findElement(By.name("submitButton")).click();
String title1=driver.getTitle();
System.out.println(title1);
//Edit Lead
driver.findElement(By.linkText("Edit")).click();
driver.findElement(By.id("updateLeadForm_description")).clear();
driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Just to notify");
driver.findElement(By.name("submitButton")).click();
String title2=driver.getTitle();
System.out.println(title2);
//Duplicate Lead
driver.findElement(By.linkText("Duplicate Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).clear();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ExpressSolutions");
driver.findElement(By.id("createLeadForm_firstName")).clear();
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kiruba");
driver.findElement(By.name("submitButton")).click();
String title3=driver.getTitle();
System.out.println(title3);


	}

}

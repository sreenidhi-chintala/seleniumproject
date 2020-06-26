package caseStudy4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CartPay {
	WebDriver driver;
	 @BeforeTest
	  public void beforeTest() {
		 System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	  }

  @Test
  public void paycart() {
	  driver.findElement(By.partialLinkText("Checkout")).click();
	  driver.findElement(By.xpath("//input[@values='Proceed to Pay']")).click();
	  driver.findElement(By.xpath("//label[contains(text(),'Andhra Bank')]")).click();
	  driver.findElement(By.id("btn")).click();
	  driver.findElement(By.name("username")).sendKeys("");
	  driver.findElement(By.name("password")).sendKeys("");
	  driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	  driver.findElement(By.name("transpwd")).sendKeys("");
	  driver.findElement(By.xpath("//input[@value='PayNow']")).click();
	  String title = driver.getTitle();
	  Assert.assertEquals("Order Details", title);
	  
	  
	  
  }
 
}

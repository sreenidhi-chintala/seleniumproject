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


public class NewTest {
	WebDriver driver;
	@BeforeTest
	public void BeforeTest() {
	System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
  @Test(priority=2)
  
  public void testLogin() {
	  driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	  driver.findElement(By.id("userName")).sendKeys("");
	  driver.findElement(By.id("password")).sendKeys("");
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
	  WebDriverWait wait = new WebDriverWait(driver,10);
	  WebElement signout = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignOut")));
	  Assert.assertNotNull(signout);
	  
	  
  }
}

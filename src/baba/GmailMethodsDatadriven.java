package baba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GmailMethodsDatadriven
{
	WebDriver driver;
	
	@Test(priority=0)
	public void f() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
	}
	@Test(priority=1)
	@Parameters({"uid"})
	public void g(String x) throws InterruptedException
	{
		driver.findElement(By.name("identifier")).sendKeys(x);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
	}
	@Test(priority=2)
	public void h() throws InterruptedException
	{
		if(driver.findElement(By.name("password")).isDisplayed())
		{
			System.out.println("Userid is correct");
		}
		else
		{
			System.out.println("Userid is wrong");
		}
		Thread.sleep(5000);
	}
	@Test(priority=3)
	public void i()
	{
		driver.close();
	}
}

package baba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EmailMethods 
{
	WebDriver driver;
	
	@Test
	public void method1() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods={"method1"})
	public void method2() throws InterruptedException
	{
		driver.findElement(By.name("identifier")).sendKeys("j.prasannanjaneyulu131");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods={"method2"})
	public void method3() throws InterruptedException
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
	@Test(dependsOnMethods={"method3"})
	public void method4()
	{
		driver.close();
	}
}

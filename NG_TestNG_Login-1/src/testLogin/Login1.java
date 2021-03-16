package testLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login1 {

	@Test
	public void t_01_validate_login_zero_app() throws InterruptedException {
		

		
		//ChromeDriver Setup
		
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

		//URL
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://testyourlog.in/example/");

		//Login Failed Scenario

				WebElement UserName2 = driver.findElement(By.name("email"));
				UserName2.sendKeys("unvalid@user.com");
				WebElement Password2 = driver.findElement(By.name("password"));
				Password2.sendKeys("12345");
				WebElement Login2 = driver.findElement(By.tagName("button"));
				Login2.submit();
				Thread.sleep(1000);
				UserName2.clear();
				Password2.clear();
				Thread.sleep(2000);
				System.out.println("Login Failed");


		//Login Successful Scenario

				
				WebElement UserName1 = driver.findElement(By.name("email"));
				UserName1.sendKeys("valid@user.com");
				WebElement Password1 = driver.findElement(By.name("password"));
				Password1.sendKeys("hunter2");
				WebElement Login1 = driver.findElement(By.tagName("button"));
				Thread.sleep(2000);
				Login1.submit();
				Thread.sleep(3000);
				System.out.println("Login Successful");
				WebElement Logout1 = driver.findElement(By.linkText("Log out"));
				Logout1.click();
				Thread.sleep(2000);
				
				
				
				System.out.println("Logout Successful");
				
			
			//Test
			// Check point
				
				
				String expectedTitle = "Login Page";
			    String actualTitle = driver.getTitle();
			    Assert.assertEquals(actualTitle, expectedTitle);
				
			//Quit
				
				driver.quit();
			    System.out.println("TestPassed");
			    System.out.println("Done");

			

		


	}

}

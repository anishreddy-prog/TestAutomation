package com.sgtesting.assertion;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class Assign1 {
	
		public static Logger log=Logger.getLogger("actitime testing");
		public static WebDriver oBrowser=null;
		
		
		@Test(priority=1)
		public void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
				log.info("launch browser");
				oBrowser.manage().window().maximize();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
		@Test(priority=2)
		public void navigate()
		{
			try
			{
				oBrowser.get("http://localhost:81/login.do");
				Thread.sleep(2000);
				log.info("navigate to URL");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		@Test(priority=3)
		public void login()
		{
			
			try
			{
				WebElement lenovo=oBrowser.findElement(By.id("username"));
				Assert.assertTrue(lenovo.isDisplayed());
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				
				log.info("user name inputed as admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(6000);
				log.info("login as admin");
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		

		static void minimizeFlyOutWindow()
		{
			try
			{
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		
		@Test(priority=4)
		public void createUser()
		{
			try
			{
				
				WebElement logo = oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[1]/div/div[2]/img"));
				Assert.assertEquals(true,logo.isDisplayed());
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("firstName")).sendKeys("demo");
				oBrowser.findElement(By.name("lastName")).sendKeys("User1");
				oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
				oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
				oBrowser.findElement(By.name("password")).sendKeys("Welcome1");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
				oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
				Thread.sleep(5000);
				log.info("created user 1");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		
		@Test(priority=5)
		public void deleteUser()
		{
			try
			{
				
				
				oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				Thread.sleep(1000);
				Assert.assertNotNull(oAlert);
				Thread.sleep(1000);
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(2000);
				log.info("deleted user 1");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		@Test(priority=6)
		public void logout()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
				log.info("logout ");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		@Test(priority=7)
		public void closeApplication()
		{
			try
			{
				oBrowser.close();
				log.info("close application");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

	



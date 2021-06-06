package com.sgtesting.assertion;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.asserts.SoftAssert;

public class Assign2 {

		public static SoftAssert softassert=new SoftAssert();
		public static WebDriver oBrowser=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			login();
			//minimizeFlyOutWindow();
			createUser();
			modifyuser();
			deleteUser();
			logout();
			closeApplication();		
		}

		static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
				oBrowser.manage().window().maximize();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

		static void navigate()
		{
			try
			{
				oBrowser.get("http://localhost:81/login.do");
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void login()
		{
			try
			{
				WebElement lenovo=oBrowser.findElement(By.id("username"));
				softassert.assertTrue(lenovo.isDisplayed());
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(2000);
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
		static void createUser()
		{
			try
			{
				WebElement logo = oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[1]/div/div[2]/img"));
				Thread.sleep(2000);
				softassert.assertEquals(true,logo.isDisplayed());
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				
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
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void modifyuser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.name("lastName")).sendKeys("2");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void deleteUser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				Thread.sleep(2000);
				softassert.assertNotNull(oAlert);
				Thread.sleep(2000);
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void logout()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void closeApplication()
		{
			try
			{
				oBrowser.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}


package com.sgtesting.PageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advance1MainSource {
	public static WebDriver oBrowser=null;				//oBrowser creation
	public static AdvanceAssign1 oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createUser1();
		createUser2();
		createUser3();
		logout();
		loginuser1();
		logout();
		loginuser2();
		logout();
		loginuser3();
		logout();
		login();
		deleteUser1();
		deleteUser2();
		deleteUser3();
		logout();
		closeApplication();

	}
	
	static void launchBrowser()							//oBrowser value
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			oPage=new AdvanceAssign1(oBrowser);
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
			oPage.getUserName().sendKeys("admin");
			oPage.getpwd().sendKeys("manager");
			oPage.getLoginButton().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	static void createUser1()
	{
		try
		{
			oPage.getusers().click();
			Thread.sleep(2000);
			oPage.getaddusers().click();
			Thread.sleep(2000);
			oPage.getfirstName().sendKeys("demo");
			oPage.getlastName().sendKeys("User1");
			oPage.getemail().sendKeys("demo@gmail.com");
			oPage.getuserDataLightBox_usernameField().sendKeys("User1");
			oPage.getpassword().sendKeys("Welcome1");
			oPage.getpasswordCopy().sendKeys("Welcome1");
			oPage.getcreateuser().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginuser1()
	{
		try
		{
			oPage.getUserName().sendKeys("user1");
			oPage.getpwd().sendKeys("Welcome1");
			oPage.getLoginButton().click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser1()
	{
		try
		{
			oPage.getuserstodelete().click();
			Thread.sleep(3000);
			oPage.getdeleteuser1().click();
			Thread.sleep(3000);
			oPage.getdeletebutton().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	
	static void createUser2()
	{
		try
		{
			oPage.getusers().click();
			Thread.sleep(2000);
			oPage.getaddusers().click();
			Thread.sleep(2000);
			oPage.getfirstName().sendKeys("demo");
			oPage.getlastName().sendKeys("User2");
			oPage.getemail().sendKeys("demo@gmail.com");
			oPage.getuserDataLightBox_usernameField().sendKeys("User2");
			oPage.getpassword().sendKeys("Welcome2");
			oPage.getpasswordCopy().sendKeys("Welcome2");
			oPage.getcreateuser().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	static void loginuser2()
	{
		try
		{
			oPage.getUserName().sendKeys("user2");
			oPage.getpwd().sendKeys("Welcome2");
			oPage.getLoginButton().click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser2()
	{
		try
		{
			oPage.getdeleteuser2().click();
			Thread.sleep(3000);
			oPage.getdeletebutton().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void createUser3()
	{
		try
		{
			oPage.getusers().click();
			Thread.sleep(2000);
			oPage.getaddusers().click();
			Thread.sleep(2000);
			oPage.getfirstName().sendKeys("demo");
			oPage.getlastName().sendKeys("User3");
			oPage.getemail().sendKeys("demo@gmail.com");
			oPage.getuserDataLightBox_usernameField().sendKeys("User3");
			oPage.getpassword().sendKeys("Welcome3");
			oPage.getpasswordCopy().sendKeys("Welcome3");
			oPage.getcreateuser().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginuser3()
	{
		try
		{
			oPage.getUserName().sendKeys("user3");
			oPage.getpwd().sendKeys("Welcome3");
			oPage.getLoginButton().click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser3()
	{
		try
		{
			oPage.getdeleteuser3().click();
			Thread.sleep(3000);
			oPage.getdeletebutton().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
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
			oPage.getLogoutLink().click();
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



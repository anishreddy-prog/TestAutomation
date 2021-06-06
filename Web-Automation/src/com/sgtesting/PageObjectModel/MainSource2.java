package com.sgtesting.PageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainSource2 {
	public static WebDriver oBrowser=null;				//oBrowser creation
	public static ChromeAssign2 oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createUser();
		modifyUser();
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
			oPage=new ChromeAssign2(oBrowser);
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
	
	static void createUser()
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
	
	static void modifyUser()
	{
		try
		{
			
			oPage.getmodifyuser().click();
			Thread.sleep(3000);
			oPage.getuserDataLightBox_lastNameField().sendKeys("2");
			Thread.sleep(2000);
			oPage.getsavechanges().click();
			Thread.sleep(2000);
			

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	static void deleteUser()
	{
		try
		{
			
			oPage.getdeleteUser().click();
			Thread.sleep(3000);
			oPage.getuserDataLightBox_deleteBtn().click();
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


package com.sgtesting.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainSource7 {
	public static WebDriver oBrowser=null;				//oBrowser creation
	public static ChromeAssign7 oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createcustomer();
		createproject();
		createtask();
		deletetask();
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
			oPage=new ChromeAssign7(oBrowser);
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
	
	static void createcustomer()
	{
		try
		{
			oPage.gettasks().click();
			Thread.sleep(2000);
			oPage.getaddnew().click();
			Thread.sleep(2000);
			oPage.getnewcustomer().click();
			Thread.sleep(2000);
			oPage.getcustomerLightBox_nameField().sendKeys("CUSTOMER 1");
			Thread.sleep(2000);
			oPage.getcreatecustomer().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createproject()
	{
		try
		{
			oPage.getcreateproject().click();
			Thread.sleep(2000);
			oPage.getnewproject().click();
			Thread.sleep(2000);
			oPage.getprojectname().sendKeys("project 1");
			Thread.sleep(2000);
			oPage.getapproveproject().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createtask()
	{
		try
		{
			oPage.getaddnewtask().click();
			Thread.sleep(2000);
			oPage.getcreatenewtask().click();
			Thread.sleep(2000);
			oPage.gettaskname().sendKeys("task 1");
			Thread.sleep(2000);
			oPage.gettaskdone().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	static void deletetask()
	{
		try
		{
			oPage.getselecttask().click();
			Thread.sleep(2000);
			oPage.gettaskaction().click();
			Thread.sleep(2000);
			oPage.gettaskdelete().click();
			Thread.sleep(2000);
			oPage.gettaskPanel_deleteConfirm_submitTitle().click();
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




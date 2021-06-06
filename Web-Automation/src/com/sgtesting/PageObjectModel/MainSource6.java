package com.sgtesting.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainSource6 {
	public static WebDriver oBrowser=null;				//oBrowser creation
	public static ChromeAssign6 oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createcustomer();
		createproject();
		modifyproject();
		deleteproject();
		deletecustomer();
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
			oPage=new ChromeAssign6(oBrowser);
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
	
	
	static void modifyproject()
	{
		try
		{
			oPage.getintoproject().click();
			Thread.sleep(2000);
			oPage.getprojectdiscript().sendKeys("we welcome you..!!");
			Thread.sleep(2000);
			oPage.getclosemodifyproject().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	static void deleteproject()
	{
		try
		{
			oPage.geteditproject().click();
			Thread.sleep(2000);
			oPage.getprojectaction().click();
			Thread.sleep(2000);
			oPage.getdeleteproject().click();
			Thread.sleep(2000);
			oPage.getconformdeleteproject().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deletecustomer()
	{
		try
		{
			oPage.geteditcustomer().click();
			Thread.sleep(2000);
			oPage.getaction().click();
			Thread.sleep(2000);
			oPage.getdeletecustomer().click();
			Thread.sleep(2000);
			oPage.getcustomerPanel_deleteConfirm_submitTitle().click();
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




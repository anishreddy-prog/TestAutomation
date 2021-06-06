package com.sgtesting.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainSource4 {
	public static WebDriver oBrowser=null;				//oBrowser creation
	public static ChromeAssign4 oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createcustomer();
		modifycustomer();
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
			oPage=new ChromeAssign4(oBrowser);
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
	
	static void modifycustomer()
	{
		try
		{
			oPage.getmodifycustomer().click();
			Thread.sleep(2000);
			oPage.getaddmodificustomer().sendKeys("we welcome you..!!");
			Thread.sleep(2000);
			oPage.getclosemodificustomer().click();
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


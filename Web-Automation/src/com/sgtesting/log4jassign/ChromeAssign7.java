package com.sgtesting.log4jassign;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeAssign7 {
	public static Logger log=Logger.getLogger("actitime testing");
	public static WebDriver oBrowser=null;
	
	
	@Test (priority=1)
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
	@Test (priority=2)
	public void navigate()
{
	try
	{
		oBrowser.get("http://localhost:81/login.do");
		Thread.sleep(2000);
		log.info("navigating to URL");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
	
	@Test (priority=3)
	public void login()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(2000);
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

@Test (priority=4)
public void createcustomer()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a/div[1]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("/html/body/div[12]/div[1]")).click();
		Thread.sleep(4000);
		oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("primecustomer");
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
		Thread.sleep(1000);
		log.info("created customer");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

@Test (priority=5)
public void createproject()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("/html/body/div[12]/div[2]")).click();
		Thread.sleep(4000);
		oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("demo projet");
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']/div/span")).click();
		Thread.sleep(1000);
		log.info("created project");
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

@Test (priority=6)
public void createtask()
{
	try
	{
		oBrowser.findElement(By.xpath( "//*[@id='taskListBlock']/div[1]/div[1]/div[3]/div/div[3]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath( "/html/body/div[11]/div[1]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")).sendKeys("task1");
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath( "//*[@id='createTasksPopup_commitBtn']/div")).click();
		Thread.sleep(1000);
		log.info("created task");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
}

@Test (priority=7)
public void deletetask()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[3]/div[1]/div[2]/div[3]/div/div")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[3]/div[4]/div/div[3]/div")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id=\'taskPanel_deleteConfirm_submitTitle\']")).click();
		Thread.sleep(1000);
		log.info("deleted task");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

@Test (priority=8)
public void logout()
{
	try
	{
		oBrowser.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		log.info("logout");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

@Test (priority=9)
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




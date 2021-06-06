package com.sgtesting.ChromeDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeAssign6 {
	public static WebDriver oBrowser=null;
	public static void main(String arg []) {
	launchBrowser();
	navigate();
	login();
	//minimizeFlyOutWindow();
	createcustomer();
	createproject();
	modifyproject();
	deleteproject();
	deletecumstomer();
	logout();
	closeApplication();
	

}static void launchBrowser()
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
static void createcustomer()
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
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void createproject()
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
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void modifyproject()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).sendKeys("my new project");
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[1]")).click();
		Thread.sleep(1000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void deleteproject()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
		Thread.sleep(1000);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void deletecumstomer()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
		Thread.sleep(1000);
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

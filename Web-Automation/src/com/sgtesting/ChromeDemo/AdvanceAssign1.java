package com.sgtesting.ChromeDemo;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceAssign1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		//minimizeFlyOutWindow();
		create3Users();
		logout();
		loginUser1();
		logoutUser1();
		loginUser2();
		logoutUser2();
		loginUser3();
		logoutUser3();
		loginAdmin();
		delete3Users();
		logoutAdmin();
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
static void create3Users()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.name("firstName")).sendKeys("demo");
		oBrowser.findElement(By.name("lastName")).sendKeys("User1");
		oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
		oBrowser.findElement(By.name("username")).sendKeys("User1");
		oBrowser.findElement(By.name("password")).sendKeys("Welcome1");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
		oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
		Thread.sleep(3000);
		
		oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.name("firstName")).sendKeys("demo");
		oBrowser.findElement(By.name("lastName")).sendKeys("User2");
		oBrowser.findElement(By.name("email")).sendKeys("user2@gmail.com");
		oBrowser.findElement(By.name("username")).sendKeys("User2");
		oBrowser.findElement(By.name("password")).sendKeys("Welcome2");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome2");
		oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
		Thread.sleep(3000);
		
		oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.name("firstName")).sendKeys("demo");
		oBrowser.findElement(By.name("lastName")).sendKeys("User3");
		oBrowser.findElement(By.name("email")).sendKeys("user3@gmail.com");
		oBrowser.findElement(By.name("username")).sendKeys("User3");
		oBrowser.findElement(By.name("password")).sendKeys("Welcome3");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome3");
		oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
		Thread.sleep(3000);
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
static void loginUser1()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("User1");
		oBrowser.findElement(By.name("pwd")).sendKeys("Welcome1");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void logoutUser1()
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
static void loginUser2()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("User2");
		oBrowser.findElement(By.name("pwd")).sendKeys("Welcome2");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void logoutUser2()
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
static void loginUser3()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("User3");
		oBrowser.findElement(By.name("pwd")).sendKeys("Welcome3");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void logoutUser3()
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
static void loginAdmin()
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
static void delete3Users()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(2000);
		Alert oAlert1=oBrowser.switchTo().alert();
		String content1=oAlert1.getText();
		System.out.println(content1);
		oAlert1.accept();
		Thread.sleep(2000);
		
		oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(2000);
		Alert oAlert2=oBrowser.switchTo().alert();
		String content2=oAlert2.getText();
		System.out.println(content2);
		oAlert2.accept();
		Thread.sleep(2000);
		
		oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
		Thread.sleep(3000);
		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(2000);
		Alert oAlert3=oBrowser.switchTo().alert();
		String content3=oAlert3.getText();
		System.out.println(content3);
		oAlert3.accept();
		Thread.sleep(2000);
		
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

static void logoutAdmin()
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

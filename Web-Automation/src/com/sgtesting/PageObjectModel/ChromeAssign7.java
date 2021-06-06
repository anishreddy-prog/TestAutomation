package com.sgtesting.PageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChromeAssign7 {

	public ChromeAssign7(WebDriver oBrowser)		//parameterized constructor//interface class//object reference
	{
		PageFactory.initElements(oBrowser, this);			//class//static method//
	}
	
	//Create WebElement for UserName text field
	private WebElement username;					//class//object reference
	
	public WebElement getUserName()
	{
		return username;
	}
	
	//Create WebElement for Password Text Field
	private WebElement pwd;
	
	public WebElement getpwd()
	{
		return pwd;
	}
	
	//Create WebElement for Login button
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement oBtnLogin;
	
	public WebElement getLoginButton()
	{
		return oBtnLogin;
	}
	
	//createcustomer
	
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")
	private WebElement tasks;
	
	public WebElement gettasks()
	{
		return tasks;
	}

	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement addnew;
	
	public WebElement getaddnew()
	{
		return addnew;
	}

	@FindBy(xpath="/html/body/div[12]/div[1]")
	private WebElement newcustomer;
	
	public WebElement getnewcustomer()
	{
		return newcustomer;
	}
	
	private WebElement customerLightBox_nameField;
	
	public WebElement getcustomerLightBox_nameField()
	{
		return customerLightBox_nameField;
	}
	
	@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
	private WebElement createcustomer;
	
	public WebElement getcreatecustomer()
	{
		return createcustomer;
	}
	
	//createproject
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement createproject;
	
	public WebElement getcreateproject()
	{
		return createproject;
	}
	
	
	@FindBy(xpath="/html/body/div[12]/div[2]")
	private WebElement newproject;
	
	public WebElement getnewproject()
	{
		return newproject;
	}
	
	@FindBy(xpath="//*[@id=\'projectPopup_projectNameField\']")
	private WebElement projectname;
	
	public WebElement getprojectname()
	{
		return projectname;
	}
	
	
	@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']/div/span")
	private WebElement approveproject;
	
	public WebElement getapproveproject()
	{
		return approveproject;
	}
	
	//createtask
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")
	private WebElement addnewtask;
	
	public WebElement getaddnewtask()
	{
		return addnewtask;
	}

	
	@FindBy(xpath="/html/body/div[11]/div[1]")
	private WebElement createnewtask;
	
	public WebElement getcreatenewtask()
	{
		return createnewtask;
	}
	
	
	@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
	private WebElement taskname;
	
	public WebElement gettaskname()
	{
		return taskname;
	}
	
	
	@FindBy(xpath="//*[@id=\'createTasksPopup_commitBtn\']/div/span")
	private WebElement taskdone;
	
	public WebElement gettaskdone()
	{
		return taskdone;
	}

	
//deletetask
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")
	private WebElement selecttask;
	
	public WebElement getselecttask()
	{
		return selecttask;
	}

	@FindBy(xpath="//*[@id='taskListBlock']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement taskaction;
	
	public WebElement gettaskaction()
	{
		return taskaction;
	}
	
	@FindBy(xpath="//*[@id='taskListBlock']/div[3]/div[4]/div/div[3]/div\r\n")
	private WebElement taskdelete;
	
	public WebElement gettaskdelete()
	{
		return taskdelete;
	}
	
	
	private WebElement taskPanel_deleteConfirm_submitTitle;
	
	public WebElement gettaskPanel_deleteConfirm_submitTitle()
	{
		return taskPanel_deleteConfirm_submitTitle;
	}
	
	
	//Create WebElement for Logout Link
		@FindBy(linkText="Logout")
		private WebElement Logout;
		
		public WebElement getLogoutLink()
		{
			return Logout;
		}
}





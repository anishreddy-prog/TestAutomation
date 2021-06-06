package com.sgtesting.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChromeAssign3 {

	public ChromeAssign3(WebDriver oBrowser)		//parameterized constructor//interface class//object reference
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
	
	//deletecustomer
	

	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement editcustomer;
	
	public WebElement geteditcustomer()
	{
		return editcustomer;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement action;
	
	public WebElement getaction()
	{
		return action;
	}
	
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
	private WebElement deletecustomer;
	
	public WebElement getdeletecustomer()
	{
		return deletecustomer;
	}
	
	
	private WebElement customerPanel_deleteConfirm_submitTitle;
	
	public WebElement getcustomerPanel_deleteConfirm_submitTitle()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	
	
	//Create WebElement for Logout Link
	@FindBy(linkText="Logout")
	private WebElement Logout;
	
	public WebElement getLogoutLink()
	{
		return Logout;
	}

	
}	






package com.sgtesting.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdvanceAssign1 {

	public AdvanceAssign1(WebDriver oBrowser)		//parameterized constructor//interface class//object reference
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

	//create WebElement for users
			@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")
			private WebElement users;
		
			public WebElement getusers()
			{
				return users;
			}

	//addusers
			@FindBy(xpath="//*[@id=\'createUserDiv\']/div/div[2]")
			private WebElement addusers;
		
			public WebElement getaddusers()
			{
				return addusers;
			}


	//firstname
			private  WebElement firstName;
		
			public WebElement getfirstName() 
			{
		
				return firstName;
			}

	//lastname
			private WebElement lastName ;
		
			public WebElement getlastName()
			{
				return lastName;
			}

	//email
			private WebElement email;
		
			public WebElement getemail()
			{
				return email;
			}

	//username1
			private WebElement userDataLightBox_usernameField;
		
			public WebElement getuserDataLightBox_usernameField()
			{
				return userDataLightBox_usernameField;
			}
	//password
			private WebElement password;
		
			public WebElement getpassword()
			{
				return password;
			}

	//password
			private WebElement passwordCopy;
		
			public WebElement getpasswordCopy()
			{
				return passwordCopy;
			}

	//Create user1 button
			@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
			private WebElement createuser;
		
			public WebElement getcreateuser()
			{
				return createuser;
			}

	//deleteuser1

			@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")
			private WebElement userstodelete;
		
			public WebElement getuserstodelete()
			{
				return userstodelete;
			}
		
			@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")
			private WebElement deleteuser1;
		
			public WebElement getdeleteuser1()
			{
				return deleteuser1;
			}//*[@id="userDataLightBox_deleteBtn"]
		
		
		
			@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
			private WebElement deletebutton;
		
			public WebElement getdeletebutton()
			{
				return deletebutton;
			}

	//deleteuser2


			@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
			private WebElement deleteuser2;
		
			public WebElement getdeleteuser2()
			{
				return deleteuser2;
			}//*[@id="userDataLightBox_deleteBtn"]
		
		
	//deleteuser3


			@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")
			private WebElement deleteuser3;
		
			public WebElement getdeleteuser3()
			{
				return deleteuser3;
			}//*[@id="userDataLightBox_deleteBtn"]
		
		

		
		
			
	
	
	//Create WebElement for Logout Link
			@FindBy(linkText="Logout")
			private WebElement Logout;
		
			public WebElement getLogoutLink()
			{
				return Logout;
			}





}

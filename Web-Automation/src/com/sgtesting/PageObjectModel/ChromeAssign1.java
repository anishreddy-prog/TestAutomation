package com.sgtesting.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChromeAssign1 {

	public ChromeAssign1(WebDriver oBrowser)		//parameterized constructor//interface class//object reference
	{
		PageFactory.initElements(oBrowser, this);			//class//static method//
	}
	//admin login
		private WebElement username;					//class//object reference
		
		public WebElement getusername()
		{
			return username;
		}
	//password
		private WebElement pwd;					//class//object reference
		
		public WebElement getpwd()
		{
			return pwd;
		}
	//loginbutton	
		@FindBy(xpath="//*[@id='loginButton']/div")
		private WebElement loginbutton;
		
		public WebElement getloginbutton()
		{
			return loginbutton;
		}
		
		
		//create WebElement for users
		@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")
		private WebElement users;
		
		public WebElement getusers()
		{
			return users;
		}

		//create user
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
			
		//deleteuser
				@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
				private WebElement deleteUser;
				
				public WebElement getdeleteUser()
				{
					return deleteUser;
				}
				
		
				private WebElement userDataLightBox_deleteBtn;
				
				public WebElement getuserDataLightBox_deleteBtn()
				{
					return userDataLightBox_deleteBtn;
				}

				
		
	//logout
		@FindBy(linkText="Logout")
		private WebElement Logout;
		
		public WebElement getlogoutLink()
		{
			return Logout;
		}
		
		
		
		
		
		
		
		
		
}
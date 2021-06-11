package com.sgtesting.actitime.driverscript;

import com.sgtesting.actitime.tests.Customers;
import com.sgtesting.actitime.tests.Initialization;
import com.sgtesting.actitime.tests.LoginLogout;
import com.sgtesting.actitime.tests.Projects;
import com.sgtesting.actitime.tests.Tasks;
import com.sgtesting.actitime.tests.Users;

public class DriverScripts {

	public static void main(String[] args) {

	//Create User Scenario
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		Users.createUser();
		Users.deleteUser();
		LoginLogout.logout();
		Initialization.closeApplication();

	//Modify User Scenario
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		Users.createUser();
		Users.modifyuser();
		Users.deleteUser();
		LoginLogout.logout();
		Initialization.closeApplication();

	//create customer Scenario
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		Customers.createcustomer();
		Customers.deletecumstomer();
		LoginLogout.logout();
		Initialization.closeApplication();

	//create customer Scenario
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		Customers.createcustomer();
		Customers.modifycustomer();
		Customers.deletecumstomer();
		LoginLogout.logout();
		Initialization.closeApplication();


	//create project Scenario
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		Customers.createcustomer();
		Projects.createproject();
		Projects.deleteproject();
		Customers.deletecumstomer();
		LoginLogout.logout();
		Initialization.closeApplication();


	//modify project Scenario
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		Customers.createcustomer();
		Projects.createproject();
		Projects.modifyproject();
		Projects.deleteproject();
		Customers.deletecumstomer();
		LoginLogout.logout();
		Initialization.closeApplication();



	//modify project Scenario
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		Customers.createcustomer();
		Projects.createproject();
		Tasks.createtask();
		Tasks.deletetask();
		Projects.deleteproject();
		Customers.deletecumstomer();
		LoginLogout.logout();
		Initialization.closeApplication();


	}

}

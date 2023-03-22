package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.LoginPage;

//This is file where we will write testcase ->Execute test one by one =Testsuite->Maven 
public class LoginTest extends BaseClass {
	
	
	@Test(priority = 1)
	public void LoginwithValidCredentials() {
		LoginPage login=new LoginPage(driver);
		login.Login();
		login.EmailButton();
		login.EmailId(prop.getProperty("Email"));
		login.Password(prop.getProperty("Password"));
		login.LoginButton();		
	}
	

	@Test(priority = 2)
	public void LoginwithInValidCredentials() {
		LoginPage login=new LoginPage(driver);
		login.Login();
		login.EmailButton();
		login.EmailId(prop.getProperty("Email"));
		login.Password(prop.getProperty("InvalidPass"));
		login.LoginButton();		
	}
		

}

package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage3;



public class LoginTest3 extends BaseClass{
	 @Test
	    public void testValidLoginAndLogout() throws InterruptedException {
		 LoginPage3  loginPage = new LoginPage3 (driver, Integer.parseInt(configReader.getProperty("timeout")));
	        loginPage.enterFirstName(configReader.getProperty("FirstName"));
	        loginPage.enterEmaill(configReader.getProperty("Emaill"));
	        loginPage.entergender(configReader.getProperty("gender"));
	        loginPage.entermobileNumber(configReader.getProperty("rmobileNumber"));
	        loginPage.enterdateofBirth(configReader.getProperty("dateofBirth"));
	        loginPage.entersubjects(configReader.getProperty("subjects"));
	        loginPage.enterhobbiess(configReader.getProperty("hobbiess"));
	        loginPage.enterpictures(configReader.getProperty("pictures"));
	        loginPage.enteraddresss(configReader.getProperty("addresss"));
	        loginPage.enterstates(configReader.getProperty("states"));
	        loginPage.entercityy(configReader.getProperty("cityy"));
	        
	        Thread.sleep(5000);
	        loginPage. loginBtn();	 
	        
}
}
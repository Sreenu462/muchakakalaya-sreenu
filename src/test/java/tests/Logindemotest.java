package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginDemo;

public class Logindemotest  extends BaseClass  {

	    @Test
	    public void testValidLogin() throws InterruptedException {
	    	LoginDemo loginPage = new LoginDemo(driver, Integer.parseInt(configReader.getProperty("timeout")));
	        loginPage.enterEmail(configReader.getProperty("email"));
	        loginPage.enterPassword(configReader.getProperty("password"));
	        Thread.sleep(5000);
	        loginPage. loginBtn();
}
}
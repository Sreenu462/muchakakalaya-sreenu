package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.WaitHelper;

public class LoginDemo {
	
		WebDriver driver;
	    WaitHelper wait;
	    private By emailField  = By.xpath("//*[@id=\"formBasicEmail\"]");
	    private By passField =   By.xpath("//*[@id=\"formBasicPassword\"]");
	    private By loginBtn =  By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div/div/div/form/button\"]");

	    public LoginDemo (WebDriver driver, int timeout) {
	        this.driver = driver;
	        this.wait = new WaitHelper(driver, timeout);
	    }
	    public void enterEmail(String email) {
	        wait.waitForVisibility(emailField).sendKeys(email);
	    }

	    public void enterPassword(String password) {
	        wait.waitForVisibility(passField).sendKeys(password);

	    }
	    public void loginBtn () {
	        wait.waitForVisibility(loginBtn).click();    

}
}

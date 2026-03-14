package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.WaitHelper;

public class LoginPage3 {
	WebDriver driver;
    WaitHelper wait;
    private By firstName =  By.xpath("//*[@id=\"name\"]");
    private By emaill =  By.xpath("//*[@id=\"email\"]");
    private By genderr = By.xpath("//*[@id=\"practiceForm\"]/div[3]/label");
    private By  mobileNumber = By.xpath("//*[@id=\"mobile\"]");
    private By  dateofBirth = By.xpath("//*[@id=\"dob\"]");
    private By  subjects =  By.xpath("//*[@id=\"subjects\"]");
    private By  hobbiess = By.xpath("//*[@id=\"practiceForm\"]/div[7]/label");
    private By pictures = By.xpath("//*[@id=\"picture\"]");
    private By addresss =  By.xpath("//*[@id=\"picture\"]");
    private By states=   By.xpath("//*[@id=\"state\"]");
    private By cityy =   By.xpath("//*[@id=\"city\"]");
    private By loginBtn  = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div/div/div/form/button\"]");

    public LoginPage3(WebDriver driver, int timeout) {
        this.driver = driver;
        this.wait = new WaitHelper(driver, timeout);
    }

    public void enterFirstName(String fname) {
		wait.waitForVisibility(firstName).sendKeys(fname);
       
    }

    public void enterEmaill(String email) {
        wait.waitForVisibility(emaill).sendKeys(email);
      
    } 
    public void entergender(String gender ) {
        wait.waitForVisibility(genderr).sendKeys(gender);
}
    public void entermobileNumber(String mnumber ) {
        wait.waitForVisibility(mobileNumber).sendKeys (mnumber);  
}
    public void enterdateofBirth(String dBirth ) {
        wait.waitForVisibility(dateofBirth).sendKeys (dBirth);  
}
    public void entersubjects(String  subjectss ) {
        wait.waitForVisibility( subjects).sendKeys ( subjectss);  
}
    public void enterhobbiess(String  hobbiessa ) {
        wait.waitForVisibility(hobbiess).sendKeys ( hobbiessa);  
}
    public void enterpictures(String  pictures1) {
        wait.waitForVisibility(pictures).sendKeys ( pictures1);  
}
    public void enteraddresss(String  addresss1) {
        wait.waitForVisibility(addresss).sendKeys ( addresss1);  
}
    public void enterstates(String  states1) {
        wait.waitForVisibility(states).sendKeys ( states1);  
}
    public void entercityy(String  cityy1) {
        wait.waitForVisibility(cityy).sendKeys ( cityy1);  
}
    public void loginBtn () {
        wait.waitForVisibility(loginBtn).click();
}   
}     

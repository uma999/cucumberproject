package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
public WebDriver Idriver;
	
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtpsw;
	
	@FindBy(xpath="//*[@type='submit']")
	@CacheLookup
	WebElement Loginbtn;
	
	@FindBy(xpath="//a[@href='/logout']")
	@CacheLookup
	WebElement Logoutbtn;
	public loginPage(WebDriver rdriver) {
		 Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	public void setemail(String email) {
		txtEmail.clear();
		txtEmail.sendKeys(email);
		
	}
	public void setpsw(String psw) {
	txtpsw.clear();
	txtpsw.sendKeys(psw);
	}
public void clicklogin() {
	Loginbtn.click();
}
public void clicklogout() {
	Logoutbtn.click();
}
}

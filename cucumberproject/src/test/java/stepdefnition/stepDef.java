package stepdefnition;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.loginPage;

public class stepDef {
	
	public WebDriver driver;
	 loginPage lp;
	 

	@Given("^user opens chrome browser$")
	public void user_opens_chrome_browser() {
		
		lp = new loginPage(driver);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\uma93\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}

	@Then("^user enters the url \"([^\"]*)\"$")
	public void user_enters_the_url(String url) {
		driver.get(url);
	}

	@Then("^user enters email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_email_and_password(String email, String password) {
		lp=new loginPage(driver);
	
	lp.setemail(email);
	lp.setpsw(password);
	
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() {
		lp.clicklogin();
	}

	@Then("^user login to the dashboard pagetitle should be \"([^\"]*)\"$")
	public void user_login_to_the_dashboard_pagetitle_should_be(String title) {
	if(driver.getPageSource().contains("Login was unsuccessful.")) {
		driver.close();
	}else {
		Assert.assertEquals(title, driver.getTitle());
	}
	
	}


	@Then("^user click logout$")
	public void user_click_logout() {
		lp.clicklogout();
	}

	@Then("^pagetitle should be \"([^\"]*)\"$")
	public void pagetitle_should_be(String title) {
		if(driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
		}else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}

	@Then("^close browser$")
	public void close_browser() {
		driver.close();
	}


}

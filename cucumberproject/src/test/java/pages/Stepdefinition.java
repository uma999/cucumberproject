package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.loginPage;

public class Stepdefinition {

	public WebDriver driver;
	//public loginPage lp;

	@Given("^user opens chrome browser$")
	public void user_opens_chrome_browser() {
		
		//lp = new loginPage(driver);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\uma93\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}

	@Then("^user enters the url \"([^\"]*)\"$")
	public void user_enters_the_url(String url) {
		driver.get(url);
	}

	@Then("^user enters email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_email_and_password(String email, String password) {
	
	driver.findElement(By.id("Email")).clear();
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).clear();
	driver.findElement(By.id("Password")).sendKeys(password);
	
	
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
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
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
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



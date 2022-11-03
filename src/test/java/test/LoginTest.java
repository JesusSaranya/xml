package test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page.DashboardPage;
import page.Loginpage;
import util.BrowserFactory;


  public class LoginTest {

	WebDriver driver;
	

	@Test
	@Parameters({"username" , "password" ,"dashboardHeaderText"})
	public void ValidusershouldbeabletoLogin(String UserName, String Password , String dashboardValidText)
	{
	driver = BrowserFactory.init();     //// init method will return the webdriver
	
	Loginpage loginpage = PageFactory.initElements(driver, Loginpage.class);   /// with the help of pagefactory we are passing driver,classname
	loginpage.insertUserName(UserName);
	loginpage.insertPassWord(Password);
	loginpage.ClickSignInButton();
	
	DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
	dashboardpage.validateDAshboardPage(dashboardValidText);
	
	BrowserFactory.tearDown();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.Loginpage;
import util.BrowserFactory;


public class AddCustomerTest {

	
	 WebDriver driver;
		
	  
		String userName;
		String passWord;
		String dashboardValidText;
		
		String fullname;
		String company;
		String email;
		String phoneNum;
		String address;
		String city;
		String Country;
		String state;
		String zip;
		

		
		@Test
		@Parameters({"username","password","dashboardvalidText","fullName","companyName","email","phone","address","city","country","state","zip"})
		public void validUserShouldBeabletoAddCustomer(String userName,String passWord,String dashboardValidText,String fullname,String company,String email, String phoneNum,String address,String city,String Country,String state,String zip) throws InterruptedException
		{
			driver = BrowserFactory.init();
			
			Loginpage loginpage = PageFactory.initElements(driver,Loginpage.class);
		    loginpage.insertUserName(userName);
		    loginpage.insertPassWord(passWord);
		    loginpage.ClickSignInButton();
		    
		    DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		    dashboard.validateDAshboardPage(dashboardValidText);
		    dashboard.clickCustomerMenuButton();
		    dashboard.clickAddCustomerMenuButton();
		    dashboard.clickListCustomerMenuButton();
		    
		    
		    AddCustomerPage addcus = PageFactory.initElements(driver, AddCustomerPage.class);
		    Thread.sleep(4000);
		    addcus.insertFullName(fullname);
		    addcus.selectCompanyDropDown(company);
		    addcus.insertEmail(email);
		    addcus.insertPhone(phoneNum);
		    addcus.insertaddress(address);
		    addcus.insertcity(city);
		    addcus.insertCountry(Country);
		    addcus.insertState(state);
		    addcus.insertEmail(zip);
		    addcus.ClicksaveButton(); 
		    
		  // addcus.verifyInsertednmae();
		   addcus.verifyInsertedCustomeraNameAnddelete();
		    
		   // Browsefactory.tearDown();
		   
		   addcus.clickdeleteConfirmationButton();
		}
	
	
	
		
		
		
		
	}


		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


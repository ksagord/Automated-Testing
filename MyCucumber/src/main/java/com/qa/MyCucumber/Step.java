package com.qa.MyCucumber;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {
	
	
	ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\MyCucumber.html", true);
	
	testy = extent.startTest("Cucumber Test");
	public ChromeDriver driver;
	Home hp = PageFactory.initElements(driver, Home.class);
	

	
	@Given("^the correct web address$")
	public void the_correct_web_address()  {
		testy.log(LogStatus.INFO, "GOing to Practise Selenium Website" );
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.practiceselenium.com/welcome.html");
	    
	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page()  {
		testy.log(LogStatus.INFO, "Clicked on Menu Link" );
		Home hp = PageFactory.initElements(driver, Home.class);
		hp.clickMenu();
		
	  
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() {
		Home hp = PageFactory.initElements(driver, Home.class);
		if (hp.checkList() == true)
		{
			testy.log(LogStatus.PASS, "Can browse a list of products");
		}
		else 
		{
			testy.log(LogStatus.FAIL, "Cannot browse a list of products");
		}
		assertEquals(true, hp.checkList());
		
	    
	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button()  {
		testy.log(LogStatus.INFO, "Clicked on checkout button" );
		Home hp = PageFactory.initElements(driver, Home.class);
		hp.clickCheckout();   
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page()  {
	    String checkoutURL = driver.getCurrentUrl().toString();
	    
	    if (checkoutURL.equals("http://www.practiceselenium.com/check-out.html"))
		{
			testy.log(LogStatus.PASS, "Checkout page shown");
		}
		else 
		{
			testy.log(LogStatus.FAIL, "Cannot see checkout page");
		}
	    
	    assertEquals("http://www.practiceselenium.com/check-out.html",checkoutURL);
	    
	    
	}

}

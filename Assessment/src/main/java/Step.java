import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {
	
public ChromeDriver driver;
ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\Assessment.html", true);
ExtentTest testy = extent.startTest("Assessment Test");
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	
		ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\Assessment.html", true);
		
		ExtentTest testy = extent.startTest("Assessment Test");
		
	}
	
	@After
	public void teardown() {
		driver.quit();
		extent.endTest(testy);
		extent.flush();
	}
	

	@Given("^that you are on the create UserScreen$")
	public void that_you_are_on_the_create_UserScreen()  {
	
		testy.log(LogStatus.INFO, "On the UserScreen" );
		
		driver.get(Constants.websiteURL);
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		hp.login();
		hp.clickManageJenkins();
		
		ManagePage mp = PageFactory.initElements(driver, ManagePage.class);
		mp.clickManageUsers();
		

    
	}

	@When("^the User details are entered on the Create UserScreen$")
	public void the_User_details_are_entered_on_the_Create_UserScreen() {
	
		
		Users user1 = PageFactory.initElements(driver, Users.class);
		user1.clickCreateUser();
		
	}

	@When("^the details are submitted on the Create UserScreen$")
	public void the_details_are_submitted_on_the_Create_UserScreen() {
		testy.log(LogStatus.INFO, "Creating New User" );
		
		AddUSer newUser = PageFactory.initElements(driver, AddUSer.class);
		newUser.addUSer("User1", "pass", "Edna Mode");
	}

	@Then("^the Username should be visible on the UsersScreen$")
	public void the_Username_should_be_visible_on_the_UsersScreen()  {
	    
		Users user1 = PageFactory.initElements(driver, Users.class);
		assertEquals(true, user1.checkUser());
		
		if (user1.checkUser() == true) {
			testy.log(LogStatus.PASS, "New User Created");
		}
		else {
			testy.log(LogStatus.FAIL, "New User Not Created");
		}
		
	}

	@When("^the User details \"([^\"]*)\" username, \"([^\"]*)\" password, \"([^\"]*)\" confirm Password, and \"([^\"]*)\" Fullname are entered on the Create UserScreen$")
	public void the_User_details_username_password_confirm_Password_and_Fullname_are_entered_on_the_Create_UserScreen(String arg1, String arg2, String arg3, String arg4) {
	  
		AddUSer newUser = PageFactory.initElements(driver, AddUSer.class);
		newUser.addUSer(arg1, arg2, arg4);
		
	}

	@Then("^the \"([^\"]*)\" username should be visible on the UsersScreen$")
	public void the_username_should_be_visible_on_the_UsersScreen(String arg1) {
	
	}

	@Given("^the \"([^\"]*)\" username is visible on the UsersScreen$")
	public void the_username_is_visible_on_the_UsersScreen(String arg1) {
	 

	}

	@When("^the \"([^\"]*)\" username is clicked on the UserScreen$")
	public void the_username_is_clicked_on_the_UserScreen(String arg1) {
	
		Users user1 = PageFactory.initElements(driver, Users.class);
		user1.clickkUser();
	}

	@Then("^the User Profile should display the \"([^\"]*)\" username on the ProfileScreen$")
	public void the_User_Profile_should_display_the_username_on_the_ProfileScreen(String arg1) {
		Users user1 = PageFactory.initElements(driver, Users.class);
		String result = user1.checkprofile();
		assertEquals(arg1, result);
		
	}

	@Given("^the \"([^\"]*)\" Username's profile page has been loaded$")
	public void the_Username_s_profile_page_has_been_loaded(String arg1){
	    //I would check of all element on the page are displayed or if there is any errors 
	
	}

	@Given("^the configure button has been clicked on the profile page$")
	public void the_configure_button_has_been_clicked_on_the_profile_page() {
	    // i would find the xpath for configure button and create a method to click the button 
	   
	}

	@When("^I change the old FullName on the Configure Page to a new FullName \"([^\"]*)\"$")
	public void i_change_the_old_FullName_on_the_Configure_Page_to_a_new_FullName(String arg1) {
	    
	  
	}

	@When("^I save the changes to the Configure Page$")
	public void i_save_the_changes_to_the_Configure_Page() {
	  
	 
	}

	@Then("^the Configure Page should show the NewFullName \"([^\"]*)\"$")
	public void the_Configure_Page_should_show_the_NewFullName(String arg1)  {
	  
	 
	}
}

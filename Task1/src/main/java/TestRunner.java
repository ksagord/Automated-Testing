
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

public class TestRunner { 
	
	public ChromeDriver driver;
	
	@Before 
	public void setup() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	
						}
	@Test
	public void testy1() {
		driver.get(Constants.websiteURL);
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		hp.login();
		hp.clickManageJenkins();
		
		ManagePage mp = PageFactory.initElements(driver, ManagePage.class);
		mp.clickManageUsers();
		
		Users user1 = PageFactory.initElements(driver, Users.class);
		user1.clickCreateUser();
		
		AddUSer newUser = PageFactory.initElements(driver, AddUSer.class);
		newUser.addUSer("User1", "pass", "Edna Mode");
		
		assertEquals(true, user1.checkUser());
		
	}

	@After
	public void teardown() {
		driver.quit();
	}
}

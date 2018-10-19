import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Testfile {

	public ChromeDriver driver;
	
	@Before 
	public void setup() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();


	
	}


@After
public void tearDown() {
	driver.quit();
	
}

@Test
public void testy() throws InterruptedException, IOException {
	ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\shoppingwebsitetest.html", true);
	ExtentTest testy;
	
	testy = extent.startTest("Shopping Website Test");
	

	
	testy.log(LogStatus.INFO, "Searching For Item");
	testy.log(LogStatus.INFO, "Clicking on Item");
	
	driver.get("http://automationpractice.com/index.php");
	HomePage hp = PageFactory.initElements(driver, HomePage.class);
	hp.finditem("dress");
	
	if (hp.verify().equals("Model demo_5")) {
		testy.log(LogStatus.PASS, "Correct Item Found");
	}
	else if (!(hp.verify().equals("Model demo_5"))) {
		testy.log(LogStatus.FAIL, "Item Not Found");
	}
	assertEquals("Model demo_5", hp.verify());
	
	extent.endTest(testy);
	extent.flush();

}

}

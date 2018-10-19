import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManagePage {

	@FindBy(xpath = "//*[@id=\"main-panel\"]/div[16]/a/dl/dt")
	private WebElement  manageUsers;
	
	
	
	
	public void clickManageUsers() {
		manageUsers.click();
	}
}



